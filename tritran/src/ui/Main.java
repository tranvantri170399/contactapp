/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import bean.DMBean;
import controller.ChuyenMHController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Quản Lý Nhân Sự");
        ChuyenMHController controller = new ChuyenMHController(jpnview);
        controller.setView(pnMHC, lblMHC);
        
        List<DMBean> listItem= new ArrayList<>();
        listItem.add(new DMBean("TrangChu", pnMHC,lblMHC));
        listItem.add(new DMBean("QuanLyNV", pnQLNV,lblQLNV));
        listItem.add(new DMBean("QuanLyDA", pnQLDA,lblQLDA));
        listItem.add(new DMBean("QuanLyPB", pnQLPB,lblQLPB));
        listItem.add(new DMBean("QuanLyDC", pnQLDC,lblQLDC));
        
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jpnview = new javax.swing.JPanel();
        jpnmenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnQLNV = new javax.swing.JPanel();
        lblQLNV = new javax.swing.JLabel();
        pnQLDA = new javax.swing.JPanel();
        lblQLDA = new javax.swing.JLabel();
        pnQLPB = new javax.swing.JPanel();
        lblQLPB = new javax.swing.JLabel();
        pnQLDC = new javax.swing.JPanel();
        lblQLDC = new javax.swing.JLabel();
        pnMHC = new javax.swing.JPanel();
        lblMHC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnview.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnviewLayout = new javax.swing.GroupLayout(jpnview);
        jpnview.setLayout(jpnviewLayout);
        jpnviewLayout.setHorizontalGroup(
            jpnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        jpnviewLayout.setVerticalGroup(
            jpnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpnmenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jLabel1.setText("Quản Lý Nhân Sự");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnQLNV.setBackground(new java.awt.Color(51, 133, 255));

        lblQLNV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQLNV.setForeground(new java.awt.Color(255, 255, 255));
        lblQLNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qlnv.png"))); // NOI18N
        lblQLNV.setText("Quản Lí  Nhân Viên");

        javax.swing.GroupLayout pnQLNVLayout = new javax.swing.GroupLayout(pnQLNV);
        pnQLNV.setLayout(pnQLNVLayout);
        pnQLNVLayout.setHorizontalGroup(
            pnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLNVLayout.createSequentialGroup()
                .addComponent(lblQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnQLNVLayout.setVerticalGroup(
            pnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        pnQLDA.setBackground(new java.awt.Color(51, 133, 255));

        lblQLDA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQLDA.setForeground(new java.awt.Color(255, 255, 255));
        lblQLDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLDA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qlduan.png"))); // NOI18N
        lblQLDA.setText("Quản Lý Dự Án");

        javax.swing.GroupLayout pnQLDALayout = new javax.swing.GroupLayout(pnQLDA);
        pnQLDA.setLayout(pnQLDALayout);
        pnQLDALayout.setHorizontalGroup(
            pnQLDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLDALayout.createSequentialGroup()
                .addComponent(lblQLDA, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnQLDALayout.setVerticalGroup(
            pnQLDALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLDA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        pnQLPB.setBackground(new java.awt.Color(51, 133, 255));

        lblQLPB.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQLPB.setForeground(new java.awt.Color(255, 255, 255));
        lblQLPB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLPB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qlphongban.png"))); // NOI18N
        lblQLPB.setText("Quản Lý Phòng Ban");

        javax.swing.GroupLayout pnQLPBLayout = new javax.swing.GroupLayout(pnQLPB);
        pnQLPB.setLayout(pnQLPBLayout);
        pnQLPBLayout.setHorizontalGroup(
            pnQLPBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLPB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnQLPBLayout.setVerticalGroup(
            pnQLPBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLPB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        pnQLDC.setBackground(new java.awt.Color(51, 133, 255));

        lblQLDC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblQLDC.setForeground(new java.awt.Color(255, 255, 255));
        lblQLDC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQLDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/qldiachi.png"))); // NOI18N
        lblQLDC.setText("Quản Lý Địa Chỉ");

        javax.swing.GroupLayout pnQLDCLayout = new javax.swing.GroupLayout(pnQLDC);
        pnQLDC.setLayout(pnQLDCLayout);
        pnQLDCLayout.setHorizontalGroup(
            pnQLDCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLDCLayout.createSequentialGroup()
                .addComponent(lblQLDC, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnQLDCLayout.setVerticalGroup(
            pnQLDCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQLDC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        pnMHC.setBackground(new java.awt.Color(51, 133, 255));

        lblMHC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMHC.setForeground(new java.awt.Color(255, 255, 255));
        lblMHC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMHC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/main.png"))); // NOI18N
        lblMHC.setText("Màn Hình Chính");

        javax.swing.GroupLayout pnMHCLayout = new javax.swing.GroupLayout(pnMHC);
        pnMHC.setLayout(pnMHCLayout);
        pnMHCLayout.setHorizontalGroup(
            pnMHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMHCLayout.createSequentialGroup()
                .addComponent(lblMHC, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnMHCLayout.setVerticalGroup(
            pnMHCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMHC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnmenuLayout = new javax.swing.GroupLayout(jpnmenu);
        jpnmenu.setLayout(jpnmenuLayout);
        jpnmenuLayout.setHorizontalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnmenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMHC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnQLPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnQLDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnQLDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jpnmenuLayout.setVerticalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pnMHC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(pnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnQLDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnQLPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(pnQLDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnmenu;
    private javax.swing.JPanel jpnview;
    private javax.swing.JLabel lblMHC;
    private javax.swing.JLabel lblQLDA;
    private javax.swing.JLabel lblQLDC;
    private javax.swing.JLabel lblQLNV;
    private javax.swing.JLabel lblQLPB;
    private javax.swing.JPanel pnMHC;
    private javax.swing.JPanel pnQLDA;
    private javax.swing.JPanel pnQLDC;
    private javax.swing.JPanel pnQLNV;
    private javax.swing.JPanel pnQLPB;
    // End of variables declaration//GEN-END:variables
}
