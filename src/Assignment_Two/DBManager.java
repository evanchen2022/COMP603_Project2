/*
 * The programs are designed for PDC paper
 */
package Assignment_Two;

/**
 *
 * P08_16932797_21154481
 */

//import PDC.H_JDBC.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public final class DBManager {

    private static final String USER_NAME = "evan";
    private static final String PASSWORD = "1234";   
    private static final String URL = "jdbc:derby:BookingSystem;create=true";
                                        
    //we can use this one to get connect to the database!
    Connection conn;

    public DBManager() {
        establishConnection();
    }

    public static void main(String[] args) {
        DBManager dbManager = new DBManager();
        //You will find: org.apache.derby.client.net.NetConnection40@7fbe847c
        //That means: Connection conn = new NetConnection();
        System.out.println(dbManager.getConnection());
    }

    // Return the connection
    public Connection getConnection() {
        return this.conn;
    }

    //Establish connection
    public void establishConnection() {
        if (this.conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + "   CONNECTED....");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }
    }

    // Close the connection
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    // Createa statement and executes a query, return result set
    public ResultSet myQuery(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // Create a statment and executes an upate query
    public void myUpdate(String sql) {

        Connection connection = this.conn;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
