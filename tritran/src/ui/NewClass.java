/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class NewClass {
    public static void main(String[] args) {
    String pattenrn = "dd/mm/yyyy";
    String pattenrn3="EEEEE,dd-MMMMM yyyy ";
    String pattenrn4="dd-MM-yy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattenrn3,new Locale("vi","VN"));
        System.out.println(dateFormat.format(new Date()));
    }
    
    
}
