package HotelBookingSystem;

import java.sql.*;
import javax.swing.JOptionPane;
import DataBaseConnection.*;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class Login extends javax.swing.JFrame { //Class for login page extending to JFRAME
    
    //Calling 3 Objects for connection, statement and result. settings values to null.
    Connection conn = null;
    PreparedStatement prep = null;
    ResultSet result = null;

    //Login default constructor
    public Login() {
        initComponents(); //Calling object to initialize components
        conn = ConnectionDB.getConnection(); //Calling connection class and getting the connection
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Exit = new javax.swing.JButton();
        returnMainPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userEmail = new javax.swing.JTextField();
        userPassword = new javax.swing.JPasswordField();
        LoginToDashboard = new javax.swing.JButton();
        signupPage = new javax.swing.JButton();
        forgotPasswordPage = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        clearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        returnMainPage.setBackground(new java.awt.Color(255, 255, 255));
        returnMainPage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnMainPage.setForeground(new java.awt.Color(0, 0, 0));
        returnMainPage.setText("<==Main Page");
        returnMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnMainPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnMainPage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 919, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnMainPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 240));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("~Login~");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        userEmail.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        userPassword.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        LoginToDashboard.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        LoginToDashboard.setText("Login");
        LoginToDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginToDashboardActionPerformed(evt);
            }
        });

        signupPage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        signupPage.setText("Signup");
        signupPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupPageActionPerformed(evt);
            }
        });

        forgotPasswordPage.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        forgotPasswordPage.setText("Forgot Password?");
        forgotPasswordPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPasswordPageActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/padlock.png"))); // NOI18N

        clearButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(LoginToDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signupPage, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotPasswordPage, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginToDashboard)
                            .addComponent(signupPage)
                            .addComponent(forgotPasswordPage)
                            .addComponent(clearButton)))
                    .addComponent(jLabel9))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 610, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/MainBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 600));

        setSize(new java.awt.Dimension(1080, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Exit action method
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        //declaring exit for user if they want to exit or not
        int exit = JOptionPane.showConfirmDialog(this, "Would You Like to Close This Program?", "Select", JOptionPane.YES_NO_OPTION);
        if (exit == 0) { //If exit is = 0 then
            System.exit(0); //Exits the program
        }
    }//GEN-LAST:event_ExitActionPerformed

    //Login button action method
    private void LoginToDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginToDashboardActionPerformed
        try { //try and catch method that
            //setting query as code for sql to locate the variables 
            String Query = "Select *  from HOTELBOOKINGCUSTOMERS where EMAILADDRESS LIKE ? and PASSWORD LIKE ?";
            
            prep = conn.prepareStatement(Query); //preparing connection statement which in this case is query
            
            //setting strings for both user email and password and trimming to handle any spaces
            prep.setString(1, userEmail.getText().trim()); 
            prep.setString(2, userPassword.getText().trim());
            
            //results will = to prepared statement which will execute query
            result = prep.executeQuery();

            //if result is next then
            if (result.next()) {
                //shows message login succesfull 
                JOptionPane.showMessageDialog(this, "Login Successfull");
                new BookHotelRooms().setVisible(true); //then will open the dashboard
            } else { //otherwise if user inputs incorrect login then
                //shows message that login has failed and username or password is incorrect
                JOptionPane.showMessageDialog(this, "Login Failed (Incorrect password or email)");
            }
        } catch (Exception e) { //catch method for any exceptions
            System.out.print(e);
        }
    }//GEN-LAST:event_LoginToDashboardActionPerformed

    //Signup button action method
    private void signupPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupPageActionPerformed
        setVisible(false); //Closes login page and
        new Signup().setVisible(true); //Calls and opens signup page
    }//GEN-LAST:event_signupPageActionPerformed

    //Forgot action button action
    private void forgotPasswordPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPasswordPageActionPerformed
        setVisible(false); //Closes login page and 
        new ForgotPassword().setVisible(true); //Calls and opens forgot password page
    }//GEN-LAST:event_forgotPasswordPageActionPerformed

    //Clear button action method
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        //Calls variable jtexts and clears to null if user clicks on clear 
        userEmail.setText(null);
        userPassword.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    //Return to main page button action method
    private void returnMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnMainPageActionPerformed
        setVisible(false); //Closes the signup page and
        new MainPage().setVisible(true); //Calls and opens main page window
    }//GEN-LAST:event_returnMainPageActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton LoginToDashboard;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton forgotPasswordPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private static final javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
    private javax.swing.JButton returnMainPage;
    private javax.swing.JButton signupPage;
    private javax.swing.JTextField userEmail;
    private javax.swing.JPasswordField userPassword;
    // End of variables declaration//GEN-END:variables
}
