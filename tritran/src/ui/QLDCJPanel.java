/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.QuanLyDCController;


/**
 *
 * @author Nguyễn Văn Tuấn
 */
public class QLDCJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLDCJPanel
     */
    public QLDCJPanel() {
        initComponents();
        QuanLyDCController quanLyDCController = new QuanLyDCController(pnview, txtSearch,btnadd,btnxoa);
        quanLyDCController.setDateToTable();
        quanLyDCController.setEvent();
        quanLyDCController.setdelete();
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

        pnview.setBorder(javax.swing.BorderFactory.createTitledBorder("Địa Chỉ"));
        pnview.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnview.setMinimumSize(new java.awt.Dimension(100, 200));
        pnview.setPreferredSize(new java.awt.Dimension(580, 500));

        javax.swing.GroupLayout pnviewLayout = new javax.swing.GroupLayout(pnview);
        pnview.setLayout(pnviewLayout);
        pnviewLayout.setHorizontalGroup(
            pnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        pnviewLayout.setVerticalGroup(
            pnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 0, 255));
        btnadd.setText("Thêm mới");

        btnxoa.setBackground(new java.awt.Color(0, 0, 255));
        btnxoa.setText("Xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnview, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnadd)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnxoa)
                        .addComponent(btnadd))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnview, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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
