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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;
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
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Connhanvien;
import model.NhanVien;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import service.NhanVienService;
import service.NhanVienServiceiml;
import ui.NhanVienJFrame;
import utlity.ClassTableModel;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class QuanLyNVController {
    private int itq;
    private JPanel jpnView;
    private JButton btnAdd;
    private JButton btnxoa;
    private JButton btnprint;
    private JTextField txtSearch;
    private int index;
    private int macd;
    
    private NhanVienService nhanVienSercvice = null;
    
    private String[] listcolumn = {"STT","Mã NV", "Tên NV", "Tài khoản", "Mật khẩu", "Admin", "RoleName", "Mã dự án", "Mã phòng", "Địa chỉ"};
    
    private TableRowSorter<TableModel> rowSorter = null;
    
    public QuanLyNVController() {
    }

    public QuanLyNVController(JPanel jpnView, JButton btnAdd, JTextField txtSearch,JButton btnxoa,JButton btnprint) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.txtSearch = txtSearch;
        this.btnxoa=btnxoa;
        this.btnprint=btnprint;
        
        this.nhanVienSercvice = new NhanVienServiceiml();
    }

    
    
    public void setDateToTable(){
        List<NhanVien> listItem = nhanVienSercvice.getList();
    
        DefaultTableModel model = new ClassTableModel().setTableNhanVien(listItem, listcolumn);
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
        
         
        table.getColumnModel().getColumn(1).setMinWidth(0);
        table.getColumnModel().getColumn(1).setMaxWidth(0);
        table.getColumnModel().getColumn(1).setPreferredWidth(0);
        
        table.getColumnModel().getColumn(5).setMinWidth(0);
        table.getColumnModel().getColumn(5).setMaxWidth(0);
        table.getColumnModel().getColumn(5).setPreferredWidth(0);
        
        
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
        
        table.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount()==1) {
                    DefaultTableModel model =  (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    macd = (int) model.getValueAt(selectedRowIndex, 0);
                }

                if(e.getClickCount()==2 && table.getSelectedRow() != -3){
                    DefaultTableModel model =  (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
                    //System.out.println(selectedRowIndex);
                    
                    NhanVien nhanVien = new NhanVien();
                    nhanVien.setMaNV((int) model.getValueAt(selectedRowIndex, 0));
                    nhanVien.setTenNV(model.getValueAt(selectedRowIndex, 2).toString());
                    nhanVien.setUsername(model.getValueAt(selectedRowIndex, 3) !=null ?
                                    model.getValueAt(selectedRowIndex,3).toString():"");
                    nhanVien.setPassWord(model.getValueAt(selectedRowIndex, 4)!=null ?
                                    model.getValueAt(selectedRowIndex,4).toString():"");
                    nhanVien.setAdmin(model.getValueAt(selectedRowIndex,5).toString().equalsIgnoreCase("Quản Lý"));
                    nhanVien.setRoleName(model.getValueAt(selectedRowIndex, 6) !=null ?
                                    model.getValueAt(selectedRowIndex,6).toString():"");
                    nhanVien.setMaduan((int) model.getValueAt(selectedRowIndex,7));
                    nhanVien.setMaphongban((int) model.getValueAt(selectedRowIndex,8));
                    nhanVien.setMadiachi((int) model.getValueAt(selectedRowIndex,9));
                    
                    NhanVienJFrame frame = new NhanVienJFrame(nhanVien);
                    frame.setTitle("Thông Tin Nhân Viên");
                    frame.setResizable(false);
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    frame.loadimage();
                    frame.setimage();
                    
                    
                }
            }
            
        });       
    }
    public void setEvent(){
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                NhanVienJFrame frame = new NhanVienJFrame(new NhanVien());
                frame.setTitle("Thông tin nhân viên");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
                frame.loadeid();
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 btnAdd.setBackground(new Color(100,221,23));
            }

            
  
});
    }
    public void delete(){
            btnxoa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql="DELETE FROM Image WHERE EmployeeID=?";
		 jdbcHelper.executeUpdate(sql, macd);
                 System.out.println(""+macd);
                 
                String sqll="DELETE FROM Employees WHERE EmployeeID=?";
		 jdbcHelper.executeUpdate(sqll, macd); 
                 JOptionPane.showMessageDialog(null,"xoa thanh cong :))");
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
    //print
        public void Print(){
            btnprint.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("b1");
                XSSFWorkbook workbook= new XSSFWorkbook();
                XSSFSheet sheet= workbook.createSheet("Nhan Vien");
                
                XSSFRow row = null;
                org.apache.poi.ss.usermodel.Cell cell= null;
                
                row= sheet.createRow(3);
                
                cell= row.createCell(0,CellType.STRING);
                cell.setCellValue("STT");
                
                cell= row.createCell(1,CellType.STRING);
                cell.setCellValue("Ma Nhan Vien");
                
                cell= row.createCell(2,CellType.STRING);
                cell.setCellValue("Ten Nhan Vien");
                
                cell= row.createCell(3,CellType.STRING);
                cell.setCellValue("Tai khoan");
                
                cell= row.createCell(4,CellType.STRING);
                cell.setCellValue("Mat Khau");
                
                
                cell= row.createCell(5,CellType.STRING);
                cell.setCellValue("ten du an");
               List<NhanVien> listItem = nhanVienSercvice.getList();
               
                if (listItem!= null) {
                    System.out.println("b2");
                    int s = listItem.size();
                    for (int i = 0; i < s; i++) {
                        NhanVien nv = listItem.get(i);
                        row=sheet.createRow(4+i);
                        
                        cell=row.createCell(0, CellType.NUMERIC);
                        cell.setCellValue(i+1);
                         
                        cell= row.createCell(1,CellType.STRING);
                        cell.setCellValue(nv.getMaNV()); 
                        
                        cell= row.createCell(2,CellType.STRING);
                        cell.setCellValue(nv.getTenNV()); 
                        
                        cell= row.createCell(3,CellType.STRING);
                        cell.setCellValue(nv.getUsername());
                        
                        cell= row.createCell(4,CellType.STRING);
                        cell.setCellValue(nv.getPassWord());
                        
                        cell= row.createCell(5,CellType.STRING);
                        cell.setCellValue(nv.getRoleName());
                    }
                     FileOutputStream out = null;
                    try {
                        out = new FileOutputStream(new File("D:/hv.xlsx"));
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(QuanLyNVController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        workbook.write(out);
                    } catch (IOException ex) {
                        Logger.getLogger(QuanLyNVController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        out.close();
                    } catch (IOException ex) {
                        Logger.getLogger(QuanLyNVController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnprint.setBackground(new Color(0,200,83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 btnprint.setBackground(new Color(100,221,23));
            }

            
  
});
    }
}

