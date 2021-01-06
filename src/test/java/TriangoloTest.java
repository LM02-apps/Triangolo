/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Melone
 */
public class TriangoloTest {
    
    public TriangoloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Tipologia method, of class Triangolo.
     */
    @Test
    public void testTipologia() {
        System.out.println("Tipologia");
        Triangolo instance = new Triangolo (8.0,6.0,10.0);
        String expResult = "scaleno, rettangolo";
        String result = instance.Tipologia();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of Perimetro method, of class Triangolo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("Perimetro");
        Triangolo instance = new Triangolo (8.0,6.0,10.0);
        double expResult = 24.0;
        double result = instance.Perimetro();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of Area method, of class Triangolo.
     */
    @Test
    public void testArea() {
        System.out.println("Area");
        Triangolo instance = new Triangolo (8.0,6.0,10.0);
        double expResult = 24.0;
        double result = instance.Area();
        assertEquals(expResult, result, 0.0);

    }
    
}
