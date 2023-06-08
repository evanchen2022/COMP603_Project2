/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Assignment_Two;

import java.sql.Connection;
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
public class DBManagerTest {
    
    public DBManagerTest() {
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
     * Test of main method, of class DBManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        DBManager.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getConnection method, of class DBManager.
     */
    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        DBManager instance = new DBManager();
        Connection expResult = instance.conn;
        Connection result = instance.getConnection();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of establishConnection method, of class DBManager.
     */
//    @Test
//    public void testEstablishConnection() {
//        System.out.println("establishConnection");
//        DBManager instance = new DBManager();
//        instance.establishConnection();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of closeConnections method, of class DBManager.
//     */
    
//
//    /**
//     * Test of myQuery method, of class DBManager.
//     */
//    @Test
//    public void testMyQuery() {
//        System.out.println("myQuery");
//        String sql = "";
//        DBManager instance = new DBManager();
//        ResultSet expResult = null;
//        ResultSet result = instance.myQuery(sql);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of myUpdate method, of class DBManager.
//     */
//    @Test
//    public void testMyUpdate() {
//        System.out.println("myUpdate");
//        String sql = "";
//        DBManager instance = new DBManager();
//        instance.myUpdate(sql);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
