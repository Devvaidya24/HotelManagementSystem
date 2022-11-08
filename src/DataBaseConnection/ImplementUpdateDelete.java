package DataBaseConnection;

import java.sql.*;
import javax.swing.*;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
public final class ImplementUpdateDelete { //update and delete seperate class

    //set data method to
    public static void setData(String Query, String message) {
        Connection conn = null;
        Statement state = null;

        try {
            conn = ConnectionDB.getConnection();
            state = conn.createStatement();
            state.executeUpdate(Query);

            if (!message.equals("")) {
                JOptionPane.showMessageDialog(null, message);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {

            } catch (Exception e) {

            }
        }
    }
}
