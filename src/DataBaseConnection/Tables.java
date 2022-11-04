package DataBaseConnection;

/**
 *
 * @author Dev Vaidya
 */
import java.sql.*;
import javax.swing.*;

public class Tables {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        
        try 
        {
            con = ConnectionDB.connectionDataBase();
            st = con.createStatement();
            st.executeUpdate("create table users(fullname varchar[200], email varchar[200], password varchar[100], gender varchar [200], phonenumber varchar[200], address varchar[200], status varchar[30])");
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
           try 
        {
            con.close();
            st.close();
        }
        catch (Exception e)
        {} 
        }
    }
}
