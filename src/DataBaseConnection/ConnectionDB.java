package DataBaseConnection;

import java.sql.*;

/**
 *
 * @author Dev Vaidya
 */
public final class ConnectionDB {

    private static final String URL = "jdbc:derby:HotelBS;create=true";
    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";

    Connection conn;

    public ConnectionDB() {
        establishConnection();
    }

    public static void main(String[] args) {
        ConnectionDB connDB = new ConnectionDB();
        System.out.println(connDB);
    }

    public Connection getConnection() {
        return this.conn;
    }

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

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

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
//    public static Connection getConn() throws ClassNotFoundException{
//        try {
//            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//            Connection conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
//            System.out.println(URL + "Database Connected!!!");
//            return conn;
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Database Failed to Connect!!!");
//            return null;
//        }
//    }
}
