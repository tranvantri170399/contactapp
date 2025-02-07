/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import helper.jdbcHelper;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.ImageIcon;
import model.Image;
import model.NhanVien;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class TCJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TCJPanel
     */
    public TCJPanel() {
        initComponents();
        new Thread(){
        @Override
        public void run() {
         while(true){
             try {
                 Date now=new Date();
                 SimpleDateFormat sim=new SimpleDateFormat();
                 sim.applyPattern("hh:mm:ss aa");
                 String time =sim.format(now);
                 lbldongho.setText(time);
                 Thread.sleep(1000);
             
             } catch (Exception ex) {
                break;
             }    
    }
    }
  }.start();
        date();
    }
private String filename=null;
	private byte[] personimage;
        ByteArrayOutputStream bos;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btndoimk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbldongho = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblhiendl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rboql = new javax.swing.JRadioButton();
        rbonv = new javax.swing.JRadioButton();
        txtmanv = new javax.swing.JLabel();
        txttennv = new javax.swing.JLabel();
        txtmada = new javax.swing.JLabel();
        txtpb = new javax.swing.JLabel();
        txtdc = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Mã Phòng ban ");

        btndoimk.setText("Đổi Mk");
        btndoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoimkActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Alarm.png"))); // NOI18N

        lbldongho.setText("11:00:00PM");
        lbldongho.setPreferredSize(new java.awt.Dimension(40, 20));

        lblimage.setBackground(new java.awt.Color(204, 255, 255));
        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Tên Nhân Viên");

        lblhiendl.setText("Hiện Dữ Liệu Cá Nhân");
        lblhiendl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhiendlMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Ngày Sinh");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Mã Dự Án");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Mã Phòng Ban");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Mã Địa Chỉ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Vai Trò");

        rboql.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rboql.setSelected(true);
        rboql.setText("Quản lý");
        rboql.setEnabled(false);

        rbonv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        rbonv.setText("Nhân Viên");
        rbonv.setEnabled(false);

        txtmanv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtmanv.setText(" ");

        txttennv.setBackground(new java.awt.Color(0, 0, 0));
        txttennv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txttennv.setText(" ");

        txtmada.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtmada.setText(" ");

        txtpb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtpb.setText(" ");

        txtdc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtdc.setText(" ");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Mã Phòng ban ");

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()

                                .addComponent(lblhiendl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btndoimk)
                                .addGap(18, 18, 18)
                                .addComponent(lblhiendl, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(txtmanv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtmada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txttennv, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                                        .addGap(28, 28, 28))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))

                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())

                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btndoimk)
                                    .addComponent(lblhiendl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoimkActionPerformed
         
        
        DoiMKJFrame frame = new DoiMKJFrame();
                frame.setTitle("Đổi Mật Khẩu");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);
    }//GEN-LAST:event_btndoimkActionPerformed

    private void lblhiendlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhiendlMouseClicked
        // TODO add your handling code here:
        loadimage();
        setimage();
    }//GEN-LAST:event_lblhiendlMouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndoimk;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JLabel lblhiendl;
    private javax.swing.JLabel lblimage;
    // End of variables declaration//GEN-END:variables

    public void date(){
    String pattenrn = "dd/mm/yyyy";
    String pattenrn3="EEEEE,dd-MMMMM yyyy ";
    String pattenrn4="dd-MM-yy";
    SimpleDateFormat dateFormat = new SimpleDateFormat(pattenrn3,new Locale("vi","VN"));
//        System.out.println(dateFormat.format(new Date()));
        lbldate.setText(dateFormat.format(new Date()));
    }
        Image iml=new Image();  
        public void loadimage(){
                try{
                    Connection cons = jdbcHelper.getConnection();
                    String sql ="SELECT [imageID]\n" +
                        "      ,[EmployeeID]\n" +
                        "      ,[image]\n" +
                        "      ,[gioitinh]\n" +
                        "      ,[ngaysinh]\n" +
                        "  FROM [EmployeeTransferManagement2019].[dbo].[Image] WHERE EmployeeID=?";
                    int id=DangNhapJDialog.EID;
                    System.out.println(""+id);
                    List <Image> list = new ArrayList<>();
                    PreparedStatement ps = cons.prepareCall(sql);
                    ps.setInt(1,id);
                    ResultSet rs = ps.executeQuery();
                    while(rs.next()){
                       // Image nv = new Image();
                        iml.setImageID(rs.getInt("imageID"));
                        iml.setEmployeeID(rs.getInt("EmployeeID"));
                        iml.setImage(rs.getBytes("image"));
                        iml.setGioitinh(rs.getBoolean("gioitinh"));
                        iml.setNgaysinh(rs.getDate("ngaysinh"));
                        list.add(iml);
                    }
                    ps.close();
                            rs.close();
            }catch(Exception e){
                e.printStackTrace();
            }
          }
   public void setimage(){ 
      // Image iml=new Image();
       byte[] img = (iml.getImage());
		 ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblimage.getWidth(), lblimage.getHeight(),java.awt.Image.SCALE_SMOOTH));
		 lblimage.setIcon(imageIcon);
		 personimage=img;
   }
//   int EID=0;
//   public void setid(){
//       try{
//                        Connection cons = jdbcHelper.getConnection();
//                        String sql2 ="select EmployeeID from Employees where Username=?";
//                        PreparedStatement ps = cons.prepareCall(sql2);
//                        ps.setString(1,DangNhapJDialog.ten);
//                        ResultSet rs = ps.executeQuery();
//                        while(rs.next()){
//                           EID=(Integer.parseInt(rs.getString("EmployeeID")));
//                        }
//                        System.out.println("so id: "+EID);
//                        ps.close();
//                        rs.close();
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//   }
}
