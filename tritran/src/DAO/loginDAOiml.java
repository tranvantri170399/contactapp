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
import model.loginDTO;

/**
 *
 * @author ACER
 */
public class loginDAOiml implements login{

    @Override
    public List<loginDTO> getList() {
        try{
        Connection cons = jdbcHelper.getConnection();
        String sql ="";
        List <loginDTO> list = new ArrayList<>();
        PreparedStatement ps = cons.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            loginDTO nv = new loginDTO();
            //nv.setManv(rs.getInt("EmployeeID"));
            nv.setMatKhau(rs.getString("EmployeeName"));
            nv.setMatKhau(rs.getString("Username"));
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
    public int createOrUpdate(loginDTO logindto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
