/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Assignment_Two;

import java.sql.ResultSet;
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
public class DBOperationsTest {
    
    public DBOperationsTest() {
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
     * Test of checkExistedTable method, of class DBOperations.
     * This text have to stop the JDBC server because this will need to test the CheckExistedTable method:
     */
    @Test   
    public void testCheckExistedTable() {
        System.out.println("checkExistedTable");
        //checking the null existing table
        String tableName = "XXXXXX";   //checking the null existing table
        DBOperations instance = new DBOperations();
        boolean expResult = false;
        boolean result = instance.checkExistedTable(tableName);
        assertEquals(expResult, result);
        
    }

    
    /**
     * Test of checkUser method, of class DBOperations.
     * This one will testing the CheckUser method, we will test the NOT existing user name.
     * If there is not this name at the database, this method will return this NEW user name.
     */
    @Test
    public void testCheckUser_String() {
        System.out.println("checkUser");
        String inputUser = "autTesting";
        DBOperations instance = new DBOperations();
        String expResult = "autTesting";
        String result = instance.checkUser(inputUser);
        assertEquals(expResult, result);
        
    }

    

    
    
}
