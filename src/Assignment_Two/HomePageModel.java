/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.SQLException;

/**
 *
 * P08_16932797_21154481
 */

/**
 * This class will generate a HomePageModel, and it will cooperate with HomePageController and HomePage (Viewer Class).
 * It has the DBOperation class built inside, so it has the connection to the database.
 * By using this class, we can create a new table and write the BookedTicket information into the database.
 * 
 */
public class HomePageModel
{

    private DBOperations dbOperations;

    public HomePageModel()
    {
        dbOperations = new DBOperations();
    }

    public void createBookedTicketTable() throws SQLException
    {
        dbOperations.createBookedTicketTable();
    }

    public void writeBookedTicket(String firstName, String lastName, String flightDate, String departCity, String arrivalCity, String flightTime, String classService, String price)
    {
        dbOperations.insertBookedTicket(firstName, lastName, flightDate, departCity, arrivalCity, flightTime, classService, price);
    }

}
