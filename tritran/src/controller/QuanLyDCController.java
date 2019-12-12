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
import model.DiaChi;
import service.DiaChiService;
import service.DiaChiServiceiml;
import utlity.ClassTableModelDC;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class QuanLyDCController {
    private JPanel pnView;
    private JTextField txtSearch;
    
    private DiaChiService diaChiService = null;
    
    private String[] listcolumn = {"STT","1","2", "3","4"};
    
    private TableRowSorter<TableModel> rowSorter = null;

    public QuanLyDCController() {
    }

    public QuanLyDCController(JPanel pnView, JTextField txtSearch) {
        this.pnView = pnView;
        this.txtSearch = txtSearch;
        
        this.diaChiService = new DiaChiServiceiml();
    }
    
    public void setDateToTable(){
        List<DiaChi> listItem = diaChiService.getList();
    
        DefaultTableModel model = new ClassTableModelDC().setTableDiaChi(listItem, listcolumn);
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
        
        pnView.removeAll();
        pnView.setLayout(new BorderLayout());
        pnView.add(scrollPane);
        pnView.validate();
        pnView.repaint();
}
           


}
