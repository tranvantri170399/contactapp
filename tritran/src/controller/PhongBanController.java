/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.PhongBan;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class PhongBanController {
    private JButton btnsave;
    private JTextField txtmapb;
    private JTextField txttenpb;
    
    private JLabel mess;
    
    private PhongBan phongBan = null;

    public PhongBanController() {
    }

    public PhongBanController(JButton btnsave,JTextField txtmapb, JTextField txttenpb, JLabel mess) {
        this.btnsave = btnsave;
        this.txtmapb = txtmapb;
        this.txttenpb = txttenpb;
        this.mess = mess;
    }
    
    public void setView(PhongBan phongBan){
        this.phongBan = phongBan;
        txtmapb.setText("" +phongBan.getDepartmentID());
        txttenpb.setText(phongBan.getDepartmentName());
    }
//    public void setEvent(){
//        btnsave.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if(txtmapb.getText().length()==0){
//                    mess.setText("Vui lòng điền thông tin bắt buộc !");
//                }else{
//                    phongBan.setDepartmentID(Integer.parseInt(txtmapb.getText()));
//                    phongBan.setDepartmentName(txttenpb.getText());
//                     mess.setText("Cập nhật thành công");
////                    }
//                }
//            }
//            
//        });
//    }
}
