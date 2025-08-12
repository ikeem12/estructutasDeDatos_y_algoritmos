# Anotaciones Big-O

La **notación Big-O** se utiliza para describir el **rendimiento** o la **eficiencia** de un algoritmo, 
en función del tamaño de la entrada (`n`). Es decir, cómo se comporta cuando el tamaño de la entrada 
tiende a infinito. 

La anotacion Big-O evalúa principalmente:

- **Tiempo**: cuánto tarda el algoritmo en ejecutarse.
- **Espacio**: cuánta memoria usa el algoritmo.

## Anotaciones mas comunes

| Notación   | Nombre             | Ejemplo                      |
| ---------- | ------------------ | ---------------------------- |
| O(1)       | Constante          | Acceso a un array por índice |
| O(log n)   | Logarítmica        | Búsqueda binaria             |
| O(n)       | Lineal             | Recorrido de un array        |
| O(n log n) | Lineal logarítmica | MergeSort, QuickSort (avg)   |
| O(n²)      | Cuadrática         | Algoritmo de burbuja         |
| O(2ⁿ)      | Exponencial        | Recursión Fibonacci          |
| O(n!)      | Factorial          | Permutaciones (brute-force)  |

Cuanto más abajo en la tabla, menos eficiente es el algoritmo para grandes entradas (n).

## Detalles de las anotaciones

- O(1) - Constante:
    El algoritmo siempre se ejecuta en el mismo tiempo sin importar el tamaño de entrada.

    ### ejemplo
    
    ````java
        int[] numeros = {10, 20, 30, 40};
        System.out.println(numeros[2]); // acceso O(1)
    ````

    Acceder al índice 2 del array es instantáneo, sin importar si el array tiene 4 elementos o 4 
    millones.
    Esto es posible porque los arrays están almacenados en memoria de forma contigua.

- O(log n) - Logaritmica:

    Cada vez que se ejecuta una operacion, se reduce a la mitad

    ### ejemplo

    busqueda binaria
    
    ````java
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int objetivo = 9;
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (array[medio] == objetivo) break;
            else if (array[medio] < objetivo) inicio = medio + 1;
            else fin = medio - 1;
        }
    ````

    En cada iteración, se  elimina la mitad del array.
    Si se tiene 1000 elementos, se hace como máximo unas 10 comparaciones (log₂(1000) ≈ 10).
    Por eso crece lento, aunque haya muchos datos.

- O(n) - Lineal:
    
    El tiempo crece proporcionalmente al tamaño de la entrada.

    ### ejemplo

    recorrer una array

    ````java
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
    ````

    Si el array tiene 10 elementos, se hace 10 operaciones.
    Si tiene 1.000.000, se hace 1.000.000. Uno a uno.

- O(n²) - Cuadrática:
    
    Típico en bucles anidados. El tiempo crece cuadráticamente.

- O(2^n) - Exponencial:
    El tiempo de ejecución se duplica con cada incremento en el tamaño de la entrada. Muy ineficiente.


## Aplicación DE Big-O

| Estructura del código    | ¿Se analiza?  | Ejemplo de uso                                    |
| -------------------------| --------------|---------------------------------------------------|
| Funciones / Métodos      |  Sí           | `O(1), O(n)` según lógica interna                 |
| Bucles (for, while)      |  Sí           | `O(n), O(n²)` según anidación                     |
| Condicionales (if)       |  Depende      | No cuentan si son simples                         |
| Clases                   |  No           | No se analiza una clase entera, solo sus métodos  |
| Recursividad             |  Sí           | Se analiza por árbol de llamadas                  |
| Llamadas a otros métodos |  Sí           | Se suman o multiplican según cómo se usen         |


## Reglas para combinar complejidades

- **Secuncias** -> se suman, pero domina la más grande

### Ejemplo:

Si el algoritmo haces dos pasos uno después del otro:

Paso 1: O(n)
Paso 2: O(n²)

Resultado: O(n²) ✅ (porque n² crece mucho más que n)

Ejemplo en Java:

````java
// O(n)
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

// O(n²)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + "," + j);
    }
}
// Total: O(n²)
````

- **Operaciones anidadas** -> se multiplican

### Ejemplo:

Si se hace un bucle dentro de otro:

Externo: O(n)
Interno: O(log n)

Resultado: O(n × log n) 

````java
for (int i = 0; i < n; i++) {         // O(n)
    int x = 1;
    while (x < n) {                  // O(log n)
        x *= 2;
    }
}
// Total: O(n log n)
````

- **Constantes** -> se eliminan

### Ejemplo: 

O(2n) → O(n)

````java
for (int i = 0; i < 2 * n; i++) { 
    
    // O(2n) → O(n)
    System.out.println(i);
}

````

- **Diferentes entradas** -> no se mezclan

si hay dos entradas distintas:

O(n) + O(m) → O(n + m)  (no se simplifica porque n y m son independientes)

### Ejemplo: 


````java
void procesar(int[] arr1, int[] arr2) {
    for (int x : arr1) {  // O(n)
        System.out.println(x);
    }
    for (int y : arr2) {  // O(m)
        System.out.println(y);
    }
}
// Total: O(n + m)
````

- La más lenta manda

Si hay O(n²) + O(n) → O(n²)

Si hay O(n log n) + O(n²) → O(n²)

**Regla de oro**: quédarse con el término que crece más rápido.