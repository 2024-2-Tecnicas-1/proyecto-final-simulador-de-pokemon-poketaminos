/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package simulador.entrenador;

import java.util.List;
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
public class EntrenadorTest {
    
    public EntrenadorTest() {
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
     * Test of getNombre method, of class Entrenador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Entrenador instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPokemones method, of class Entrenador.
     */
    @Test
    public void testGetPokemones() {
        System.out.println("getPokemones");
        Entrenador instance = null;
        List<Pokemon> expResult = null;
        List<Pokemon> result = instance.getPokemones();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarPokemon method, of class Entrenador.
     */
    @Test
    public void testAgregarPokemon() {
        System.out.println("agregarPokemon");
        Pokemon pokemon = null;
        Entrenador instance = null;
        instance.agregarPokemon(pokemon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of entrenarPokemon method, of class Entrenador.
     */
    @Test
    public void testEntrenarPokemon() {
        System.out.println("entrenarPokemon");
        Pokemon pokemon = null;
        Entrenador instance = null;
        instance.entrenarPokemon(pokemon);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarPokemones method, of class Entrenador.
     */
    @Test
    public void testMostrarPokemones() {
        System.out.println("mostrarPokemones");
        Entrenador instance = null;
        instance.mostrarPokemones();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prepararBatalla method, of class Entrenador.
     */
    @Test
    public void testPrepararBatalla() {
        System.out.println("prepararBatalla");
        int indice = 0;
        Entrenador instance = null;
        Pokemon expResult = null;
        Pokemon result = instance.prepararBatalla(indice);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
