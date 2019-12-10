/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
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
    
    private JLabel mess;
    
    private NhanVien nhanVien = null;

    public NhanVienController(JButton btnsave, JTextField txtmanv, JTextField txthoten, JTextField txttaikhoan, JTextField txtmatkhau, JRadioButton rboql, JRadioButton rbonv, JTextField txtmavt, JTextField txtmaduan, JTextField txtphongban, JTextField txtmadc,JLabel mess) {
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
        this.mess =mess;
    }

    
    
    public void setView(NhanVien nhanVien){
        this.nhanVien = nhanVien;
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
        txtmaduan.setText(""+nhanVien.getMaduan());
        txtphongban.setText(""+nhanVien.getMaphongban());
        txtmadc.setText(""+nhanVien.getMadiachi());
}
    public void setEvent(){
        btnsave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txthoten.getText().length()==0){
                    mess.setText("Vui lòng điền thông tin bắt buộc !");
                }else{
                    nhanVien.setTenNV(txthoten.getText());
                    nhanVien.setUsername(txttaikhoan.getText());
                    nhanVien.setPassWord(txtmatkhau.getText());
                    nhanVien.setAdmin(rboql.isSelected());
                    nhanVien.setRoleID(Integer.parseInt(txtmavt.getText()));
                    nhanVien.setMaduan(0);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnsave.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 btnsave.setBackground(new Color(100,221,23));
            }
            
            
});
    }
}
