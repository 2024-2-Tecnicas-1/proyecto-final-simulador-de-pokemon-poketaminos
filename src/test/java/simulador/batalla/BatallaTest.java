/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package simulador.batalla;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simulador.pokemon.Pokemon;

/**
 *
 * @author EQUIPO
 */
public class BatallaTest {
    
    public BatallaTest() {
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
     * Test of iniciarBatalla method, of class Batalla.
     */
    @Test
    public void testIniciarBatalla() {
        System.out.println("iniciarBatalla");
        Pokemon pokemon1 = null;
        Pokemon pokemon2 = null;
        Batalla instance = new Batalla();
        instance.iniciarBatalla(pokemon1, pokemon2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
