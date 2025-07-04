/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com;

/**
 *
 * @author Samsu
 */

import main.connection.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.connection.Connect;
import java.sql.*;

public class DataTamu extends javax.swing.JFrame {
    private DefaultTableModel tabMode;
    Connection conn = new Connect().connect();
    /**
     * Creates new form DataTamu
     */
    
    protected void DataTable(){
        Object[] Baris = {"ID","NAMA","NIK / PASPORT","ALAMAT","GENDER","TELP","STATUS"};
        tabMode = new DefaultTableModel(null, Baris);
        dataTamu.setModel(tabMode);
        String sql = "SELECT * FROM tamu";
        try{
            java.sql.Statement state = conn.createStatement();
            ResultSet result = state.executeQuery(sql);
            while(result.next()){
                int nr = result.getInt("id");
                String nama = result.getString("nama");
                int no_identitas = result.getInt("no_identitas");
                boolean kelamin = result.getBoolean("kelamin");
                String status = result.getString("status");
                String addr = result.getString("alamat");
                int telp = result.getInt("telpon");
                String gender;
                if(kelamin){
                    gender = "Laki - Laki";
                }else{
                    gender = "Permpuan";
                }
                if(status == null){
                    status = "-";
                }
                String [] data = {String.valueOf(nr),nama,String.valueOf(no_identitas),addr,gender,String.valueOf(telp),status};
                tabMode.addRow(data);
            }
        }catch(Exception er){
            System.out.println(er);
        }
    }
    
    public DataTamu() {
        initComponents();
        DataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namaTamu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        noIdentitas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telpon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gl = new javax.swing.JRadioButton();
        gp = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTamu = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        idd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Master Tamu");
        setMinimumSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        jLabel1.setText("NAMA TAMU");

        jLabel2.setText("NIK / PASPORT");

        jLabel3.setText("ALAMAT");

        jLabel4.setText("TELEPONE");

        jLabel5.setText("KELAMIN");

        gl.setText("Laki - Laki");
        gl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                glMouseClicked(evt);
            }
        });

        gp.setText("Perempuan");
        gp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpMouseClicked(evt);
            }
        });

        dataTamu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAMA TAMU", "NIK / PASSPORT", "ALAMAT", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTamu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTamuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTamu);
        if (dataTamu.getColumnModel().getColumnCount() > 0) {
            dataTamu.getColumnModel().getColumn(0).setResizable(false);
            dataTamu.getColumnModel().getColumn(1).setResizable(false);
            dataTamu.getColumnModel().getColumn(2).setResizable(false);
            dataTamu.getColumnModel().getColumn(3).setResizable(false);
            dataTamu.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("Delete");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Simpan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Update");
        jButton4.setVisible(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telpon, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(noIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaTamu, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(idd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gl)
                        .addGap(32, 32, 32)
                        .addComponent(gp)))
                .addContainerGap(281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaTamu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telpon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gl)
                    .addComponent(gp))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void glMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_glMouseClicked
        // TODO add your handling code here:
        gp.setSelected(false);
    }//GEN-LAST:event_glMouseClicked

    private void gpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpMouseClicked
        // TODO add your handling code here:
        gl.setSelected(false);
    }//GEN-LAST:event_gpMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Query main = new Query();
        boolean kelamin;
        int no_id = Integer.valueOf(noIdentitas.getText());
        int telp = Integer.valueOf(telpon.getText());
        String name = namaTamu.getText();
        String addr = alamat.getText();
        if(gl.isSelected()){
            kelamin = true;
        }else{
            kelamin = false;
        }
        int leng = noIdentitas.getText().length();
        if(leng == 12 || leng == 8){
            boolean result = main.InsertDataTamu(no_id, kelamin, name, telp,addr);
            if(result){
                JOptionPane.showMessageDialog(null,"Tamu Berhasil Di Tambah");
                DataTable();
                noIdentitas.setText("");
                telpon.setText("");
                namaTamu.setText("");
                alamat.setText("");
                gl.setSelected(false);
                gp.setSelected(false);
            }else{
                JOptionPane.showMessageDialog(null,"Tamu Gagal Di Tambah");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Unvalid No Identitas");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DataTable();
        noIdentitas.setText("");
        telpon.setText("");
        namaTamu.setText("");
        alamat.setText("");
        gl.setSelected(false);
        gp.setSelected(false);
        this.jButton1.setVisible(false);
        this.jButton3.setVisible(true);
        this.jButton4.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dataTamuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTamuMouseClicked
        // TODO add your handling code here:
        this.jButton1.setVisible(true);
        this.jButton3.setVisible(false);
        this.jButton4.setVisible(true);
        int bar = dataTamu.getSelectedRow();
        String nama = dataTamu.getValueAt(bar,1).toString();
        String no_id = dataTamu.getValueAt(bar,2).toString();
        String addr = dataTamu.getValueAt(bar,3).toString();
        String telp = dataTamu.getValueAt(bar,5).toString();
        String kel = dataTamu.getValueAt(bar,4).toString();
        noIdentitas.setText(no_id);
        namaTamu.setText(nama);
        alamat.setText(addr);
        telpon.setText(telp);
        idd.setText(dataTamu.getValueAt(bar,0).toString());
        
        if(kel == "Laki - Laki"){
            gl.setSelected(true);
        }else{
            gp.setSelected(true);
        }
    }//GEN-LAST:event_dataTamuMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        // Update Tamu
          // TODO add your handling code here:
        Query main = new Query();
        boolean kelamin;
        int no_id = Integer.valueOf(noIdentitas.getText());
        int telp = Integer.valueOf(telpon.getText());
        int ids = Integer.valueOf(idd.getText());
        String name = namaTamu.getText();
        String addr = alamat.getText();
        if(gl.isSelected()){
            kelamin = true;
        }else{
            kelamin = false;
        }
        int leng = noIdentitas.getText().length();
        if(leng == 12 || leng == 8){
            boolean result = main.UpdateDataTamu(no_id, kelamin, name, telp,addr,ids);
            if(result){
                JOptionPane.showMessageDialog(null,"Tamu Berhasil Di Update");
                DataTable();
                noIdentitas.setText("");
                telpon.setText("");
                namaTamu.setText("");
                alamat.setText("");
                gl.setSelected(false);
                gp.setSelected(false);
                this.jButton1.setVisible(false);
                this.jButton3.setVisible(true);
                this.jButton4.setVisible(false);
                DataTable();
                }else{
                JOptionPane.showMessageDialog(null,"Tamu Gagal Di Update");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Unvalid No Identitas");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Delete
        String kode = noIdentitas.getText();
        Query main = new Query();
        boolean result = main.DeleteTamu(kode);
        if(result){
            JOptionPane.showMessageDialog(null,"Berhasil Di Hapus");
        }else{
            JOptionPane.showMessageDialog(null,"Gagal Di Hapus");
        }
        DataTable();
        noIdentitas.setText("");
                telpon.setText("");
                namaTamu.setText("");
                alamat.setText("");
                gl.setSelected(false);
                gp.setSelected(false);
                this.jButton1.setVisible(false);
                this.jButton3.setVisible(true);
                this.jButton4.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTamu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataTamu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JTable dataTamu;
    private javax.swing.JRadioButton gl;
    private javax.swing.JRadioButton gp;
    private javax.swing.JLabel idd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaTamu;
    private javax.swing.JTextField noIdentitas;
    private javax.swing.JTextField telpon;
    // End of variables declaration//GEN-END:variables
}
