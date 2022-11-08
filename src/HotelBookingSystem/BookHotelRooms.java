package HotelBookingSystem;

import javax.swing.*;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class BookHotelRooms extends javax.swing.JFrame {

    public BookHotelRooms() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageRoomB = new javax.swing.JButton();
        checkInB = new javax.swing.JButton();
        checkOutB = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51, 160));

        manageRoomB.setBackground(new java.awt.Color(255, 255, 255));
        manageRoomB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageRoomB.setForeground(new java.awt.Color(0, 0, 0));
        manageRoomB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/bed (1).png"))); // NOI18N
        manageRoomB.setText("Manage Rooms");
        manageRoomB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomBActionPerformed(evt);
            }
        });

        checkInB.setBackground(new java.awt.Color(255, 255, 255));
        checkInB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        checkInB.setForeground(new java.awt.Color(0, 0, 0));
        checkInB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/check-in (1).png"))); // NOI18N
        checkInB.setText("Check In");
        checkInB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInBActionPerformed(evt);
            }
        });

        checkOutB.setBackground(new java.awt.Color(255, 255, 255));
        checkOutB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        checkOutB.setForeground(new java.awt.Color(0, 0, 0));
        checkOutB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/check-out (1).png"))); // NOI18N
        checkOutB.setText("Check Out");
        checkOutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageRoomB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkInB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkOutB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(manageRoomB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(checkInB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(checkOutB, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 550));

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
        jLabel2.setText("Hotel Bookings");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(300, 300, 300)
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(signOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/hotelMain.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, 480));

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

    private void manageRoomBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomBActionPerformed
        setVisible(false);
        new ManageRooms().setVisible(true);
    }//GEN-LAST:event_manageRoomBActionPerformed

    private void checkInBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInBActionPerformed
        setVisible(false);
        new CheckIn().setVisible(true);
    }//GEN-LAST:event_checkInBActionPerformed

    private void checkOutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBActionPerformed
        setVisible(false);
        new CheckOut().setVisible(true);
    }//GEN-LAST:event_checkOutBActionPerformed

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
            java.util.logging.Logger.getLogger(BookHotelRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookHotelRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookHotelRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookHotelRooms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BookHotelRooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton checkInB;
    private javax.swing.JButton checkOutB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static final javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
    private javax.swing.JButton manageRoomB;
    private javax.swing.JButton signOut;
    // End of variables declaration//GEN-END:variables
}
