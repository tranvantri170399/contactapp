/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Project;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class DuAnController {
    private JButton btnsave;
    private JTextField txtmada;
    private JTextField txttenda;

    
    private JLabel mess;
    private Project project = null;
    public DuAnController() {
    }

    public DuAnController(JButton btnsave, JTextField txtmada, JTextField txttenda, JLabel mess) {
        this.btnsave = btnsave;
        this.txtmada = txtmada;
        this.txttenda = txttenda;
        this.mess = mess;
    }
    
    public void setView(Project project){
        this.project = project;
        txtmada.setText(""+project.getProjectID());
        txttenda.setText(project.getProjectName());
    }
}
