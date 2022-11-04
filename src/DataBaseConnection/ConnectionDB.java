package DataBaseConnection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dev Vaidya
 */
public final class ConnectionDB {

    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "jdbc:derby:HotelBS;create=true";
    
    Connection con;
    
    public ConnectionDB() {
        establishConnection();
    }
    
    public static void main(String[] args) {
        ConnectionDB dbManager = new ConnectionDB();
        System.out.println(dbManager.getConnection());
    }
    
    public Connection getConnection() {
        return this.con;
    }
    
    public void establishConnection() {
        if(this.con == null) {
            try {
                con = DriverManager.getConnection(URL, URL, PASSWORD);
                System.out.println(URL +"Connected!");
            } catch (SQLException e) {
                Logger.getLogger(Tables.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    public ResultSet myQuery(String sql) {
        Connection connection = this.con;
        Statement statement = null;
        ResultSet resultset = null;
        
        try {
            statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultset;
    }
    
    public void myUpdate(String sql) {
        Connection connection = this.con;
        Statement statement = null;
        ResultSet resultset = null;
        
        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    Connection con = null;
//    Statement st = null;
//
//    public static Connection getCon() {
//        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            Connection con = DriverManager.getConnection("jdbc:derby:HotelBookingDatabase;create=true", "pdc", "pdc");
//            System.out.println("Database is Connected!");
//            return con;
//
//        } catch (Exception e) {
//            System.out.println("Database Conection Failed!" + e);
//            return null;
//        }
//    }
}
