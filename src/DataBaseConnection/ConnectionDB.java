package DataBaseConnection;

import java.sql.*;

/**
 *
 * @author Dev Vaidya
 */
public class ConnectionDB {

    Connection con = null;
    Statement state = null;

    public static Connection connectionDataBase() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection con = DriverManager.getConnection("jdbc:derby:HotelBookingDatabase;create=true", "pdc", "pdc");
            System.out.println("Database is Connected!");
            return con;

        } catch (Exception e) {
            System.out.println("Database Conection Failed!" + e);
        }
        return null;
    }
}
