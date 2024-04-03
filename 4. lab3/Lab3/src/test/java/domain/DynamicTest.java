package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicTest {

    Dynamic dm= new Dynamic();


    @Test
    void factorialTest() {

        // Caso de prueba para factorial de 0
        assertEquals(1, dm.factorial(0));

        // Caso de prueba para factorial de 1
        assertEquals(1, dm.factorial(1));

        // Caso de prueba para factorial de 5
        assertEquals(120, dm.factorial(5));

        assertEquals(3628800, dm.factorial(10));

        assertEquals(39916800, dm.factorial(11));

        assertEquals(362880, dm.factorial(9));
    }


    @Test
    void FibonacciTest() {

        // Prueba con n = 0
        assertEquals(1, dm.fibonacci(0));

        // Prueba con n = 1


        assertEquals(1, dm.fibonacci(1));

        assertEquals(1, dm.fibonacci(2));
        assertEquals(2, dm.fibonacci(3));
        assertEquals(3, dm.fibonacci(4));
        assertEquals(5, dm.fibonacci(5));
        assertEquals(8, dm.fibonacci(6));
        assertEquals(13, dm.fibonacci(7));
        assertEquals(21, dm.fibonacci(8));
        assertEquals(34, dm.fibonacci(9));
        assertEquals(55, dm.fibonacci(10));



        assertEquals(6765, dm.fibonacci(20));

    }





    @Test
    void coinChangeTest() {


        int[] monedas1 = {1, 2, 5};
        int monto1 = 5;
        int resultadoEsperado1 = 1;



        int resultado = dm.coinChange(monedas1,monto1);

        if (resultado == resultadoEsperado1) {
            System.out.println("Caso de prueba #1 " + ": PASSED");
        } else {
            System.out.println("Caso de prueba #1 " + ": FAILED (Resultado obtenido: " + resultado + ", Resultado esperado: " + resultadoEsperado1 + ")");

        }

        int[] monedas2 = {2, 3, 7};
        int monto2 = 12;
        int resultadoEsperado2 = 3;

        int resultado2 = dm.coinChange(monedas2,monto2);


        if (resultado2 == resultadoEsperado2) {
            System.out.println("Caso de prueba #2 " + ": PASSED");
        } else {
            System.out.println("Caso de prueba #2 " + ": FAILED (Resultado obtenido: " + resultado2 + ", Resultado esperado: " + resultadoEsperado2 + ")");

        }


        int[] monedas3 = {1, 2, 5,10};
        int monto3 = 23;
        int resultadoEsperado3 = 4;


        int resultado3 = dm.coinChange(monedas3,monto3);

        if (resultado3 == resultadoEsperado3) {
            System.out.println("Caso de prueba #1 " + ": PASSED");
        } else {
            System.out.println("Caso de prueba #1 " + ": FAILED (Resultado obtenido: " + resultado3 + ", Resultado esperado: " + resultadoEsperado3 + ")");

        }

    }



    }
