/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utlity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import model.Project;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class ClassTableModelDA {
    public DefaultTableModel setTableProject(List<Project> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                return columnIndex == 10 ? Boolean.class : String.class;
//            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for (int i = 0; i < rows; i++) {
                Project nhanVien = listItem.get(i);
                obj = new  Object[columns];  
                 obj[0] = (i+1);
                obj[1] = nhanVien.getProjectID();
               
                obj[2] = nhanVien.getProjectName();
                obj[3] = nhanVien.getNumOfEmployee();

                dtm.addRow(obj);
                
            }
        }
        return dtm;
    }
}
