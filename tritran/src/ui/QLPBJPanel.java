/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.QuanLyPBController;

/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class QLPBJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLPB
     */
    public QLPBJPanel() {
        initComponents();
        
        QuanLyPBController controller = new QuanLyPBController(pnview, txtSearch, btnadd,btnxoa);
        controller.setDateToTable();
        controller.setEvent();
        controller.setdelete();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnview = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();

        pnview.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh sách phòng ban"));
        pnview.setMinimumSize(new java.awt.Dimension(100, 200));
        pnview.setPreferredSize(new java.awt.Dimension(580, 500));

        javax.swing.GroupLayout pnviewLayout = new javax.swing.GroupLayout(pnview);
        pnview.setLayout(pnviewLayout);
        pnviewLayout.setHorizontalGroup(
            pnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        pnviewLayout.setVerticalGroup(
            pnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 153, 255));
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Thêm mới");

        btnxoa.setBackground(new java.awt.Color(0, 153, 255));
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setText("Xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnview, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoa)
                        .addGap(28, 28, 28)
                        .addComponent(btnadd)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnadd)
                        .addComponent(btnxoa))
                    .addComponent(txtSearch))
                .addGap(18, 23, Short.MAX_VALUE)
                .addComponent(pnview, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnxoa;
    private javax.swing.JPanel pnview;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
