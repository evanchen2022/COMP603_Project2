/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author evan
 */
public class DBOperations
{

    private DBManager dbManager;
    //private static DBOperations instance = null;

    public DBOperations()
    {
        dbManager = new DBManager();
        //createPassengerInfoTable();
    }

//    public static DBOperations getInstance() {
//        if (instance == null) {
//            instance = new DBOperations();
//        }
//        return instance;
//    }
    // Check if a table exists, delete it if exist
    // 改为boolean的method， 返回true or false
    public boolean checkExistedTable(String tableName)
    {
        Connection connection = dbManager.conn;
        boolean tableExists = false;

        try
        {
            DatabaseMetaData dbmd = connection.getMetaData();
            ResultSet rs = dbmd.getTables(null, null, tableName.toUpperCase(), new String[]
            {
                "TABLE"
            });
            tableExists = rs.next();
            rs.close();
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

        return tableExists;
    }

    // Create "BookedTicket" table
    public void createBookedTicketTable()
    {
        if (!checkExistedTable("BookedTicket"))
        {
            Connection connection = dbManager.conn;
            Statement statement = null;

            try
            {

                System.out.println("Creating BookedTicket table in the database...");
                String sqlCreateTable = "CREATE TABLE BookedTicket ("
                        + "ticketID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                        + "firstName VARCHAR(50), "
                        + "lastName VARCHAR(50), "
                        + "flightDate VARCHAR(50), "
                        + "departCity VARCHAR(50), "
                        + "arrivalCity VARCHAR(50), "
                        + "flightTime VARCHAR(20), "
                        + "flightClass VARCHAR(50), "
                        + "price DOUBLE(20))";

                statement = connection.createStatement();
                statement.execute(sqlCreateTable);
                System.out.println("BookedTicket table created successfully.");

            } catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            } finally
            {
                if (statement != null)
                {
                    try
                    {
                        statement.close();
                    } catch (SQLException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }
    }

    // Inserts NEW Booked Ticket information into "BookedTicket" table
    public void insertBookedTicket(String firstName, String lastName, String flightDate, String departCity, String arrivalCity, String flightTime, String classService, String price)
    {
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            System.out.println("Inserting booked Ticket information into the BookedTicket table...");
            String sqlInsert = "INSERT INTO BookedTicket (firstName, lastName, flightDate, departCity, arrivalCity, flightTime, flightClass, price) "
                    + "VALUES ('" + firstName + "', '" + lastName + "', '" + flightDate + "', '" + departCity + "', '" + arrivalCity + "', '" + flightTime + "', '" + classService + "', '" + price + "')";

            statement = connection.createStatement();
            statement.execute(sqlInsert);

            System.out.println("New Booked Ticket inserted successfully.");

        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        } finally
        {
            if (statement != null)
            {
                try
                {
                    statement.close();
                } catch (SQLException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    // Create "PassengerInfo" table
    public void createPassengerInfoTable()
    {
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            checkExistedTable("PassengerInfo");
            System.out.println("Creating PassengerInfo table in the database...");
            String sqlCreateTable = "CREATE TABLE PassengerInfo ("
                    + "passengerID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), "
                    + "firstName VARCHAR(50), "
                    + "lastName VARCHAR(50), "
                    + "passportNumber VARCHAR(50), "
                    + "dob VARCHAR(20), "
                    + "address VARCHAR(100), "
                    + "phoneNumber VARCHAR(20), "
                    + "email VARCHAR(50), "
                    + "clientNumber VARCHAR(20))";

            statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            System.out.println("PassengerInfo table created successfully.");
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        } finally
        {
            if (statement != null)
            {
                try
                {
                    statement.close();
                } catch (SQLException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    // Inserts passenger information into "PassengerInfo" table
    public void insertPassengerInfo(PassengerInfo passenger) {
    Connection connection = dbManager.conn;
    PreparedStatement statement = null;
    String sqlQuery = "INSERT INTO PassengerInfo (firstName, lastName, passportNumber, dob, address, phoneNumber, email, clientNumber) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try {
        statement = connection.prepareStatement(sqlQuery);
        statement.setString(1, passenger.getFirstName());
        statement.setString(2, passenger.getLastName());
        statement.setString(3, passenger.getPassportNumber());
        statement.setString(4, passenger.getDateOfBirth().toString());
        statement.setString(5, passenger.getAddress());
        statement.setString(6, passenger.getPhoneNumber());
        statement.setString(7, passenger.getEmail());
        statement.setString(8, passenger.getClientNumber());
        statement.executeUpdate();
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


    // Create "Users" table
    public void createUsersTable()
    {
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            //checkExistedTable("Users");
            System.out.println("Creating PassengerInfo table in the database...");
            String sqlCreateTable = "CREATE TABLE Users ("
                    + "userID INTEGER PRIMARY KEY, "
                    + "userName VARCHAR(50), "
                    + "password VARCHAR(50), ";

            statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            System.out.println("Users table created successfully.");
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        } finally
        {
            if (statement != null)
            {
                try
                {
                    statement.close();
                } catch (SQLException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
<<<<<<< Updated upstream

=======
    
    public String checkUser(String inputUser)
    {
        String checkedName = null;
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            //checkExisted Users in the table;
            System.out.println("Checking existing User in USers table in the database...");
            
            String sqlCheckFromTable = "Select * from Users where username = '"+inputUser+"'";
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sqlCheckFromTable);

            System.out.println("Checking the Users table........");
            
            if (rs.next())
            {
                checkedName = "nope";
                System.out.println("There is exiting user in here!");
            } else {
                checkedName = inputUser;
            }
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        } 
        
        return checkedName;
    }
    
>>>>>>> Stashed changes
    // Inserts new user information into "Users" table
    public void insertUserInfo(String UserName, String pw)
    {

        Connection connection = dbManager.conn;
        Statement statement = null;
        int numberIndex = 0;

        try
        {
            //check userID numebr first 
            Statement stm = connection.createStatement();
            String sql1 = "SELECT COUNT(*) AS row_count FROM users";
            ResultSet rs = stm.executeQuery(sql1);

            // Retrieve the row count
            if (rs.next())
            {
                numberIndex = rs.getInt("row_count");
            }

            // Insert the new record
            String sql2 = "INSERT INTO users (USERID, USERNAME, PASSWORD) VALUES (?, ?, ?)";
            PreparedStatement pstmt = connection.prepareStatement(sql2);
            pstmt.setInt(1, numberIndex + 1); // Set the USERID value
            pstmt.setString(2, UserName); // Set the USERNAME value
            pstmt.setString(3, pw); // Set the PASSWORD value
            pstmt.executeUpdate();

            System.out.println("New User inserted successfully");
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    // Get passenger information from "PassengerInfo" table
    public ResultSet getLastPassengerInfo(int count)
    {
        Connection connection = dbManager.conn;
        Statement statement = null;
        ResultSet rs = null;

        try
        {
            System.out.println("Fetching last " + count + " passenger info from the PassengerInfo table...");
            String sqlQuery = "SELECT * FROM PassengerInfo ORDER BY passengerID DESC FETCH FIRST " + count + " ROWS ONLY";

            statement = connection.createStatement();
            rs = statement.executeQuery(sqlQuery);

        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

        return rs;
    }

    public void getQuery()
    {

        Connection connection = dbManager.conn;
        Statement statement = null;
        ResultSet rs = null;

        try
        {
            System.out.println("Getting query from the dataset");
            String sqlQuery = "select * from Users";

            statement = connection.createStatement();
            rs = statement.executeQuery(sqlQuery);

            while (rs.next())
            {
                Integer userID = rs.getInt(1);
                String Name = rs.getString(2);
                String PW = rs.getString(3);
                System.out.println("userID: " + userID);
                System.out.println("userName: " + Name);
                System.out.println("userPassword: " + PW);
                System.out.println("");
            }

            rs.close();
        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    public boolean checkUser(String username, String password)
    {
        Connection connection = dbManager.conn;
        PreparedStatement statement = null;
        ResultSet rs = null;

        try
        {
            String sqlQuery = "SELECT * FROM Users WHERE username = ? AND password = ?";
            statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, username);
            statement.setString(2, password);

            rs = statement.executeQuery();

            if (rs.next())
            {
                // User exists
                return true;
            }
            else
            {
                // User doesn't exist
                return false;
            }

        } catch (SQLException ex)
        {
            System.out.println(ex.getMessage());
            return false;
        } finally
        {
            if (rs != null)
            {
                try
                {
                    rs.close();
                } catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
            if (statement != null)
            {
                try
                {
                    statement.close();
                } catch (SQLException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

}
