package HotelBookingSystem;

import javax.swing.*;
import java.sql.*;
import DataBaseConnection.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class Dashboard extends javax.swing.JFrame { //Dashboard class for administrators

    ResultSet result = null;

    //Default constructor for dashboard
    public Dashboard() {
        initComponents(); //Calling object to initialize components
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        returnToBooking = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        nameOrEmail = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        returnMainPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Exit.setBackground(new java.awt.Color(255, 255, 255));
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/Exit.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        signOut.setBackground(new java.awt.Color(255, 255, 255));
        signOut.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signOut.setForeground(new java.awt.Color(0, 0, 0));
        signOut.setText("Sign Out");
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Administrator Dashboard");

        returnToBooking.setBackground(new java.awt.Color(255, 255, 255));
        returnToBooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnToBooking.setForeground(new java.awt.Color(0, 0, 0));
        returnToBooking.setText("<--Return to Booking");
        returnToBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnToBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212)
                .addComponent(signOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnToBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(signOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Email or Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, 30));

        search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        nameOrEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(nameOrEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, -1));

        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Email Address", "Gender", "Security Question", "Ethnicity", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1060, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/DashboardBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        returnMainPage.setBackground(new java.awt.Color(255, 255, 255));
        returnMainPage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnMainPage.setForeground(new java.awt.Color(0, 0, 0));
        returnMainPage.setText("<==Main Page");
        getContentPane().add(returnMainPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1080, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Exit button action method
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //declaring exit for user if they want to exit or not
        int exit = JOptionPane.showConfirmDialog(this, "Would You Like to Close This Program?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) { //If exit is = 0 then
            System.exit(0); //Exits the program
        }
    }//GEN-LAST:event_ExitActionPerformed

    //Signout button action method
    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        //declaring exit for user if they want to signout or not
        int exit = JOptionPane.showConfirmDialog(null, "Would You Like to Sign Out?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) { //if exit is 0 then
            setVisible(false); //closes dashboard page and 
            new Login().setVisible(true); //calls and opens back to login page
        }
    }//GEN-LAST:event_signOutActionPerformed

    //Clear button action method
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        setVisible(false); //Refreshes the page
        new Dashboard().setVisible(true); //Opens page again
    }//GEN-LAST:event_clearActionPerformed

    //Form table method
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        //Setting result as calling options class and getting data from sql database table
        result = Options.getData("Select * from HOTELBOOKINGCUSTOMERS");
        //Calling default table model object as the jTable and gets the model
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        //setting row count to 0
        m.setRowCount(0);

        //try catch method for
        try {
            //while result is next then
            while (result.next()) {
                //mode add role while calling new object taking result and getting string from each row depending on the data row
                m.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(4), result.getString(5), result.getString(7), result.getString(8)});
            }
            //then result is closed
            result.close();
        } catch (Exception e) { //catches any exceptions 
            JOptionPane.showMessageDialog(null, e); //displays message if caught
        }
    }//GEN-LAST:event_formComponentShown

    //search button action method
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        //Setting string user name or the email and calling the j text form as the name or email, trim it.
        String userNameEmail = nameOrEmail.getText().trim();
        
        //result then is = to when option is called to get data from the table for the full name and the user name, either one of them
        result = Options.getData("Select * from HOTELBOOKINGCUSTOMERS where FULLNAME like '%"+userNameEmail+"%' or EMAILADDRESS like '%"+userNameEmail+"%'");
        //then calls the table mode object from the jtable gets the mode
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
        //then sets row count to 0
        m.setRowCount(0);

        //try catch method for
        try {
            //while result is next then
            while (result.next()) {
                //model adds row with new object depending on the tye of data and where it is located on the jTable
                m.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(4), result.getString(5), result.getString(7), result.getString(8)});
            }
            //then result is closed 
            result.close();
        } catch (Exception e) { //catches any exception 
            JOptionPane.showMessageDialog(null, e); //then returns or displays a message quite the opposite
        }
    }//GEN-LAST:event_searchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    //Return to booking button action method
    private void returnToBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToBookingActionPerformed
        setVisible(false); //Closes dashboard and
        new BookHotelRooms().setVisible(true); //Calls and opens booking hotel room page
    }//GEN-LAST:event_returnToBookingActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameOrEmail;
    private javax.swing.JButton returnMainPage;
    private javax.swing.JButton returnToBooking;
    private javax.swing.JButton search;
    private javax.swing.JButton signOut;
    // End of variables declaration//GEN-END:variables
}
