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
import model.DiaChi;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class DiaChiDAOiml implements DiaChiDAO{

    @Override
    public List<DiaChi> getList() {
        try{
        Connection cons = jdbcHelper.getConnection();
        String sql ="SELECT Locations.*,COUNT(Employees.EmployeeID) AS NumOfEmployee\n" +
"                FROM Locations, Employees\n" +
"                WHERE Locations.LocationID = Employees.LocationID\n" +
"                   GROUP BY Locations.LocationID, Locations.LocationName,Locations.LocationAllowance\n" +
"                   UNION\n" +
"                   SELECT Locations.*,0 AS NumOfEmployee\n" +
"                   FROM Locations,Employees\n" +
"                   WHERE Locations.LocationID not in(SELECT Employees.LocationID FROM Employees )\n" +
"                   GROUP BY Locations.LocationID, Locations.LocationName,Locations.LocationAllowance";
        List <DiaChi> list = new ArrayList<>();
        PreparedStatement ps = cons.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            DiaChi nv = new DiaChi();
            nv.setLocationID(rs.getInt("LocationID"));
            nv.setLocationName(rs.getString("LocationName"));
            nv.setLocationAllowance(rs.getFloat("LocationAllowance"));
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
    public int createOrUpdate(DiaChi diaChi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        DiaChiDAO diaChiDAO = new DiaChiDAOiml();
        System.out.println(diaChiDAO.getList());
    }
    
}
