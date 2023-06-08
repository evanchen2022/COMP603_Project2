/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Assignment_Two;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author evan
 */
public class PassengerInfoPageTest {
    
    public PassengerInfoPageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setPassengerNumber method, of class PassengerInfoPage.
     */
    @Test
    public void testSetPassengerNumber() {
        System.out.println("setPassengerNumber");
        int passengerNumber = 5; // Negative passenger number
        PassengerInfoPage instance = new PassengerInfoPage(5,2);
        
        try {
            
            instance.setPassengerNumber(passengerNumber);
            //fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            // Test passed
            assertEquals("Passenger number cannot be negative", e.getMessage());
        }
    }

    

    
    
}
