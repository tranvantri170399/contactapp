/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class loginDTO {
    private  String manv; 
    private  String matKhau;
    private boolean admin;

    public loginDTO() {
    }

    public loginDTO(String manv, String matKhau, boolean admin) {
        this.manv = manv;
        this.matKhau = matKhau;
        this.admin = admin;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
}
