/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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
    }

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

    // Create "PassengerInfo" table
    public void createPassengerInfoTable()
    {
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            if (!checkExistedTable("PassengerInfo"))
            {
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
            }
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
    public void insertPassengerInfo(String firstName, String lastName, String passportNumber, String dob, String address, String phoneNumber, String email, String clientNumber)
    {
        Connection connection = dbManager.conn;
        Statement statement = null;

        try
        {
            System.out.println("Inserting passenger info into the PassengerInfo table...");
            String sqlInsert = "INSERT INTO PassengerInfo (firstName, lastName, passportNumber, dob, address, phoneNumber, email, clientNumber) "
                    + "VALUES ('" + firstName + "', '" + lastName + "', '" + passportNumber + "', '" + dob + "', '" + address + "', '" + phoneNumber + "', '" + email + "', '" + clientNumber + "')";

            statement = connection.createStatement();
            statement.execute(sqlInsert);

            System.out.println("Passenger info inserted successfully.");
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
}
