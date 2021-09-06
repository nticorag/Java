package semana5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 

public class calculadoraTest {

    public static calculadora calculadora1;

    public calculadoraTest() {
    }
 
    @BeforeClass //Lo que hace al  antes de iniciar pruebas, solo lo hace una vez
    public static void setUpClass() {
        System.out.println("Before class");
        calculadora1=new calculadora();

    }
 
    @AfterClass //Se ejecuta después de finalizar TODAS las preubas
    public static void tearDownClass() {
        System.out.println("After class");
    }
 
    @Before //Antes de cada prueba
    public void setUp() {
        System.out.println("Before");
    }
 
    @After //Después de cada prueba
    public void tearDown() {
        System.out.println("After");
    }
 
    @Test
    public void prueba1() {
        System.out.println("PRUEBA 1 - The test case is a prototype");
        double a=4;
        double b=2;
        double result=calculadora1.getSuma(a, b);
        double expected=6;
        assertEquals(expected, result,0); //El ultimo parámetro es un intervalo de confianza, donde 0 es totalmente igual
    }

    @Test
    public void prueba2() {
        System.out.println("PRUEBA 2 - The test case is a prototype");
        double a=4;
        double b=2;
        double result=calculadora1.getResta(a, b);
        double expected=2;
        assertEquals(expected, result,0);//El ultimo parámetro es un intervalo de confianza, donde 0 es totalmente igual
    }
 
    @Test
    public void prueba3() {
        System.out.println("PRUEBA 3 - The test case is a prototype");
        double a=4;
        double b=2;
        double result=calculadora1.getMultiplicacion(a, b);
        double expected=8;
        assertEquals(expected, result,1); //El ultimo parámetro es un intervalo de confianza, donde 0 es totalmente igual
    }

    @Test
    public void prueba4() {
        System.out.println("PRUEBA 4 - The test case is a prototype");
        double a=4;
        double b=2;
        double result=calculadora1.getDivision(a, b);
        double expected=2;
        assertEquals(expected, result,0); //El ultimo parámetro es un intervalo de confianza, donde 0 es totalmente igual
    }

    @Test
    public void prueba5() {
        System.out.println("PRUEBA 5 - The test case is a prototype");
        double a=4;
        double b=2;
        assertTrue(a>b);
        assertFalse(a<b);
        assertNotNull(calculadora1);
        assertNull(null);
    }

}