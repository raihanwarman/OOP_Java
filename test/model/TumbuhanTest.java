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
public class TumbuhanTest {
    
    public TumbuhanTest() {
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
     * Test of getSymbol method, of class Tumbuhan.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Tumbuhan instance = new Tumbuhan();
        char expResult = 'T';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Tumbuhan.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Tumbuhan instance = new Tumbuhan();
        instance.move();
    }

    /**
     * Test of mati method, of class Tumbuhan.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Tumbuhan instance = new Tumbuhan();
        instance.mati();
    }

    /**
     * Test of delay method, of class Tumbuhan.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Tumbuhan instance = new Tumbuhan();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getKekuatan method, of class Tumbuhan.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Tumbuhan instance = new Tumbuhan();
        int expResult = 0;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUmur method, of class Tumbuhan.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Tumbuhan instance = new Tumbuhan();
        int expResult = 100;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Tumbuhan.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Tumbuhan instance = new Tumbuhan();
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Tumbuhan.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Tumbuhan instance = new Tumbuhan();
        boolean expResult = true;
        int result = instance.getPositionX();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of getPositionY method, of class Tumbuhan.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Tumbuhan instance = new Tumbuhan();
        boolean expResult = true;
        int result = instance.getPositionY();
        assertEquals(expResult, result >= 0 && result <= 70);
    }

    /**
     * Test of setSelesai method, of class Tumbuhan.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Tumbuhan instance = new Tumbuhan();
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Tumbuhan.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Tumbuhan instance = new Tumbuhan();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRacun method, of class Tumbuhan.
     */
    @Test
    public void testGetRacun() {
        System.out.println("getRacun");
        Tumbuhan instance = new Tumbuhan();
        int expResult = 5;
        int result = instance.getRacun();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class Tumbuhan.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Tumbuhan instance = new Tumbuhan();
        instance.run();
    }
    
}
