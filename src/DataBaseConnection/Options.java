package DataBaseConnection;

/**
 * @studentID 19087471
 * @author Dev Vaidya
 */
import java.sql.*;
import javax.swing.*;

public class Options {

    public static ResultSet getData(String query) {
        Connection conn = null;
        Statement state = null;
        ResultSet result = null;

        try {
            conn = ConnectionDB.getConnection();
            state = conn.createStatement();
            result = state.executeQuery(query);
            return result;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
