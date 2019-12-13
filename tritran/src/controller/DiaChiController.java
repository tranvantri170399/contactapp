/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.DiaChi;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class DiaChiController {
    private JButton btnsave;
    private JTextField txtmadc;
    private JTextField txttendc;
    private JTextField txtla;
    private JLabel mess;
    
    private DiaChi diaChi = null;
    
    public DiaChiController(){       
}

    public DiaChiController(JButton btnsave, JTextField txtmadc, JTextField txttendc, JTextField txtla, JLabel mess) {
        this.btnsave = btnsave;
        this.txtmadc = txtmadc;
        this.txttendc = txttendc;
        this.txtla = txtla;
        this.mess = mess;
    }
    public void setView(DiaChi diaChi){
        this.diaChi = diaChi;
        txtmadc.setText(""+diaChi.getLocationID());
        txttendc.setText(diaChi.getLocationName());
        txtla.setText(""+diaChi.getLocationAllowance());
    }
}
