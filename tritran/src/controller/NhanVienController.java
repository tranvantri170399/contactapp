/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.NhanVien;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class NhanVienController {
    private JButton btnsave;
    private JTextField txtmanv;
    private JTextField txthoten;
    private JTextField txttaikhoan;
    private JTextField txtmatkhau;
    private JRadioButton rboql;
    private JRadioButton rbonv;
    private  JTextField txtmavt;
    private  JTextField txtmaduan;
    private JTextField txtphongban;
    private JTextField txtmadc;

    public NhanVienController(JButton btnsave, JTextField txtmanv, JTextField txthoten, JTextField txttaikhoan, JTextField txtmatkhau, JRadioButton rboql, JRadioButton rbonv, JTextField txtmavt, JTextField txtmaduan, JTextField txtphongban, JTextField txtmadc) {
        this.btnsave = btnsave;
        this.txtmanv = txtmanv;
        this.txthoten = txthoten;
        this.txttaikhoan = txttaikhoan;
        this.txtmatkhau = txtmatkhau;
        this.rboql = rboql;
        this.rbonv = rbonv;
        this.txtmavt = txtmavt;
        this.txtmaduan = txtmaduan;
        this.txtphongban = txtphongban;
        this.txtmadc = txtmadc;
    }

    
    
    public void setView(NhanVien nhanVien){
        txtmanv.setText("" + nhanVien.getMaNV());
        txthoten.setText(nhanVien.getTenNV());
        txttaikhoan.setText(nhanVien.getUsername());
        txtmatkhau.setText(nhanVien.getPassWord());
        if(nhanVien.isAdmin()){
            rboql.setSelected(true);
            rbonv.setSelected(false);
        }else{
            rboql.setSelected(false);
            rbonv.setSelected(true);
        }
}
}
