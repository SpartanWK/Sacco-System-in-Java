package Javadbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Javadbc extends javax.swing.JFrame {
    Connection con;
    PreparedStatement statement;
    Statement st;
    String cs;
    
    String user;
    String password;
    
    String query;
    ResultSet rs;
    String records;

    public Javadbc() {
        
        con = null;
        st = null;
        statement = null;
        
        cs = "jdbc:mysql://localhost:3306/bcs22019";
        user = "root";
        password = "";
        
        initComponents();
        
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regNo = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        regText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Antenna");

        regNo.setText("RegNo:");

        fName.setText("Name:");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(74, 74, 74)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(regNo)
                    .add(fName))
                .add(67, 67, 67)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(saveBtn)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(nameText, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .add(regText)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(41, 41, 41)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(regNo)
                    .add(regText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(33, 33, 33)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fName)
                    .add(nameText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(48, 48, 48)
                .add(saveBtn)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        String s1 = regText.getText();
        String s2 = nameText.getText();
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        
        con = DriverManager.getConnection(cs, user, password);
        st = con.createStatement();
        query = "INSERT INTO students (RegNo, Name) VALUES ('"+s1+"','"+s2+"')";
        st.executeUpdate(query);
        JOptionPane.showMessageDialog(null, "Record Saved!");
        regText.setText("");
        nameText.setText("");
        regText.requestFocus();
        }
        catch (SQLException ex){
        
                ex.printStackTrace();
        }
        
        catch(ClassNotFoundException e){
                e.printStackTrace();
                }
        finally {
            try {
            
            if (st!= null){
                st.close();
            }
            if (con != null){
                con.close();
            }
            }
            catch (SQLException ex){
                ex.printStackTrace();
            }
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed
    

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Javadbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Javadbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Javadbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Javadbc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Javadbc().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fName;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel regNo;
    private javax.swing.JTextField regText;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
    
}
