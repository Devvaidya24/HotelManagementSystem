package DataBaseConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class Tables {

    public static void main(String[] args) {
        Connection conn = null;
        Statement state = null;

        try {
            conn = ConnectionDB.getConnection();
            state = conn.createStatement();
            state.executeUpdate("create table HotelBookingCustomers(fullname varchar(200),emailaddress varchar(200),password varchar(50),gender varchar(500),ethnicity varchar(200),address varchar(200),status varchar(200))");
            JOptionPane.showMessageDialog(null, "Created Table Successfully!!!");        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "    Could Not Create Table\n      As It Already Exists!!!");
        } finally {
            try {
                conn.close();
                state.close();
            } catch (Exception e) {

            }
        }
    }
}
