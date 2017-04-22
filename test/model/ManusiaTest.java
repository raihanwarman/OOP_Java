/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raihanwarman
 */
public class ManusiaTest {
    
    public ManusiaTest() {
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
     * Test of delay method, of class Manusia.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Manusia instance = new Manusia(true);
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getKekuatan method, of class Manusia.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Manusia instance =new Manusia(true);
        int expResult = 10;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUmur method, of class Manusia.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Manusia instance = new Manusia(true);
        int expResult = 75;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Manusia.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Manusia instance = new Manusia(true);
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Manusia.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Manusia instance = new Manusia(true);
        boolean expResult = true;
        int result = instance.getPositionX();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of getPositionY method, of class Manusia.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Manusia instance = new Manusia(true);
        boolean expResult = true;
        int result = instance.getPositionY();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of setSelesai method, of class Manusia.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Manusia instance = new Manusia(true);
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Manusia.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Manusia instance = new Manusia(true);
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSymbol method, of class Manusia.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Manusia instance = new Manusia(true);
        char expResult = 'L';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Manusia.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Manusia instance = new Manusia(true);
        instance.move();
    }

    /**
     * Test of mati method, of class Manusia.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Manusia instance = new Manusia(true);
        instance.mati();
    }

    /**
     * Test of getJenisKelamin method, of class Manusia.
     */
    @Test
    public void testGetJenisKelamin() {
        System.out.println("getJenisKelamin");
        Manusia instance = new Manusia(true);
        boolean expResult = true;
        boolean result = instance.getJenisKelamin();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class Manusia.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Manusia instance = new Manusia(true);
        instance.run();
    }
    
}
