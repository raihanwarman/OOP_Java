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
public class MahlukTest {
    
    public MahlukTest() {
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
     * Test of delay method, of class Mahluk.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Mahluk instance = new MahlukImpl();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of getUmur method, of class Mahluk.
     */
    @Test
    public void testGetUmur() {
        System.out.println("getUmur");
        Mahluk instance = new MahlukImpl();
        int expResult = 0;
        int result = instance.getUmur();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUmur method, of class Mahluk.
     */
    @Test
    public void testSetUmur() {
        System.out.println("setUmur");
        int u = 0;
        Mahluk instance = new MahlukImpl();
        instance.setUmur(u);
    }

    /**
     * Test of getPositionX method, of class Mahluk.
     */
    @Test
    public void testGetPositionX() {
        System.out.println("getPositionX");
        Mahluk instance = new MahlukImpl();
        int expResult = 0;
        int result = instance.getPositionX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPositionY method, of class Mahluk.
     */
    @Test
    public void testGetPositionY() {
        System.out.println("getPositionY");
        Mahluk instance = new MahlukImpl();
        int expResult = 0;
        int result = instance.getPositionY();
        assertEquals(expResult, result);
    }

    /**
     * Test of getKekuatan method, of class Mahluk.
     */
    @Test
    public void testGetKekuatan() {
        System.out.println("getKekuatan");
        Mahluk instance = new MahlukImpl();
        int expResult = 0;
        int result = instance.getKekuatan();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSymbol method, of class Mahluk.
     */
    @Test
    public void testGetSymbol() {
        System.out.println("getSymbol");
        Mahluk instance = new MahlukImpl();
        char expResult = ' ';
        char result = instance.getSymbol();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelesai method, of class Mahluk.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Mahluk instance = new MahlukImpl();
        instance.setSelesai(b);
    }

    /**
     * Test of getSelesai method, of class Mahluk.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Mahluk instance = new MahlukImpl();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
    }

    /**
     * Test of move method, of class Mahluk.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Mahluk instance = new MahlukImpl();
        instance.move();
    }

    /**
     * Test of mati method, of class Mahluk.
     */
    @Test
    public void testMati() {
        System.out.println("mati");
        Mahluk instance = new MahlukImpl();
        instance.mati();
    }

    /**
     * Test of run method, of class Mahluk.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Mahluk instance = new MahlukImpl();
        instance.run();
    }

    public class MahlukImpl extends Mahluk {

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
