/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_Two;

public class HomeController
{

    private UserModel userModel;

    public HomeController(UserModel userModel)
    {
        this.userModel = userModel;
    }

    public void createBookedTicketTable()
    {
        try
        {
            userModel.createBookedTicketTable();
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
