/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1688658_javacoursework2019.pkg2020;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author hady
 */
public class WestminsterVehicleRentalManagerTest {
    
    WestminsterVehicleRentalManager rentalManager;
    
    public WestminsterVehicleRentalManagerTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Before Setup!");
        rentalManager = new WestminsterVehicleRentalManager(5);
    }
    
    @After
    public void tearDown() {
        System.out.println("After method tearDown()");
        rentalManager = null;
    }

    /**
     * Test of addVehicle method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testAddVehicle() {
        System.out.println("Add Vehicle!!");
        Car c = new Car("Blue", "BMW", "Z10", "4567QW", 2130.50, "SPORTS", 2, 2);
        rentalManager.addVehicle(c);
        Motorbike b = new Motorbike("Red", "Ducati", "1200cc", "1234www", 23456.43, "Sports", "1300CC", 8);
        rentalManager.addVehicle(b);
        
        System.out.println("Test-1: Two diffrent types od vechile with respective parameters added.");
        
        //expected outcome array
        ArrayList<Vehicle> expArray = new ArrayList<Vehicle>();
        expArray.add(c);
        expArray.add(b);
        
        Assert.assertEquals(rentalManager.vehicleList, expArray);
        
        
    }

    /**
     * Test of deleteVehicle method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testDeleteVehicle() {

    }

    /**
     * Test of printVehicleList method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testPrintVehicleList() {

        
    }

    /**
     * Test of storeInFile method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testStoreInFile() {
    }

    /**
     * Test of openGUI method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testOpenGUI() {
    }

    /**
     * Test of managersMenu method, of class WestminsterVehicleRentalManager.
     */
    @Test
    public void testManagersMenu() {
    }
    
}
