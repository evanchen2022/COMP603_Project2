/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;
/**
 *
 * P08_16932797_21154481
 */

public class HomePageController
{
    // This class to to build up HomePage Controller.
    // It will have two method:
    // 1. for creating BookedTicket table, if the table not exit, will create a new one.
    // 2. for write Booked ticket information into the BookedTicket table.
    private HomePageModel homePageModel;

    public HomePageController(HomePageModel homePageModel)
    {
        this.homePageModel = homePageModel;
    }

    public void createBookedTicketTable()
    {
        try
        {
            homePageModel.createBookedTicketTable();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void writeBookedTicket(String firstName, String lastName, String flightDate, String departCity, String arrivalCity, String flightTime, String classService, String price)
    {
        homePageModel.writeBookedTicket(firstName, lastName, flightDate, departCity, arrivalCity, flightTime, classService, price);
    }

}
