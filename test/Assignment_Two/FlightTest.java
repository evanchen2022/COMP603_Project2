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
public class FlightTest {
    
    public FlightTest() {
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
     * Test of getDeparture method, of class Flight.
     */
    @Test
    public void testGetDeparture() {
        System.out.println("getDeparture");
        Flight instance = new Flight("Auckland", "SH", "2023-09-09", "8AM");
        String expResult = "Auckland";
        String result = instance.getDeparture();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setDeparture method, of class Flight.
     */
//    @Test
//    public void testSetDeparture() {
//        System.out.println("setDeparture");
//        String departure = "";
//        Flight instance = null;
//        instance.setDeparture(departure);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDestination method, of class Flight.
//     */
//    @Test
//    public void testGetDestination() {
//        System.out.println("getDestination");
//        Flight instance = null;
//        String expResult = "";
//        String result = instance.getDestination();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDestination method, of class Flight.
//     */
//    @Test
//    public void testSetDestination() {
//        System.out.println("setDestination");
//        String destination = "";
//        Flight instance = null;
//        instance.setDestination(destination);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDate method, of class Flight.
//     */
//    @Test
//    public void testGetDate() {
//        System.out.println("getDate");
//        Flight instance = null;
//        String expResult = "";
//        String result = instance.getDate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDate method, of class Flight.
//     */
//    @Test
//    public void testSetDate() {
//        System.out.println("setDate");
//        String date = "";
//        Flight instance = null;
//        instance.setDate(date);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTime method, of class Flight.
//     */
//    @Test
//    public void testGetTime() {
//        System.out.println("getTime");
//        Flight instance = null;
//        String expResult = "";
//        String result = instance.getTime();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTime method, of class Flight.
//     */
//    @Test
//    public void testSetTime() {
//        System.out.println("setTime");
//        String time = "";
//        Flight instance = null;
//        instance.setTime(time);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of toString method, of class Flight.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Flight instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
