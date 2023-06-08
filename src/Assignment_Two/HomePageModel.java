/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

import java.sql.SQLException;

/**
 *
 * Student Name: Zhicong Wang Student ID: 21154481
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
