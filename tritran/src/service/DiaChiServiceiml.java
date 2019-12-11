/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.DiaChiDAO;
import DAO.DiaChiDAOiml;
import java.util.List;
import model.DiaChi;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class DiaChiServiceiml implements DiaChiService{
    
    private DiaChiDAO diaChiDAO = null;
    public DiaChiServiceiml(){
        diaChiDAO = new DiaChiDAOiml();
    }
    
    @Override
    public List<DiaChi> getList() {
         return diaChiDAO.getList();
    }

    @Override
    public int createOrUpdate(DiaChi diaChi) {
        return diaChiDAO.createOrUpdate(diaChi);
    }
    
}
