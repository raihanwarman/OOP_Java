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
public class HerbivorTest {
    
    public HerbivorTest() {
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
     * Test of delay method, of class Bird.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Bird instance = new Bird();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getSymbol method, of class Bird.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Bird instance = new Bird();
        char expResult = 'H';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Bird.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Bird instance = new Bird();
        instance.move();
    }

    /**
     * Test of getArmor method, of class Bird.
     */
    @Test
    public void testGetArmor() {
        System.out.println("getArmor");
        Bird instance = new Bird();
        int expResult = 5;
        int result = instance.getArmor();
        assertEquals(expResult, result);
    }

    /**
     * Test of mati method, of class Bird.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Bird instance = new Bird();
        instance.mati();
    }

    /**
     * Test of getKekuatan method, of class Bird.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Bird instance = new Bird();
        int expResult = 7;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUmur method, of class Bird.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Bird instance = new Bird();
        int expResult = 50;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Bird.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Bird instance = new Bird();
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Bird.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Bird instance = new Bird();
        boolean expResult = true;
        int result = instance.getPositionX();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of getPositionY method, of class Bird.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Bird instance = new Bird();
        boolean expResult = true;
        int result = instance.getPositionY();
        assertEquals(expResult, result >= 0 && result <= 70);
    }

    /**
     * Test of setSelesai method, of class Bird.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Bird instance = new Bird();
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Bird.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Bird instance = new Bird();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class Bird.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Bird instance = new Bird();
        instance.run();
    }
    
}
