/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Mahluk;
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
public class DuniaTest {
    
    public DuniaTest() {
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
     * Test of delay method, of class Dunia.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Dunia instance = Dunia.getDunia();
        instance.delay(lamaWaktu);
    }

    /**
     * Test of cariSemuadiXY method, of class Dunia.
     */
    @Test
    public void testCariSemuadiXY() {
        System.out.println("cariSemuadiXY");
        int x = 0;
        int y = 0;
        Dunia instance = Dunia.getDunia();
        ArrayList<Mahluk> expResult = null;
        ArrayList<Mahluk> result = instance.cariSemuadiXY(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of cariIndeksListDiPosisiXYdanUmur method, of class Dunia.
     */
    @Test
    public void testCariIndeksListDiPosisiXYdanUmur() {
        System.out.println("cariIndeksListDiPosisiXYdanUmur");
        int x = 0;
        int y = 0;
        int umur = 0;
        Dunia instance = Dunia.getDunia();
        int expResult = 0;
        int result = instance.cariIndeksListDiPosisiXYdanUmur(x, y, umur);
        assertEquals(expResult, result);
    }

    /**
     * Test of cariIndeksListKekuatanTertinggi method, of class Dunia.
     */
    @Test
    public void testCariIndeksListKekuatanTertinggi() {
        System.out.println("cariIndeksListKekuatanTertinggi");
        int i = 0;
        int j = 0;
        ArrayList<Mahluk> x = null;
        Dunia instance = Dunia.getDunia();
        int expResult = 0;
        int result = instance.cariIndeksListKekuatanTertinggi(i, j, x);
        assertEquals(expResult, result);
    }

    /**
     * Test of updateLayar method, of class Dunia.
     */
    @Test
    public void testUpdateLayar() {
        System.out.println("updateLayar");
        Dunia instance = Dunia.getDunia();
        instance.updateLayar();
    }

    /**
     * Test of cetakMatriks method, of class Dunia.
     */
    @Test
    public void testCetakMatriks() {
        System.out.println("cetakMatriks");
        Dunia instance = Dunia.getDunia();
        instance.cetakMatriks();
    }

    /**
     * Test of gameOver method, of class Dunia.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        Dunia instance = Dunia.getDunia();
        instance.gameOver();
    }

    /**
     * Test of getDunia method, of class Dunia.
     */
    @Test
    public void testGetDunia() {
        System.out.println("getDunia");
        Dunia expResult = Dunia.getDunia();
        Dunia result = Dunia.getDunia();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class Dunia.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Dunia instance = Dunia.getDunia();
        instance.run();
    }
    
}
