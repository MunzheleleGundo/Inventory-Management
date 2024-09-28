/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventoryManagement;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author munzhunzheleleGundo
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        WorkId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cashier = new javax.swing.JRadioButton();
        Manager = new javax.swing.JRadioButton();
        Signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Signin = new javax.swing.JButton();
        PinCode = new javax.swing.JPasswordField();
        PinCode1 = new javax.swing.JPasswordField();
        Admin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setText("Sign-up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.white, java.awt.Color.gray));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WorkId.setEditable(false);
        WorkId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        WorkId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WorkIdActionPerformed(evt);
            }
        });
        jPanel2.add(WorkId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 350, 38));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel2.setText("Pin Code");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel3.setText("Work ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        Cashier.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Cashier.setText("Cashier");
        Cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierActionPerformed(evt);
            }
        });
        jPanel2.add(Cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        Manager.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Manager.setText("Manager");
        Manager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManagerActionPerformed(evt);
            }
        });
        jPanel2.add(Manager, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        Signup.setBackground(new java.awt.Color(0, 153, 204));
        Signup.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Signup.setForeground(new java.awt.Color(255, 255, 255));
        Signup.setText("Sign-up");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });
        jPanel2.add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel4.setText("Pin Code");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        id.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 350, 38));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel5.setText("RsaId/Passport");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        Signin.setBackground(new java.awt.Color(0, 153, 204));
        Signin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Signin.setForeground(new java.awt.Color(255, 255, 255));
        Signin.setText("Sign-in");
        Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninActionPerformed(evt);
            }
        });
        jPanel2.add(Signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        PinCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(PinCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 350, 40));

        PinCode1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(PinCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 350, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 760, 480));

        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });
        jPanel1.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 650, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WorkIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WorkIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WorkIdActionPerformed
        private boolean VerifyPins(String pin1, String pin2){
            return pin1.equals(pin2)
                 && !pin1.contains("\\d+")
                 && !pin1.startsWith("0")
                 &&  pin1.length()==5   ;
        }
    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        // TODO add your handling code here:
        String Workid = null , Pincode = PinCode.getText(),query,Id = null;
        String url,pass,user;
        String dbPin = null ;
        url = "jdbc:MySQL://localhost:3307/inventorymanagement";
        pass="";
        user="root";
        int notFound = 0;
        if(VerifyPins(PinCode.getText(),PinCode.getText())){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,pass);
            Statement st = con.createStatement();
            if(Cashier.isSelected()){
                
            query = "SELECT* FROM Cashiers where id = '"+id.getText()+"'";
             ResultSet rs = st.executeQuery(query);
            while(rs.next() ){
                dbPin = rs.getString("pincode");
                Workid= rs.getString("workId");
                notFound = 1;
            }
            if(notFound ==1 && Id.equals(id.getText())){
                JOptionPane.showMessageDialog(null, "Please keep this Work id in mind");
                WorkId.setText(Workid);
                query = "UPDATE Cashiers pincode = '"+Pincode+"' where RsaId = '"+id.getText()+"'";
                st.executeUpdate(query);
            }
             else{
                    JOptionPane.showMessageDialog(null,"Cashier is not Recognized");
                }
            }
            
            else if(Manager.isSelected()){
                
                query ="SELECT * FROM manager where Rsaid= '"+id.getText()+"'";
                ResultSet rs = st.executeQuery(query);
                while(rs.next()){
                  Id = rs.getString("Rsaid");
                  Workid = rs.getString("workId");
                notFound =1;
                }
                if(notFound ==1 && Id.equals(id.getText())){
                JOptionPane.showMessageDialog(null, "Please keep this Work id in mind");
                WorkId.setText(Workid);
                query = "UPDATE  manager set Workid = '"+Workid+"',PinCode = '"+Pincode+"' where Rsaid ='"+id.getText()+"'";
                st.executeUpdate(query);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Manager is not Registered");
                
                }
            }
        }
        catch(Exception e){
            System.out.println("" +e.getMessage());
            JOptionPane.showMessageDialog(null,"System might be offline");
            
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Pin code must have 5 numbers and must not start with a zero(0)");
        }
    }//GEN-LAST:event_SignupActionPerformed

    private void SigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninActionPerformed
        // TODO add your handling code here:
        Signin sign = new Signin();
        sign.show();
        this.dispose();
    }//GEN-LAST:event_SigninActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
        if(!Manager.isSelected() && !Cashier.isSelected() && id.getText().equalsIgnoreCase("Admin")){
            ManageManager Mn = new ManageManager();
            Mn.Main();
            this.dispose();
        }
    }//GEN-LAST:event_AdminActionPerformed

    private void ManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManagerActionPerformed
        // TODO add your handling code here:
        Cashier.setSelected(false);
    }//GEN-LAST:event_ManagerActionPerformed

    private void CashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierActionPerformed
        // TODO add your handling code here:
        Manager.setSelected(false);
    }//GEN-LAST:event_CashierActionPerformed
 
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JRadioButton Cashier;
    private javax.swing.JRadioButton Manager;
    private javax.swing.JPasswordField PinCode;
    private javax.swing.JPasswordField PinCode1;
    private javax.swing.JButton Signin;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField WorkId;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}