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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;


/**
 
 * @author Nguyễn Văn Tuấn
 */
public class NhanVienDAOiml implements NhanVienDAO{

    @Override
    public List<NhanVien> getList() {
        try{
        Connection cons = jdbcHelper.getConnection();
        String sql ="  select [EmployeeID]\n" +
"      ,[EmployeeName]\n" +
"      ,[Username]\n" +
"      ,[Password]\n" +
"      ,[IsSystemAdmin]\n" +
"      ,[RoleName]\n" +
"      ,[ProjectID]\n" +
"      ,[DepartmentID]\n" +
"      ,[LocationID]\n" +
"  FROM Employees Inner join Roles on Employees.RoleID=Roles.RoleID";
        List <NhanVien> list = new ArrayList<>();
        PreparedStatement ps = cons.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            NhanVien nv = new NhanVien();
            nv.setMaNV(rs.getInt("EmployeeID"));
            nv.setTenNV(rs.getString("EmployeeName"));
            nv.setUsername(rs.getString("Username"));
            nv.setPassWord(rs.getString("Password"));
            nv.setAdmin(rs.getBoolean("IsSystemAdmin"));
            nv.setRoleName(rs.getString("RoleName"));
            nv.setMaduan(rs.getInt("ProjectID"));
            nv.setMaphongban(rs.getInt("DepartmentID"));
            nv.setMadiachi(rs.getInt("LocationID"));
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
    public int createOrUpdate(NhanVien nhanVien){
    try{
        Connection cons = jdbcHelper.getConnection();
        String sql = "INSERT INTO Employees(EmployeeID,EmployeeName,Username ,Password ,IsSystemAdmin ,RoleID ,ProjectID ,DepartmentID ,LocationID)";
        PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(1, nhanVien.getMaNV());
        ps.setString(2, nhanVien.getTenNV());
        ps.setString(3, nhanVien.getUsername());
        ps.setString(4, nhanVien.getPassWord());
        ps.setBoolean(5, nhanVien.isAdmin());
        ps.setString(6, nhanVien.getRoleName());
        ps.setInt(7, nhanVien.getMaduan());
        ps.setInt(8, nhanVien.getMaphongban());
        ps.setInt(9, nhanVien.getMadiachi());
        ps.execute();
        ResultSet rs = ps.getGeneratedKeys();
        int generatedkety = 0;
        if (rs.next()) {
            generatedkety = rs.getInt(1);
            }
            ps.close();
            cons.close();
        return generatedkety;
    }catch(Exception e){
        e.printStackTrace();
    }
    return  0;
    }
    
    public static void main(String[] args) {
        NhanVienDAO nhanVienDAO = new NhanVienDAOiml();
        System.out.println(nhanVienDAO.getList());
    }
    
    public NhanVien findById(String username){
        String sql="Select * from Employees WHERE Username=?";
        List<NhanVien> list = select(sql, username);
        return list.size()>0?list.get(0):null;
    }
    
    private List<NhanVien> select(String sql,Object...arg){
        List<NhanVien> List = new ArrayList<>();
        try{
            ResultSet rs = null;
            try{
                rs = jdbcHelper.executeQuery(sql, arg);
                while (rs.next()){
                    NhanVien model = readFromResultSet(rs);
                    List.add(model);
                }
            }finally{
                rs.getStatement().getConnection().close();
            }        
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return List;
    }
    
    private NhanVien readFromResultSet(ResultSet rs) throws SQLException{
        NhanVien model =new NhanVien();
        model.setMaNV(rs.getInt("EmployeeID"));
        model.setTenNV(rs.getString("EmployeeName"));
        model.setUsername(rs.getString("Username"));
        model.setPassWord(rs.getString("Password"));
        model.setAdmin(rs.getBoolean("IsSystemAdmin"));
//        model.setRoleName(rs.getString("RoleName"));
        model.setMaduan(rs.getInt("ProjectID"));
        model.setMaphongban(rs.getInt("DepartmentID"));
        model.setMadiachi(rs.getInt("LocationID"));
        return model;
    }
    }

