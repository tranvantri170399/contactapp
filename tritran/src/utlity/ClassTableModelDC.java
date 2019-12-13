/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utlity;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.DiaChi;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class ClassTableModelDC {
    public DefaultTableModel setTableDiaChi(List<DiaChi> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if(rows>0){
            for(int i = 0;i < rows; i++){
                DiaChi diaChi = listItem.get(i);
                obj = new Object[columns];
                obj[0] = (i+1);
                obj[1] = diaChi.getLocationID();
                obj[2] = diaChi.getLocationName();
                obj[3] = diaChi.getLocationAllowance();
                obj[4] = diaChi.getNumOfEmployee();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
