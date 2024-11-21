/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package simulador.pokemon;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author EQUIPO
 */
public class PokemonTest {
    
    public PokemonTest() {
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
     * Test of getNombre method, of class Pokemon.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Pokemon instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalud method, of class Pokemon.
     */
    @Test
    public void testGetSalud() {
        System.out.println("getSalud");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getSalud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSalud method, of class Pokemon.
     */
    @Test
    public void testSetSalud() {
        System.out.println("setSalud");
        int salud = 0;
        Pokemon instance = null;
        instance.setSalud(salud);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPuntosDeAtaque method, of class Pokemon.
     */
    @Test
    public void testGetPuntosDeAtaque() {
        System.out.println("getPuntosDeAtaque");
        Pokemon instance = null;
        int expResult = 0;
        int result = instance.getPuntosDeAtaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPuntosDeAtaque method, of class Pokemon.
     */
    @Test
    public void testSetPuntosDeAtaque() {
        System.out.println("setPuntosDeAtaque");
        int puntosDeAtaque = 0;
        Pokemon instance = null;
        instance.setPuntosDeAtaque(puntosDeAtaque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Pokemon.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Pokemon instance = null;
        TipoPokemon expResult = null;
        TipoPokemon result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atacar method, of class Pokemon.
     */
    @Test
    public void testAtacar() {
        System.out.println("atacar");
        Pokemon oponente = null;
        Pokemon instance = null;
        instance.atacar(oponente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recibirDaño method, of class Pokemon.
     */
    @Test
    public void testRecibirDaño() {
        System.out.println("recibirDa\u00f1o");
        int daño = 0;
        Pokemon instance = null;
        instance.recibirDaño(daño);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entrenar method, of class Pokemon.
     */
    @Test
    public void testEntrenar() {
        System.out.println("entrenar");
        Pokemon instance = null;
        instance.entrenar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PokemonImpl extends Pokemon {

        public PokemonImpl() {
            super("", 0, 0, null);
        }
    }
    
}
