/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import helper.jdbcHelper;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
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
import model.Project;
import service.DuAnService;
import service.DuAnServiceiml;
import ui.DiaChiJFrame;
import ui.DuAnJFrame;
import utlity.ClassTableModelDA;

/**
 *
 * @author ACER
 */
public class QuanLyDAController {
    private JPanel jpnView;
    private JTextField txtSearch;
    private JButton btnadd;
    private JButton btnxoa;
    private int macd;
    private DuAnService duanservice = null;
    
    private String[] listcolumn = {"STT","Mã Project","ProjectName","Số NV"};
    
    private TableRowSorter<TableModel> rowSorter = null;
    public  QuanLyDAController(){    
    }
    
    public QuanLyDAController(JPanel jpnView, JTextField txtSearch,JButton btnadd,JButton btnxoa) {
        this.jpnView = jpnView;
        this.txtSearch = txtSearch;
        this.btnxoa=btnxoa;
        this.btnadd = btnadd;
        
        this.duanservice = new DuAnServiceiml();
    }
    
       public void setDateToTable(){
           List<Project> listItem = duanservice.getList();
    
        DefaultTableModel model = new ClassTableModelDA().setTableProject(listItem, listcolumn);
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
        scrollPane.setPreferredSize(new Dimension(1000,500));
        
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
        
        table.addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                   if (e.getClickCount()==1) {
                    DefaultTableModel model =  (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    macd = (int) model.getValueAt(selectedRowIndex, 1);
                    }
                   
                   if(e.getClickCount()==2 && table.getSelectedRow() != -3){
                    DefaultTableModel model =  (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    
                    Project project = new Project();
                    project.setProjectID((int)model.getValueAt(selectedRowIndex, 1));
                    project.setProjectName(model.getValueAt(selectedRowIndex, 2).toString());
                    
                    DuAnJFrame frame = new DuAnJFrame(project);
                    frame.setTitle("Thông Tin Dự Án");
                    frame.setResizable(false);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                   }
               }
            
        });
       
       }
        public void setEvent(){
            btnadd.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    DuAnJFrame frame = new DuAnJFrame(new Project());
                    frame.setTitle("Thông Tin Dự Án");
                    frame.setResizable(false);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.loadeid();
                }
                
            });
        }
        
        public void setdelete(){
            btnxoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql="DELETE FROM Projects WHERE ProjectID=?";
		 jdbcHelper.executeUpdate(sql, macd);
                 System.out.println(""+macd);
                 JOptionPane.showMessageDialog(null,"Xóa Thành Công");
                 setDateToTable();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnxoa.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 btnxoa.setBackground(new Color(100,221,23));
            }

            
  
});
        }

}
