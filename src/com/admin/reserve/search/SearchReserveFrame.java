/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.admin.reserve.search;
import com.admin.reserve.result.SearchResultFrame;
import com.database.connection.databaseConnection;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Harvy Yator
 */
public class SearchReserveFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchReserveFrame
     */
    public SearchReserveFrame() {
        initComponents();
        databaseConnection.getCon();
    }
    private void ResultActionPerformed(java.awt.event.ActionEvent evt) {
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        otpSearchField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OTP Finder");
        setBackground(new java.awt.Color(255, 153, 51));
        setForeground(new java.awt.Color(255, 153, 51));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(320, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchBtn.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 150, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Reservation OTP Code:");
        jLabel1.setMinimumSize(new java.awt.Dimension(64, 38));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 30));

        otpSearchField.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        otpSearchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otpSearchFieldActionPerformed(evt);
            }
        });
        getContentPane().add(otpSearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 280, 35));

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 640, 130));

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 100));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Please enter the Reservation OTP Code sent to your email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 540, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try{
            Integer.parseInt(otpSearchField.getText());
            databaseConnection.getSearchResult(otpSearchField.getText());
            this.dispose();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Input is not number. Please Try Again.");
        }
        
        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void otpSearchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otpSearchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otpSearchFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SearchReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchReserveFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchReserveFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField otpSearchField;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables

    private String getSearchResult() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
