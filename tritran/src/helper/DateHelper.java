/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class DateHelper {
      /*
     Lấy thời gian hiện tại
     @return Date kết quả 
    */
    public static Date now(){
        return new Date();
    }
    static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("MM/dd/yyyy"); 
       /*     
        Chuyển đổi String sang Date
        @param date là String cần chuyển
        @param pattern là định dạng thời gian
        @return Date kết quả 
     */
    public static  Date toDate(String date, String...pattern){
        try{
            if(pattern.length>0){
                DATE_FORMATER.applyPattern(pattern[0]);
            }if(date == null){
                return DateHelper.now();
            }
            return DATE_FORMATER.parse(date);
    }catch(Exception e){
        throw new RuntimeException(e);
    }

}
    /* 
    Chuyển đổi từ Date sang String 
    @param date là Date cần chuyển đổi      
    @param pattern là định dạng thời gian      
    @return String kết quả 
    */
    public static String toString(Date date, String...pattern) {
        if(pattern.length > 0){
            DATE_FORMATER.applyPattern(pattern[0]);
        }if(date==null){
            date = DateHelper.now();
        } 
           return DATE_FORMATER.format(date);
    }
  /*
    Bổ sung số ngày vào thời gian 
    @param date thời gian hiện có 
    @param days số ngày cần bổ sung váo date 
    @return Date kết quả 
    */
    public static Date addDates(Date date, int days){
        date.setTime(date.getTime() + days*24*60*60*1000); 
        return date;
}  /*
    Bổ sung số ngày vào thời gian hiện hành 
    @param days số ngày cần bổ sung vào thời gian hiện tại 
    @return Date kết quả 
    */
    public static Date add(int days){
        Date now = DateHelper.now();
        now.setTime(now.getTime()+days*24*60*60*1000);
        return now;
    }
}

