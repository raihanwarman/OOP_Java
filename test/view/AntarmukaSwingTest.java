/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
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
public class AntarmukaSwingTest {
    
    public AntarmukaSwingTest() {
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
     * Test of getAntarmukaSwing method, of class AntarmukaSwing.
     */
    @Test
    public void testGetAntarmukaSwing() {
        System.out.println("getAntarmukaSwing");
        AntarmukaSwing expResult = AntarmukaSwing.getAntarmukaSwing();
        AntarmukaSwing result = AntarmukaSwing.getAntarmukaSwing();
        assertEquals(expResult, result);
    }

    /**
     * Test of cariListDiPosisiXY method, of class AntarmukaSwing.
     */
    @Test
    public void testCariListDiPosisiXY() {
        System.out.println("cariListDiPosisiXY");
        int x = 0;
        int y = 0;
        AntarmukaSwing instance = AntarmukaSwing.getAntarmukaSwing();
        Mahluk expResult = null;
        Mahluk result = instance.cariListDiPosisiXY(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of render method, of class AntarmukaSwing.
     */
    @Test
    public void testRender() {
        System.out.println("render");
        Graphics2D g2;
        //g2 = Graphics2D new ();
        AntarmukaSwing instance = AntarmukaSwing.getAntarmukaSwing();
        //instance.render(g2);
    }

    /**
     * Test of paint method, of class AntarmukaSwing.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        //Graphics g = new Graphics();
        AntarmukaSwing instance = AntarmukaSwing.getAntarmukaSwing();
        //instance.paint(g);
    }

    /**
     * Test of actionPerformed method, of class AntarmukaSwing.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        AntarmukaSwing instance = AntarmukaSwing.getAntarmukaSwing();
        instance.actionPerformed(e);
    }
    
    
    
}
