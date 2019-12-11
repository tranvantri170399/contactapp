/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utlity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.PhongBan;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class ClassTableModelPB {
     public DefaultTableModel setTablePhongBan(List<PhongBan> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 4 ? Boolean.class : String.class;
            }
            
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows > 0){
            for (int i = 0; i < rows; i++) {
                PhongBan phongBan = listItem.get(i);
                obj = new  Object[columns];  
                 obj[0] = (i+1);
                obj[1] = phongBan.getDepartmentID();             
                obj[2] = phongBan.getDepartmentName();
                obj[3] = phongBan.getNumOfEmployee();

                dtm.addRow(obj);
                
            }
        }
        return dtm;
    }
}
