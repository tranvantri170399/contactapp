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
        String sql ="";
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


}
