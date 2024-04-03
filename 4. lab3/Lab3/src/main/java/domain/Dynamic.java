package domain;

import java.util.Arrays;

public class Dynamic {

    public long factorial (int n){

        // Arreglo para almacenar los resultados intermedios
        long[] resultados = new long[n + 1];

        // Inicializamos el primer valor del factorial como 1
        //Caso base
        resultados[0] = 1;

        // Calculamos el factorial de cada número sin usar recursividad
        for (int i = 1; i <= n; i++) {
            resultados[i] = resultados[i - 1] * i;
        }


        return resultados[n];

    }

    public long fibonacci (int n){


        //Caso base
        if(n==0 || n==1){

            return  1;
        }else {

            //Crear un arreglo de tamaño del numero propuesto por el usuario, pero sumando uno mas
            long[] resultados = new long[n + 1];

            // Casos base
            resultados[0] = 0;
            resultados[1] = 1;

            // Fibonacci de manera iterativa
            for (int i = 2; i <= n; i++) {
                resultados[i] = resultados[i - 1] + resultados[i - 2];
            }


            return resultados[n];
        }
    }


    public int coinChange (int[] coins, int amount ){

        int[] tabla = new int[amount + 1];

        //Llenar el arreglo con el valor maximo de un entero
        Arrays.fill(tabla, Integer.MAX_VALUE);
        tabla[0] = 0;

        for (int i = 1; i <= amount; i++) {

            for (int j = 0; j < coins.length; j++) {

                if (coins[j] <= i) {

                    int money = tabla[i - coins[j]]; //Busca la cantidad minima de monedas que se pueden usar para el cambio del monto

                    if (money != Integer.MAX_VALUE && money + 1 < tabla[i]) {

                        // si la condicion se cumple significa que la cantidad de monedas necesarias para formar i con las monedas hasta el índice j es menor que la cantidad actual almacenada en en el arrreglo tabla.
                        tabla[i] = money + 1;

                       //se actualiza el valor almacenado en el arreglo tabla con el valor de money + 1
                    }

                }
            }
        }

        return tabla[amount]; //Retorna el
    }
}
