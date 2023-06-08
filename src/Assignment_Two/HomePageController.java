/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

public class HomePageController
{

    private HomePageModel bookingModel;

    public HomePageController(HomePageModel bookingModel)
    {
        this.bookingModel = bookingModel;
    }

    public void createBookedTicketTable()
    {
        try
        {
            bookingModel.createBookedTicketTable();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
