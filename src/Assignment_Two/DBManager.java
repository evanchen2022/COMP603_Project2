/*
 * The programs are designed for PDC paper
 */
package Assignment_Two;

//import PDC.H_JDBC.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Weihua
 * ****************************************************************** 
 * @Note Database Connection Component
 * @Embedded database example: private String url="jdbc:derby:PlayerDB;create=true";
 * @Embedded database can be copied to the root of the project folder
 * @Embedded derby dataBase must have two jars referenced: derbyclient.jar and derby.jar
 * @Online URL example: url="jdbc:derby://localhost:1527/PlayerDB;create=true"
 * ********************************************************************
 */
public final class DBManager {

    private static final String USER_NAME = "evan";
    private static final String PASSWORD = "1234";   
    private static final String URL = "jdbc:derby:BookingSystem;create=true";
                                        //jdbc:derby://localhost:1527/BookingSystem
                                        //jdbc:derby:BookingSystem;create=true
    //we can use this one to get connect to the database!!!!!!!
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

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

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
