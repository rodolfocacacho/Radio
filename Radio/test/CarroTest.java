/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RodolfoC
 */
public class CarroTest implements Radio {
    
    public CarroTest() {
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
     * Test of ON_OFF method, of class Carro.
     */
    @Test
    public void testON_OFF() {
        System.out.println("ON_OFF");
        Carro instance = new Carro();
        instance.setEstado(true);
        instance.ON_OFF();
        assertFalse("Result should be false",instance.getEstado());
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AM_FM method, of class Carro.
     */
    @Test
    public void testAM_FM() {
        System.out.println("AM_FM");
        Carro instance = new Carro();
        instance.setFrecuencia(true);
        instance.AM_FM();
        assertBooleanEquals("Changed from true to false",false,instance.getFrecuencia());
        // TODO review the generated test code and remove the default call to fail.
        fail("It didn't return false");
    }

    /**
     * Test of Cambio_de_Emisora method, of class Carro.
     */
    @Test
    public void testCambio_de_Emisora() {
        System.out.println("Cambio_de_Emisora");
        boolean upDown = false;
        Carro instance = new Carro();
        instance.Cambio_de_Emisora(upDown);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Guardar_Emisora method, of class Carro.
     */
    @Test
    public void testGuardar_Emisora() {
        System.out.println("Guardar_Emisora");
        int boton = 0;
        Carro instance = new Carro();
        instance.Guardar_Emisora(boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Seleccionar_emisora_guardada method, of class Carro.
     */
    @Test
    public void testSeleccionar_emisora_guardada() {
        System.out.println("Seleccionar_emisora_guardada");
        int boton = 0;
        Carro instance = new Carro();
        instance.Seleccionar_emisora_guardada(boton);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Guardar_seleccion method, of class Carro.
     */
    @Test
    public void testGuardar_seleccion() {
        System.out.println("Guardar_seleccion");
        Carro instance = new Carro();
        instance.Guardar_seleccion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

       
}
