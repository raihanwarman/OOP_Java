/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Mahluk;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lifeuniverse
 */
public class PenciptaTest {
    
    public PenciptaTest() {
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
     * Test of delay method, of class Pencipta.
     */
    @Test
    public void testDelay() {
        System.out.println("delay");
        int lamaWaktu = 0;
        Pencipta instance = Pencipta.getPencipta();
        instance.delay(10);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Ciptakan method, of class Pencipta.
     */
    @Test
    public void testCiptakan() {
        System.out.println("Ciptakan");
        char x = 'L';
        Pencipta instance = Pencipta.getPencipta();
        instance.Ciptakan(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Pencipta.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Pencipta instance = Pencipta.getPencipta();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of tambah1MatriksBanyakYangMenempati method, of class Pencipta.
     */
    @Test
    public void testTambah1MatriksBanyakYangMenempati() {
        System.out.println("tambah1MatriksBanyakYangMenempati");
        int x = 0;
        int y = 0;
        Pencipta instance = Pencipta.getPencipta();
        instance.tambah1MatriksBanyakYangMenempati(x, y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of kurang1MatriksBanyakYangMenempati method, of class Pencipta.
     */
    @Test
    public void testKurang1MatriksBanyakYangMenempati() {
        System.out.println("kurang1MatriksBanyakYangMenempati");
        int x = 0;
        int y = 0;
        Pencipta instance = Pencipta.getPencipta();
        instance.kurang1MatriksBanyakYangMenempati(x, y);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of beradaDiLaut method, of class Pencipta.
     */
    @Test
    public void testBeradaDiLaut() {
        System.out.println("beradaDiLaut");
        int x = 0;
        int y = 0;
        Pencipta instance = Pencipta.getPencipta();
        boolean expResult = false;
        boolean result = instance.beradaDiLaut(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of bacaPeta method, of class Pencipta.
     */
    @Test
    public void testBacaPeta() {
        System.out.println("bacaPeta");
        String namaBerkas = "";
        Pencipta instance = Pencipta.getPencipta();
        instance.bacaPeta(namaBerkas);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resetKe0MatriksBanyakYangMenempati method, of class Pencipta.
     */
    @Test
    public void testResetKe0MatriksBanyakYangMenempati() {
        System.out.println("resetKe0MatriksBanyakYangMenempati");
        Pencipta instance = Pencipta.getPencipta();
        instance.resetKe0MatriksBanyakYangMenempati();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBanyakMahluk method, of class Pencipta.
     */
    @Test
    public void testGetBanyakMahluk() {
        System.out.println("getBanyakMahluk");
        Pencipta instance = Pencipta.getPencipta();
        int expResult = 100;
        int result = instance.getBanyakMahluk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ambilSelPetaDunia method, of class Pencipta.
     */
    @Test
    public void testAmbilSelPetaDunia() {
        System.out.println("ambilSelPetaDunia");
        int x = 0;
        int y = 0;
        Pencipta instance = Pencipta.getPencipta();
        int expResult = 0;
        int result = instance.ambilSelPetaDunia(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMahluk method, of class Pencipta.
     */
    @Test
    public void testGetMahluk() {
        System.out.println("getMahluk");
        int i = 0;
        Pencipta instance = Pencipta.getPencipta();
        boolean expResult = true;
        Mahluk result = instance.getMahluk(i);
        assertEquals(expResult, result != null);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMatriksBanyakYangMenempati method, of class Pencipta.
     */
    @Test
    public void testGetMatriksBanyakYangMenempati() {
        System.out.println("getMatriksBanyakYangMenempati");
        int x = 0;
        int y = 0;
        Pencipta instance = Pencipta.getPencipta();
        int expResult = 0;
        int result = instance.getMatriksBanyakYangMenempati(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelesai method, of class Pencipta.
     */
    @Test
    public void testGetSelesai() {
        System.out.println("getSelesai");
        Pencipta instance = Pencipta.getPencipta();
        boolean expResult = false;
        boolean result = instance.getSelesai();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBanyakObjek method, of class Pencipta.
     */
    @Test
    public void testGetBanyakObjek() {
        System.out.println("getBanyakObjek");
        Pencipta instance = Pencipta.getPencipta();
        int expResult = 0;
        int result = instance.getBanyakObjek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelesai method, of class Pencipta.
     */
    @Test
    public void testSetSelesai() {
        System.out.println("setSelesai");
        boolean b = false;
        Pencipta instance = Pencipta.getPencipta();
        instance.setSelesai(b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMatiMahluk method, of class Pencipta.
     */
    @Test
    public void testSetMatiMahluk() {
        System.out.println("setMatiMahluk");
        int i = 0;
        Pencipta instance = Pencipta.getPencipta();
        instance.setMatiMahluk(i);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pauseMahluk method, of class Pencipta.
     */
    @Test
    public void testPauseMahluk() {
        System.out.println("pauseMahluk");
        Pencipta instance = Pencipta.getPencipta();
        instance.pauseMahluk();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPencipta method, of class Pencipta.
     */
    @Test
    public void testGetPencipta() {
        System.out.println("getPencipta");
        Pencipta expResult = Pencipta.getPencipta();
        Pencipta result = Pencipta.getPencipta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class Pencipta.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Pencipta instance = Pencipta.getPencipta();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
