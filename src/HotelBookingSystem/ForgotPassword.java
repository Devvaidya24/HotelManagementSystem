package HotelBookingSystem;

import javax.swing.*;
import java.sql.*;
import DataBaseConnection.*;
import java.awt.HeadlessException;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class ForgotPassword extends javax.swing.JFrame { //Class for forgot password method which extends to JFRAME

    //Calling 2 objects connection and resultset method and setting them to null
    Connection conn = null;
    ResultSet result = null;

    //Forgot password default constructor
    public ForgotPassword() {
        initComponents(); //Calling object to initialize components
        conn = ConnectionDB.getConnection(); //Calling connection class and getting the connection
    }

    //Setting user email as a string
    String userEmail;

    public ForgotPassword(String Email) {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        reEmail = new javax.swing.JTextField();
        rePassword = new javax.swing.JPasswordField();
        searchButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        reSecurityA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        reSecurityQ = new javax.swing.JTextField();
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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,240));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("~Forgot Password~");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Password:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Security Question:");

        reEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        reEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reEmailActionPerformed(evt);
            }
        });

        rePassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePasswordActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        saveButton.setText("Submit");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        signupButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        signupButton.setText("Signup");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        reSecurityA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        reSecurityA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reSecurityAActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Answer:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reSecurityA)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(reEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rePassword)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reSecurityQ))
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(reEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(reSecurityQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reSecurityA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(signupButton)
                    .addComponent(loginButton)
                    .addComponent(clearButton))
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 800, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SystemImages/MainBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    //Clear button action method
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        //If user clicks clear then it will clear text fields and set them to null
        reEmail.setText(null);
        reSecurityQ.setText(null);
        rePassword.setText(null);
    }//GEN-LAST:event_clearButtonActionPerformed

    //Search button action method
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        //Setting check to interger and default by 0
        int check = 0;
        //Getting jtext for email and trimming calling it into userEmail
        userEmail = reEmail.getText().trim();

        //if user email is empty then
        if (userEmail.isEmpty()) {
            check = 1; //checks for one
            //asks user to input in the email field as it is empty
            JOptionPane.showMessageDialog(null, "Please enter in the email field");

        } else { //otherwise
            //sets result where calls option class, gets the data from sql server table and checks for email if it exists
            result = Options.getData("Select * from HOTELBOOKINGCUSTOMERS where EMAILADDRESS='" + userEmail + "'");

            try { //try and catch method for 
                //if result is next then...
                if (result.next()) {
                    //checks for 1
                    check = 1;
                    //sets editable for question and email then
                    reSecurityQ.setEditable(false);
                    reEmail.setEditable(false);
                    //sets the text for question which takes it from row 5 which is where it is located on the table
                    reSecurityQ.setText(result.getString(5));
                }
            } catch (Exception e) { //catches any exceptions
                //displays message
                JOptionPane.showMessageDialog(null, e);
            }
        }
        //if check is = 0 then
        if (check == 0)
            //shows message that the email is incorrected
            JOptionPane.showMessageDialog(null, "Incorrect email");
    }//GEN-LAST:event_searchButtonActionPerformed

    private void rePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePasswordActionPerformed

    private void reEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reEmailActionPerformed

    //Save button action method
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        //setting set variable to interger and 0
        int check = 0;
        
        //getting text for question, answer and new password and trimming
        String question = reSecurityQ.getText().trim();
        String answer = reSecurityA.getText().trim();
        String newPassword = rePassword.getText().trim();

        //if answer and password is empty then
        if (answer.isEmpty() || newPassword.isEmpty()) {
            //checks for one
            check = 1;
            //displays message that users needs to enter details in all fields
            JOptionPane.showMessageDialog(null, "Please enter all fields");
        } else { //otherwise
            
            //setting result which calls option class and gets data from sql server table for both user email, question and answer
            result = Options.getData("Select * from HOTELBOOKINGCUSTOMERS where EMAILADDRESS='" + userEmail + "' and SECURITYQUESTION='" + question + "' and ANSWER='" + answer + "'");

            try { //try catch method 
                //if result next then
                if (result.next()) {
                    
                    //checks for one
                    check = 1;
                    //calls the implement update and delete class, sets and updates the data(password) from the locations of the data from the sql table 
                    ImplementUpdateDelete.setData("update HOTELBOOKINGCUSTOMERS set PASSWORD='" + newPassword + "' where EMAILADDRESS='" + userEmail + "'", "Password successfully changed");
                    setVisible(false); //then closes the forgot password page and
                    new Login().setVisible(true); //Calls and opens login page to login with new user details
                }

            } catch (Exception e) { //Catches any exceptions and shows message
                JOptionPane.showMessageDialog(null, e);
            }
        }
        if (check == 0) { //if check is = 0 then 
            //displays message that the input is incorrect and user will need to try again
            JOptionPane.showMessageDialog(null, "Incorrect Input");
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    //Signup button action method
    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed
        setVisible(false); //Closes forgot password page and
        new Signup().setVisible(true); //Opens signup page
    }//GEN-LAST:event_signupButtonActionPerformed

    //Login button action method
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        setVisible(false); //Closes forgot password method and
        new Login().setVisible(true); //Opens login page
    }//GEN-LAST:event_loginButtonActionPerformed

    private void reSecurityAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reSecurityAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reSecurityAActionPerformed

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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private static final javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField reEmail;
    private javax.swing.JPasswordField rePassword;
    private javax.swing.JTextField reSecurityA;
    private javax.swing.JTextField reSecurityQ;
    private javax.swing.JButton returnMainPage;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
