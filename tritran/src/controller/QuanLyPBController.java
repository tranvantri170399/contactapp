/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.PhongBan;
import service.PhongBanService;
import service.PhongBanServiceiml;
import utlity.ClassTableModelDA;
import utlity.ClassTableModelPB;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class QuanLyPBController {
     private JPanel jpnView;
    private JTextField txtSearch;
    
    
    private PhongBanService phongBanService = null;
    
    private String[] listcolumn = {"STT","Mã Phòng Ban","Tên Phòng", "Số NV"};
    
    private TableRowSorter<TableModel> rowSorter = null;
    
    public  QuanLyPBController(){    
    }

    public QuanLyPBController(JPanel jpnView, JTextField txtSearch) {
        this.jpnView = jpnView;
        this.txtSearch = txtSearch;
        this.phongBanService = new PhongBanServiceiml();
    }
    public void setDateToTable(){
        List<PhongBan> listItem = phongBanService.getList();
    
        DefaultTableModel model = new ClassTableModelPB().setTablePhongBan(listItem, listcolumn);
        JTable table = new JTable(model);
        
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        
        txtSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = txtSearch.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = txtSearch.getText();
                if(text.trim().length() == 0){
                    rowSorter.setRowFilter(null);
                }else{
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

     });
         
        table.getColumnModel().getColumn(0).setMinWidth(50);
        table.getColumnModel().getColumn(0).setMaxWidth(50);
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        
        
        table.getTableHeader().setFont(new Font("Arrial",Font.BOLD,14));
        table.getTableHeader().setPreferredSize(new Dimension(100,50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(2000,1000));
        
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
}
}

