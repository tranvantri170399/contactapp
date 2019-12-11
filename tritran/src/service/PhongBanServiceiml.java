/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import DAO.PhongBanDAO;
import DAO.PhongBanDAOiml;
import java.util.List;
import model.PhongBan;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class PhongBanServiceiml implements PhongBanService{
    private PhongBanDAO phongBanDAO = null;
    
    public PhongBanServiceiml(){
        phongBanDAO = new PhongBanDAOiml();
    }

    @Override
    public List<PhongBan> getList() {
        return phongBanDAO.getList();
    }

    @Override
    public int createOrUpdate(PhongBan phongBan) {
        return phongBanDAO.createOrUpdate(phongBan);
    }
    
}
