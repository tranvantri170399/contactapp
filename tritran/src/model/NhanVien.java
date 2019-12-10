/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class NhanVien {
    private int MaNV;
    private String TenNV;
    private String Username;
    private String PassWord;
    private boolean Admin;
    private String RoleName;
    private int Maduan;
    private int Maphongban;
    private int Madiachi;

    public NhanVien() {
    }

    public NhanVien(int MaNV, String TenNV, String Username, String PassWord, boolean Admin, String RoleName, int Maduan, int Maphongban, int Madiachi) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.Username = Username;
        this.PassWord = PassWord;
        this.Admin = Admin;
        this.RoleName = RoleName;
        this.Maduan = Maduan;
        this.Maphongban = Maphongban;
        this.Madiachi = Madiachi;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
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

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
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
