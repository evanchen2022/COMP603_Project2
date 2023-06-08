/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Assignment_Two;

import java.time.LocalDate;
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
public class PassengerInfoTest {
    
    public PassengerInfoTest() {
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
     * Test of getFirstName method, of class PassengerInfo.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        PassengerInfo instance = new PassengerInfoImpl();
        instance.setFirstName("Evan");
        String expResult = "Evan";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    public class PassengerInfoImpl extends PassengerInfo {

        public boolean isAdult() {
            return false;
        }

        public boolean isChild() {
            return false;
        }

        public boolean isInfant() {
            return false;
        }
    }
    
}
