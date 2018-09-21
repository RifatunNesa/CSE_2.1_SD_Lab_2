
//package train.tickets.management.system;
package Design;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import connect.connection;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.*;


public class Book_ticket extends javax.swing.JFrame {

    public Book_ticket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1250, 632));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 632));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 225));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("  Book Ticket");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 140, 250, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Rajshahi", "Khulna", "Chittagong", "Comilla", "Dinajpur", "Tangail", "Ishurdi", "Jessore", "Sylhet", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(480, 240, 250, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Station From :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 220, 180, 60);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dhaka", "Rajshahi", "Khulna", "Chittagong", "Comilla", "Dinajpur", "Tangail", "Ishurdi", "Jessore", "Sylhet" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(480, 310, 250, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Station To :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(330, 310, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Journey Date :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 370, 180, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Class :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(380, 450, 100, 40);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON_AC" }));
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(480, 450, 250, 40);

        btnBack.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(51, 102, 0));
        btnBack.setText("  Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(80, 535, 180, 40);

        btnSearch.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(51, 102, 0));
        btnSearch.setText("Search Train");
        btnSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch);
        btnSearch.setBounds(870, 520, 200, 40);

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 0));
        jLabel2.setPreferredSize(new java.awt.Dimension(1250, 632));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-50, 10, 1250, 640);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(480, 390, 250, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       String[] messageStrings = {}; 
       String input=jComboBox1.getName();
       //JComboBox cmMessageList = new JComboBox(messageStrings );
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Homepage.main(new String[0]);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String input=jComboBox1.getName();
        String input2=jComboBox2.getName();
         try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookticket","root","");
                 String sql="SELECT * from traindetails where From_where=? and To_where=?";
                 PreparedStatement pst=con.prepareStatement(sql);
                 pst.setString(1,jComboBox1.getName());
                 pst.setString(2,jComboBox2.getName());
                 ResultSet rs=pst.executeQuery();
                 if(rs.next()){
              JOptionPane.showMessageDialog(null,"found train.");
                this.dispose();
               Train_time.main(new String[0]);
                 } 
                 else{
                 JOptionPane.showMessageDialog(null,"Invaid.");
                 //gmail.setText("");
                 //pass.setText("");
                 }
                 con.close();
        }
                
         catch(Exception ex)
         {

           JOptionPane.showMessageDialog(null, ex);

         }
      
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String input2=jComboBox2.getName();
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Book_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_ticket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
