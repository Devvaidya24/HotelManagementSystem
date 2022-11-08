package HotelBookingSystem;

import java.text.*;
import java.util.Calendar;
import javax.swing.*;
import java.sql.*;
import DataBaseConnection.*;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class CheckIn extends javax.swing.JFrame {

    public CheckIn() {
        initComponents();

        Connection conn = ConnectionDB.getConnection();
        totalCost.setEditable(false);
        dateTime.setEditable(false);

        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        Calendar c = Calendar.getInstance();

        dateTime.setText(formatDate.format(c.getTime()));
    }

    String bed;
    String roomType;
    String roomNo;
    String price;
    int check = 0;
    protected JFrame jframe;
    
    public void roomDetails() {
        roomNumCombo.removeAllItems();
        totalCost.setText("");

        bed = (String) bedTypeCombo.getSelectedItem();
        roomType = (String) roomTypeCombo.getSelectedItem();

        try {
            ResultSet result = Options.getData("select * from room where bedtype='" + bed + "' and roomtype='" + roomType + "' and status='Not Available'");
            while (result.next()) {
                roomNumCombo.addItem(result.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        returnToBooking = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        userNumber = new javax.swing.JTextField();
        userEmail = new javax.swing.JTextField();
        userGender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        roomTypeCombo = new javax.swing.JComboBox<>();
        bedTypeCombo = new javax.swing.JComboBox<>();
        totalCost = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dateTime = new javax.swing.JTextField();
        roomNumCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jLabel2.setText("Check In");

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
                .addGap(307, 307, 307)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 341, Short.MAX_VALUE)
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

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Customer Booking Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Full Name: ");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        number.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        number.setForeground(new java.awt.Color(0, 0, 0));
        number.setText("Phone Number(+64):");
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 0));
        gender.setText("Gender:");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email Address:");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));
        getContentPane().add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 180, -1));
        getContentPane().add(userNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 180, -1));

        userEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userEmailActionPerformed(evt);
            }
        });
        getContentPane().add(userEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 180, -1));

        userGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(userGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 180, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Room Number:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Room Type:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Bed Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total Cost:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        roomTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium (Spar, Pool, AC)", "Normal (Pool, AC)" }));
        roomTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomTypeComboActionPerformed(evt);
            }
        });
        getContentPane().add(roomTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, 210, -1));

        bedTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        bedTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedTypeComboActionPerformed(evt);
            }
        });
        getContentPane().add(bedTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 210, -1));
        getContentPane().add(totalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 210, -1));

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 100, -1));

        search.setText("Book (Submit)");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 270, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Date:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));
        getContentPane().add(dateTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 180, -1));

        roomNumCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomNumComboActionPerformed(evt);
            }
        });
        getContentPane().add(roomNumCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 210, -1));

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

    private void userEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userEmailActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        userEmail.setText(null);
        userName.setText(null);
        userNumber.setText(null);
    }//GEN-LAST:event_clearActionPerformed
    //2
    private void bedTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedTypeComboActionPerformed
        roomDetails();
    }//GEN-LAST:event_bedTypeComboActionPerformed
    //3
    private void roomTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomTypeComboActionPerformed
        roomDetails();
    }//GEN-LAST:event_roomTypeComboActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

        
        String nameT = userName.getText().trim();
        String emailT = userEmail.getText().trim();
        String numberT = userNumber.getText().trim();
        String genderT = (String)userGender.getSelectedItem();
        String dateT = dateTime.getText();
        
        String bedT = (String)bedTypeCombo.getSelectedItem();
        String roomT = (String)roomTypeCombo.getSelectedItem();
        String roomNumberT = (String)roomNumCombo.getSelectedItem();
        String costT = totalCost.getText();
        
        if(nameT.isEmpty() || emailT.isEmpty() || numberT.isEmpty() || genderT.isEmpty() || dateT.isEmpty() || bedT.isEmpty() || roomT.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter in all fields");
        }
        
        
//        
//        String check = "select max(number) from checkin";
//        
//        try {
//            ResultSet result = Options.getData(check);
//            while (result.next()) {
//                number = result.getString(1);
//                number = number +1;
//                
//                if (!cost.isEmpty()) {
//                    check = "update room set status=' Booked roomnumber='"+roomNo+"'";
//                    ImplementUpdateDelete.setData(check, "");
//                    check = "insert into checkin(name,number,email,gender,date,bed,roomtype,roomnumber,totalcost) values("+name+",'"+email+"','"+gender+"','"+date+"','"+bed+"','"+roomType+"','"+this.roomNo+"','"+cost+"')";
//                    ImplementUpdateDelete.setData(check, "checkin check in successfully");
//                    setVisible(false);
//                    new CheckIn().setVisible(true);
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_searchActionPerformed

    private void roomNumComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomNumComboActionPerformed
        roomNo = (String)roomNumCombo.getSelectedItem();
        
        try {
            ResultSet result = Options.getData("select * from room where roomnumber='"+roomNo+"'");
            
            while (result.next()) {
                totalCost.setText(result.getString(4));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_roomNumComboActionPerformed

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JComboBox<String> bedTypeCombo;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dateTime;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel number;
    private javax.swing.JButton returnToBooking;
    private javax.swing.JComboBox<String> roomNumCombo;
    private javax.swing.JComboBox<String> roomTypeCombo;
    private javax.swing.JButton search;
    private javax.swing.JButton signOut;
    private javax.swing.JTextField totalCost;
    private javax.swing.JTextField userEmail;
    private javax.swing.JComboBox<String> userGender;
    private javax.swing.JTextField userName;
    private javax.swing.JTextField userNumber;
    // End of variables declaration//GEN-END:variables
}
