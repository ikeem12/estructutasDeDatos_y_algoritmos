package Estructuras_de_Datos.arrays;

import java.util.Arrays;

public class ArraysDemo {
    // Ejemplo de declaración y uso de un array en Java
    public static void main(String[] args) {
        int total = 0;
        int[] numeros = {4, 7, 1, 3, 9, 2};
        
        for(int i = 0; i < numeros.length; i++){
            total += numeros[i];
        }

        System.out.println("la suma total del array es: " + total);

        /*------------------------------------------------------------------------ */
        // int[] edades = {18, 21, 17, 30, 25, 15};
        // int limite = 20;
        // int cantidadDeMayores = 0;

        // for(int i = 0; i < edades.length; i++){
        //     if (edades[i] > limite) {
        //         cantidadDeMayores++;
        //     }
        // }

        // System.out.println("la cantidad de personas mayores son : " + cantidadDeMayores);

        /*------------------------------------------------------------------------ */

        int[] edades = {18, 21, 17, 30, 25, 15};
        int limite = -20;
        int cantidadDeMayores = 0;

        for(int i = 0; i < edades.length; i++){
            if (edades[i] > limite) {
                cantidadDeMayores++;
            }
        }

        System.out.println("la cantidad de personas mayores son : " + cantidadDeMayores);

        //si el limite fuera algo negativo todos serian contados como mayores

        /*------------------------------------------------------------------------ */

        int[] datos = {10, 20, 30, 40, 50};
        
        for (int i = 0 ; i < datos.length  / 2 ; i++){
            int temp = datos[i];
            System.out.println(temp);
            datos[i] = datos[datos.length - 1 - i];
            System.out.println(Arrays.toString(datos));
            datos[datos.length - 1 - i] = temp;
            System.out.println(Arrays.toString(datos));
        }
         System.out.println(Arrays.toString(datos));
    } 
}
