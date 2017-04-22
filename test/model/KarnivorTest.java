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
public class KarnivorTest {
    
    public KarnivorTest() {
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
     * Test of delay method, of class Karnivor.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Karnivor instance = new Karnivor();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getSymbol method, of class Karnivor.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Karnivor instance = new Karnivor();
        char expResult = 'K';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Karnivor.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Karnivor instance = new Karnivor();
        instance.move();
    }

    /**
     * Test of getCriticalHit method, of class Karnivor.
     */
    @Test
    public void testGetCriticalHit() {
        System.out.println("getCriticalHit");
        Karnivor instance = new Karnivor();
        boolean expResult = true;
        boolean result = instance.getCriticalHit();
        assertEquals(expResult, result);
    }

    /**
     * Test of lostCriticalHit method, of class Karnivor.
     */
    @Test
    public void testLostCriticalHit() {
        System.out.println("lostCriticalHit");
        Karnivor instance = new Karnivor();
        instance.lostCriticalHit();
    }

    /**
     * Test of mati method, of class Karnivor.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Karnivor instance = new Karnivor();
        instance.mati();
    }

    /**
     * Test of getKekuatan method, of class Karnivor.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Karnivor instance = new Karnivor();
        int expResult = 9;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUmur method, of class Karnivor.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Karnivor instance = new Karnivor();
        int expResult = 50;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Karnivor.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Karnivor instance = new Karnivor();
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Karnivor.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Karnivor instance = new Karnivor();
        boolean expResult = true;
        int result = instance.getPositionX();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of getPositionY method, of class Karnivor.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Karnivor instance = new Karnivor();
        boolean expResult = true;
        int result = instance.getPositionY();
        assertEquals(expResult, result >= 0 && result <= 70);
    }

    /**
     * Test of setSelesai method, of class Karnivor.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Karnivor instance = new Karnivor();
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Karnivor.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Karnivor instance = new Karnivor();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class Karnivor.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Karnivor instance = new Karnivor();
        instance.run();
    }
    
}
