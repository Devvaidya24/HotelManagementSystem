package DataBaseConnection;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public class Tables { //table method for creating tables

    public static void main(String[] args) {
        Connection conn = null;
        Statement state = null;

        try {
            //calling connections 
            conn = ConnectionDB.getConnection();
            state = conn.createStatement();
            //Creates the tables for hotel customer details and room details
            state.executeUpdate("create table HotelBookingCustomers(fullname varchar(500),emailaddress varchar(500),password varchar(500),gender varchar(500),securityquestion varchar(500),answer varchar(500),ethnicity varchar(500),address varchar(500))");
            state.executeUpdate("create table room(roomnumber varchar(500),roomtype varchar(500),bedtype varchar(300),totalcost varchar(500),status varchar(100))");
            state.executeUpdate("create table checkin(name varchar(200), number varchar(200), email varchar(200), gender varchar(100), date varchar(100), bed varchar(200), roomtype varchar(200), roomnumber varchar(200), totalcost varchar(500))");
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
