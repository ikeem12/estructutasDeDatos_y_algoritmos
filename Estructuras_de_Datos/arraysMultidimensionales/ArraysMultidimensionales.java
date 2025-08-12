package Estructuras_de_Datos.arraysMultidimensionales;

public class ArraysMultidimensionales {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // for (int i = 0; i < matriz.length; i++) {              // Filas
        //     for (int j = 0; j < matriz[i].length; j++) {       // Columnas
        //         System.out.print(matriz[i][j] + " ");
        //     }
        // }

        // System.out.println("--------------------------------------------");

        // for (int i = 0; i < matriz.length; i++) {              // Filas
        //     for (int j = matriz[i].length - 1; j >= 0 ; j--) {       // Columnas
        //         System.out.print(matriz[i][j] + " ");
        //     }
        // }

        // System.out.println("--------------------------------------------");

        // for (int i = matriz.length - 1; i >= 0; i--) {
        //     for (int j = 0; j < matriz[i].length; j++) {
        //         System.out.print(matriz[i][j] + " ");
        //     }
        // }

        // System.out.println("--------------------------------------------");


        // for (int i = 0; i < matriz.length; i++) {
        //     int sumaFila = 0;
        //     for (int j = 0; j < matriz[i].length; j++) {
        //         sumaFila += matriz[i][j];
        //     }
        //     System.out.println("fila " + i + ": " + sumaFila);
        // }


        // int[][] matriz = {
        //     {1, 2, 3},
        //     {4, 5, 6}
        // };

        // int[][] transpuesta = new int[matriz[0].length][matriz.length];

        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz.length; j++) {
        //         transpuesta[j][i] = matriz[i][j];
        //     }
        // }

        // for (int i = 0; i < transpuesta.length; i++) {
        //     for (int j = 0; j < transpuesta[i].length; j++) {
        //         System.out.print(transpuesta[i][j] + " ");
        //     }
        //     System.out.println();
        // }


        System.out.println("/*******************************************************************/");

        System.out.println("Ejersicio 4");

        System.out.println();

        int[][] tabla4x4 = {
            {10, 11, 12, 13},
            {14, 15, 16, 17},
            {18, 19, 20, 21},
            {22, 23, 24, 25}
        };


        System.out.println("Diagonal Principal:");
 
        for (int i = 0; i < tabla4x4.length; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();
        System.out.println();

        System.out.println("Diagonal Secundaria:");
        for (int i = 0; i < matriz.length; i++){
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
    }
}
