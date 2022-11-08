package DataBaseConnection;

import java.sql.*;

/**
 *
 * @author Dev Vaidya
 */
public class ConnectionDB { //final class for connection databse

    //initializing static final variables such as url of derby, password and username of the database
    private static final String URL = "jdbc:derby:HotelBS;create=true";
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";

    //calling connections object as connection
    Connection conn;

    //constructor for connection class that established the connection
    public ConnectionDB() {
        establishConnection();
    }

    //main class to test
    public static void main(String[] args) {
        ConnectionDB connDB = new ConnectionDB();
        System.out.println(connDB);
    }

    //get connection method to get connection for embedded 
    public static Connection getConnection() {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            return conn;
        } catch (Exception e) {
            return null;
        }
    }

    //establish connection method called earlier which calls user name password and url and allows to authorise
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println("Database Connected Successfully!!!");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //close connection method that closes the connection
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //query data base method that stores the three objects and calls statement to result set method using the string sql
    public ResultSet queryDB(String sql) {
        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultSet;
    }

    //update database method which updates any type of data 
    public void updateDB(String sql) {
        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
