package anotaciones_BigO;

public class Ejersicios {
    
    void printFirstItem(int[] arr) {
        // seria O(1) porque accede directamnete al primer elemento del arreglo
        System.out.println(arr[0]);
    }

    // B
    void printAllItems(int[] arr) {
        // seria O(n) porque el bucle se va ejecutar dependiendo de la cantidad de datos que tenga arr
        for (int item : arr) {
            System.out.println(item);
        }
    }

    void printAllPairs(int[] arr) {
        // seria O(n x n) porque son operaciones anidadas pero se simplifica a O(n²)
        for (int i : arr) {
            for (int j : arr) {
                System.out.println(i + ", " + j);
            }
        }
    }

    void doStuff(int[] arr) {
        // esto bloque seria O(2n) pero se eliminan constantes y queda O(n)
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // este bloque seria O(n²)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }

        /*
            entoces la complejidad de esta metodo seria O(n²), porque:

            bloque 1: O(n)

            bloque 2: O(n²)

            Total: O(n + n²)    

            pero en Big-O, se queda con el término dominante, es decir el que crece más rápido cuando n es grande.
        */
    }

    int fibonacci(int n) {

        //seria O(2^n)
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    void complexMethod(int[] arr) {
        int a = 5;                              // O(1)
        int b = 10;                             // O(1)

        for (int i = 0; i < arr.length; i++) {  // O(n)
            a += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {  // O(n)
            for (int j = 0; j < arr.length; j++) {  // O(n)
                b += arr[i] * arr[j];
            }
        }

        /*
            Complejidad temporal:
            - Primer for: O(n)
            - Segundo for anidado: O(n²)
            - Total: O(n + n²) → O(n²)

            Complejidad espacial:
            - Solo se usan variables escalares: O(1)
        */
    }
}
