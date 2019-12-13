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
public class Connhanvien {
    private String TenNV;
    private String Username;
    private String PassWord;
    private boolean Admin;
    private int RoleID;
    private int Maduan;
    private int Maphongban;
    private int Madiachi;

    public Connhanvien() {
    }

    public Connhanvien( String TenNV, String Username, String PassWord, boolean Admin, int RoleID, int Maduan, int Maphongban, int Madiachi) {
        this.TenNV = TenNV;
        this.Username = Username;
        this.PassWord = PassWord;
        this.Admin = Admin;
        this.RoleID = RoleID;
        this.Maduan = Maduan;
        this.Maphongban = Maphongban;
        this.Madiachi = Madiachi;
    }



    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

    public boolean isAdmin() {
        return Admin;
    }

    public void setAdmin(boolean Admin) {
        this.Admin = Admin;
    }

    public int getRoleID() {
        return RoleID;
    }

    public void setRoleID(int RoleID) {
        this.RoleID = RoleID;
    }

    public int getMaduan() {
        return Maduan;
    }

    public void setMaduan(int Maduan) {
        this.Maduan = Maduan;
    }

    public int getMaphongban() {
        return Maphongban;
    }

    public void setMaphongban(int Maphongban) {
        this.Maphongban = Maphongban;
    }

    public int getMadiachi() {
        return Madiachi;
    }

    public void setMadiachi(int Madiachi) {
        this.Madiachi = Madiachi;
    }
    
    
}
