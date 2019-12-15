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
import service.PhongBanService;
import service.PhongBanServiceiml;

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
    
    private PhongBanService phongBanService = null;

    public PhongBanController() {
    }

    public PhongBanController(JButton btnsave,JTextField txtmapb, JTextField txttenpb, JLabel mess) {
        this.btnsave = btnsave;
        this.txtmapb = txtmapb;
        this.txttenpb = txttenpb;
        this.mess = mess;
        
        this.phongBanService = new PhongBanServiceiml();
    }
    
    public void setView(PhongBan phongBan){
        this.phongBan = phongBan;
        txtmapb.setText("" +phongBan.getDepartmentID());
        txttenpb.setText(phongBan.getDepartmentName());
    }
    public void setEvent(){
        btnsave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(txttenpb.getText().length()==0){
                    mess.setText("Vui lòng điền thông tin bắt buộc !");
                }else{
                    phongBan.setDepartmentName(txttenpb.getText());
                    int lastID = phongBanService.createOrUpdate(phongBan);
                    if(lastID != 0){
                    phongBan.setDepartmentID(lastID);
                    txtmapb.setText("" + phongBan.getDepartmentID());
                    mess.setText("OK");                   
                }else{
                        mess.setText("có lỗi vui lòng thử lại");
                    }
                }
            }
            
        });
    }
}
