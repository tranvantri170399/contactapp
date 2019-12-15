/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import helper.jdbcHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.PhongBan;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class PhongBanDAOiml implements PhongBanDAO{
        @Override
    public List<PhongBan> getList() {
         try{
        Connection cons = jdbcHelper.getConnection();
        String sql ="SELECT dbo.Departments.DepartmentID, dbo.Departments.DepartmentName, COUNT(dbo.Employees.EmployeeID) AS NumOfEmployee \n" +
"  FROM dbo.Departments, dbo.Employees\n" +
"  WHERE dbo.Departments.DepartmentID = dbo.Employees.DepartmentID\n" +
"  GROUP BY dbo.Departments.DepartmentID, dbo.Departments.DepartmentName\n" +
"  UNION\n" +
"  SELECT dbo.Departments.DepartmentID, dbo.Departments.DepartmentName,0 AS NumOfEmployee\n" +
"  FROM dbo.Departments,dbo.Employees\n" +
"  WHERE dbo.Departments.DepartmentID not in(select dbo.Employees.DepartmentID from dbo.Employees)\n" +
"  GROUP BY dbo.Departments.DepartmentID, dbo.Departments.DepartmentName";
        List <PhongBan> list = new ArrayList<>();
        PreparedStatement ps = cons.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            PhongBan nv = new PhongBan();
            nv.setDepartmentID(rs.getInt("DepartmentID"));
            nv.setDepartmentName(rs.getString("DepartmentName"));
            nv.setNumOfEmployee(rs.getInt("NumOfEmployee"));
            list.add(nv);
        }
        ps.close();
        rs.close();
        return list;
    }catch(Exception e){
        e.printStackTrace();
    }
        return null;
    }

    @Override
    public int createOrUpdate(PhongBan phongBan) {
      try{
            Connection cons = jdbcHelper.getConnection();
            String sql = "update Departments \n" +
"set DepartmentName = ?\n" +
"where DepartmentID = ?\n" +
"\n" +
"if @@ROWCOUNT = 0\n" +
"  insert into Departments(DepartmentID,DepartmentName)\n" +
"  VALUES (?,?)";
//            String sql = "insert into Departments(DepartmentID,DepartmentName) VALUES (?,?) ON DUPLICATE KEY UPDATE DepartmentName = VALUES(DepartmentName)";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, phongBan.getDepartmentID());
            ps.setString(2, phongBan.getDepartmentName());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 3;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
      }catch(Exception e){
          e.printStackTrace();
      }
      return 0;
    }
    public static void main(String[] args) {
        PhongBanDAO phongBanDAO = new PhongBanDAOiml();
        System.out.println(phongBanDAO.getList());
    }
    
}
