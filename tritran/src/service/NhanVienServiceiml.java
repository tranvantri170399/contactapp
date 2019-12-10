/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.NhanVienDAO;
import DAO.NhanVienDAOiml;
import java.util.List;
import model.NhanVien;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class NhanVienServiceiml implements NhanVienService{
     
    private NhanVienDAO nhanVienDao = null;
    
    public NhanVienServiceiml(){
        nhanVienDao = new NhanVienDAOiml();
    }
    @Override
    public List<NhanVien> getList() {
        return nhanVienDao.getList();
    }

    @Override
    public int createOrUpdate(NhanVien nhanVien) {
        return nhanVienDao.createOrUpdate(nhanVien);
    }
    
}
