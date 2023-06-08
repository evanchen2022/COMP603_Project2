/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

public class HomePageController
{

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
