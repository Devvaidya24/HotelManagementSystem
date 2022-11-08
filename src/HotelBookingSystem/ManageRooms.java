package HotelBookingSystem;

import javax.swing.*;
import DataBaseConnection.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class ManageRooms extends javax.swing.JFrame {

    public ManageRooms() {
        initComponents();
    }

    ResultSet result = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        returnToBooking = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roomNum = new javax.swing.JTextField();
        roomType = new javax.swing.JComboBox<>();
        bedType = new javax.swing.JComboBox<>();
        totalCost = new javax.swing.JTextField();
        addRoomB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel2.setText("Manage Rooms");

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
                .addGap(252, 252, 252)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Total Cost", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 700, 460));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Room Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Room Type:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Type of Bed:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Total Cost:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        roomNum.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomNum.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(roomNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        roomType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        roomType.setForeground(new java.awt.Color(0, 0, 0));
        roomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium (Spar, Pool, AC)", "Normal (Pool, AC)" }));
        getContentPane().add(roomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 180, -1));

        bedType.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        bedType.setForeground(new java.awt.Color(0, 0, 0));
        bedType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        getContentPane().add(bedType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 180, -1));

        totalCost.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        totalCost.setForeground(new java.awt.Color(0, 0, 0));
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });
        getContentPane().add(totalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 180, -1));

        addRoomB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        addRoomB.setForeground(new java.awt.Color(0, 0, 0));
        addRoomB.setText("Add Room");
        addRoomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomBActionPerformed(evt);
            }
        });
        getContentPane().add(addRoomB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 320, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/DashboardBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        setSize(new java.awt.Dimension(1080, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //declaring exit for user if they want to exit or not
        int exit = JOptionPane.showConfirmDialog(this, "Would You Like to Close This Program?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) { //If exit is = 0 then
            System.exit(0); //Exits the program
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        //declaring exit for user if they want to signout or not
        int exit = JOptionPane.showConfirmDialog(null, "Would You Like to Sign Out?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) { //if exit is 0 then
            setVisible(false); //closes dashboard page and
            new Login().setVisible(true); //calls and opens back to login page
        }
    }//GEN-LAST:event_signOutActionPerformed

    private void returnToBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToBookingActionPerformed
        setVisible(false); //Closes dashboard and
        new BookHotelRooms().setVisible(true); //Calls and opens booking hotel room page
    }//GEN-LAST:event_returnToBookingActionPerformed

    private void totalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCostActionPerformed

    private void addRoomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomBActionPerformed
        String roomN = this.roomNum.getText().trim();
        String roomT = (String) this.roomType.getSelectedItem();
        String bedT = (String) this.bedType.getSelectedItem();
        String cost = this.totalCost.getText().trim();

        String check = "insert into room values('" + roomN + "','" + roomT + "','" + bedT + "','" + cost + "','Available')";
        ImplementUpdateDelete.setData(check, "Updated Succefully");

        setVisible(false);
        new ManageRooms().setVisible(true);
    }//GEN-LAST:event_addRoomBActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        result = Options.getData("select * from room");
        DefaultTableModel m = (DefaultTableModel) jTable1.getModel();

        try {
            while (result.next()) {
                m.addRow(new Object[]{result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5)});
            }
            result.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton addRoomB;
    private javax.swing.JComboBox<String> bedType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton returnToBooking;
    private javax.swing.JTextField roomNum;
    private javax.swing.JComboBox<String> roomType;
    private javax.swing.JButton signOut;
    private javax.swing.JTextField totalCost;
    // End of variables declaration//GEN-END:variables
}
