/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class jdbcHelper {
    private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
    private static String dburl="jdbc:sqlserver://localhost;database=EmployeeTransferManagement2019"; 
    private static String username="sa"; 
    private static String password="songlong"; 
    
    /*
    Nạp driver 
    */
   public static Connection getConnection(){
        try{
            Connection cons=null;
            Class.forName(driver);
            cons = DriverManager.getConnection(dburl,username,password);
            return cons;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
}
    /*
    * Xây dựng PreparedStatement 
     @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời gọi thủ tục lưu
     @param args là danh sách các giá trị được cung cấp cho các tham số trong câu lệnh sql
     @return PreparedStatement tạo được 
     @throws java.sql.SQLException lỗi sai cú pháp 
    */
    public static PreparedStatement prepareStatement(String sql, Object...args) throws SQLException{
            Connection connection = DriverManager.getConnection(dburl, username, password);
            PreparedStatement ps = null; 
            if(sql.trim().startsWith("{")){
                ps = connection.prepareCall(sql);
            }else{
                ps = connection.prepareStatement(sql);
            }
            for(int i=0;i<args.length;i++){
                ps.setObject(i+1,args[i]);
            }
            return ps;
      }   
    /*
      Thực hiện câu lệnh SQL thao tác (INSERT, UPDATE, DELETE) hoặc thủ tục lưu thao tác dữ liệu 
       @param sql là câu lệnh SQL chứa có thể chứa tham số. Nó có thể là một lời gọi thủ tục lưu 
       @param args là danh sách các giá trị được cung cấp cho các tham số trong câu lệnh sql     
      */
    public static void executeUpdate(String sql,Object...args){  
        try{
            PreparedStatement st = prepareStatement(sql, args);
            try{
                st.executeUpdate();
               // JOptionPane.showMessageDialog(null, "thanh cong");
            }finally{
                st.getConnection().close();
            }
        }catch(SQLException e){
            //throw  new RuntimeException(e);
            e.printStackTrace();
        }
}
    /*
     Thực hiện câu lệnh SQL truy vấn (SELECT) hoặc thủ tục lưu truy vấn dữ liệu 
    param sql là câu lệnh sql chưa có thể chứa tham số. Nó có thể là một lời gọi thủ tục lưu
     @param args là danh sách các giá trị được cung cấp cho các tham số trong câu lệnh sql 
    */
    public static ResultSet executeQuery(String sql, Object...args){
        try{
            PreparedStatement st = prepareStatement(sql, args);
            return st.executeQuery();
        }catch(SQLException e){
            throw  new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.println(c.toString());
        c.close();
    }
}
