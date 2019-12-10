/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utlity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class ClassTableModel {
    public DefaultTableModel setTableNhanVien(List<NhanVien> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 10 ? Boolean.class : String.class;
            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for (int i = 0; i < rows; i++) {
                NhanVien nhanVien = listItem.get(i);
                obj = new  Object[columns];  
                
                obj[0] = nhanVien.getMaNV();
                obj[1] = (i+1);
                obj[2] = nhanVien.getTenNV();
                obj[3] = nhanVien.getUsername();
                obj[4] = nhanVien.getPassWord();
                obj[5] = nhanVien.isAdmin() == true? "Quản lý" : "Nhân Viên";
                obj[6] = nhanVien.getRoleName();
                obj[7] = nhanVien.getMaduan();
                obj[8] = nhanVien.getMaphongban();
                obj[9] = nhanVien.getMadiachi();
                dtm.addRow(obj);
                
            }
        }
        return dtm;
    }
}
