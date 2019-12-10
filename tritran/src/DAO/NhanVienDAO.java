/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import model.NhanVien;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public interface NhanVienDAO {
    public List<NhanVien> getList();
    
    public int createOrUpdate(NhanVien nhanVien);
}
