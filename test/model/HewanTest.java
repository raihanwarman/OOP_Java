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
public class HewanTest {
    
    public HewanTest() {
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
     * Test of delay method, of class Hewan.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Hewan instance = new HewanImpl();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getUmur method, of class Hewan.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Hewan instance = new HewanImpl();
        int expResult = 0;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Hewan.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Hewan instance = new HewanImpl();
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Hewan.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Hewan instance = new HewanImpl();
        boolean expResult = true;
        int result = instance.getPositionX();
        assertEquals(expResult, result >= 0 && result <= 40);
    }

    /**
     * Test of getPositionY method, of class Hewan.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Hewan instance = new HewanImpl();
        boolean expResult = true;
        int result = instance.getPositionY();
        assertEquals(expResult, result >= 0 && result <= 70);
    }

    /**
     * Test of getKekuatan method, of class Hewan.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Hewan instance = new HewanImpl();
        int expResult = 0;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSymbol method, of class Hewan.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Hewan instance = new HewanImpl();
        char expResult = ' ';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelesai method, of class Hewan.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Hewan instance = new HewanImpl();
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Hewan.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Hewan instance = new HewanImpl();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Hewan.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Hewan instance = new HewanImpl();
        instance.move();
    }

    /**
     * Test of mati method, of class Hewan.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Hewan instance = new HewanImpl();
        instance.mati();
    }

    /**
     * Test of run method, of class Hewan.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Hewan instance = new HewanImpl();
        instance.run();
    }

    public class HewanImpl extends Hewan {

        public void delay(int lamaWaktu) {
        }

        public int getUmur() {
            return 0;
        }

        public void setUmur(int u) {
        }

        public int getPositionX() {
            return 0;
        }

        public int getPositionY() {
            return 0;
        }

        public int getKekuatan() {
            return 0;
        }

        public char getSymbol() {
            return ' ';
        }

        public void setSelesai(boolean b) {
        }

        public boolean getSelesai() {
            return false;
        }

        public void move() {
        }

        public void mati() {
        }

        public void run() {
        }
    }
    
}
