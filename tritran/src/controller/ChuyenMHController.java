/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.DMBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.QLDAJPanel;
import ui.QLDCJPanel;
import ui.QLNVJPanel;
import ui.QLPBJPanel;
import ui.TCJPanel;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class ChuyenMHController {
    private JPanel root;
    private String kindSelected="";
    
    private List<DMBean> listItem =null;

    public ChuyenMHController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
  
    public void setView(JPanel jpnItem, JLabel lblItem){
        kindSelected="TrangChu";
        jpnItem.setBackground(new Color(0, 92, 230));
        lblItem.setBackground(new Color(0, 92, 230));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TCJPanel());
        root.validate();
        root.repaint();
        
}
    public void setEvent(List<DMBean> listItem){
        this.listItem = listItem;
        for (DMBean item : listItem) {
            item.getJlb().addMouseListener(new LableEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }
    class LableEvent implements MouseListener{
        private JPanel node;
        
        private String kind;        
        private JPanel jpnItem;
        private JLabel lblItem;

        public LableEvent(String kind, JPanel jpnItem, JLabel lblItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.lblItem = lblItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(kind){
                case "TrangChu":
                    node = new TCJPanel();
                    break;
                case "QuanLyNV":
                    node = new QLNVJPanel();
                    break;
                case "QuanLyDA":
                    node = new QLDAJPanel();
                    break;
                case "QuanLyPB":
                    node = new QLPBJPanel();
                    break;
                case "QuanLyDC":
                    node = new QLDCJPanel();
                    break;
                    default:
                        break;
                        
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(0, 92, 230));
            lblItem.setBackground(new Color(0, 92, 230));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        jpnItem.setBackground(new Color(0, 92, 230));
        lblItem.setBackground(new Color(0, 92, 230));
        }

        @Override
        public void mouseExited(MouseEvent e) {
        if(!kindSelected.equalsIgnoreCase(kind)){
            jpnItem.setBackground(new Color(0, 102, 255));
            lblItem.setBackground(new Color(0, 102, 255));
        }
        }       
    }
    private void setChangeBackground(String kind){
        for(DMBean item : listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(0, 92, 230));
                item.getJlb().setBackground(new Color(0, 92, 230));
            }else{
                item.getJpn().setBackground(new Color(0, 102, 255));
                item.getJlb().setBackground(new Color(0, 102, 255));
                
            }
        }
    }
}
