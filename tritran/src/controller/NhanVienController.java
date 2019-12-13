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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.NhanVien;
import service.NhanVienService;
import service.NhanVienServiceiml;

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
    //private  JTextField txtmavt;
    private  JComboBox jComboBox4;
    private  JComboBox jComboBox1;
    private  JComboBox jComboBox2;
    private  JComboBox jComboBox3;
    
    private JLabel mess;
    
    private NhanVien nhanVien = null;
    
    private NhanVienService nhanVienService = null;

    public NhanVienController(JButton btnsave, JTextField txtmanv, JTextField txthoten, JTextField txttaikhoan, JTextField txtmatkhau, JRadioButton rboql, JRadioButton rbonv, JComboBox jComboBox4,JComboBox jComboBox1, JComboBox jComboBox2, JComboBox jComboBox3,JLabel mess) {
        this.btnsave = btnsave;
        this.txtmanv = txtmanv;
        this.txthoten = txthoten;
        this.txttaikhoan = txttaikhoan;
        this.txtmatkhau = txtmatkhau;
        this.rboql = rboql;
        this.rbonv = rbonv;
       // this.txtmavt=txtmavt;
        this.jComboBox4 = jComboBox4;
        this.jComboBox1 =jComboBox1;
        this.jComboBox2 = jComboBox2;
        this.jComboBox3 = jComboBox3;
        this.mess =mess;
        
        this.nhanVienService = new NhanVienServiceiml();
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
       // txtmavt.setText(nhanVien.getRoleName());
        jComboBox4.addItem(""+nhanVien.getRoleName());
        jComboBox1.addItem(""+nhanVien.getMaduan());
         jComboBox2.addItem(""+nhanVien.getMaphongban());
         jComboBox3.addItem(""+nhanVien.getMadiachi());

}
    public void setEvent(){
        btnsave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             //   System.out.println(""+itq);
                if(txthoten.getText().length()==0){
                    mess.setText("Vui lòng điền thông tin bắt buộc !");
                }else{
                    nhanVien.setTenNV(txthoten.getText());
                    nhanVien.setUsername(txttaikhoan.getText());
                    nhanVien.setPassWord(txtmatkhau.getText());
                    nhanVien.setAdmin(rboql.isSelected());
//                    int lastID = nhanVienService.createOrUpdate(nhanVien);
//                    if(lastID > 0){
//                    nhanVien.setMaNV(lastID);
//                    txtmanv.setText("#" + lastID);
//                    mess.setText("Cập nhật thành công");
//                    }
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
