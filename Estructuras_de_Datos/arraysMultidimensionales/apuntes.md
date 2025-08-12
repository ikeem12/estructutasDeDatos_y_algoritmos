# Arrays Multidimensionales

Un array multidimensional es una estructura de datos que contiene arrays dentro de arrays.

El más común es el array bidimensional(matriz), que representa datos en forma de tabla con filas y columnas.

````java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Acceso: matriz[fila][columna]
matriz[1][2] = 6
````

También hay arrays tridimensionales, que me permiten representar estructuras más complejas como cubos o secuencias de imágenes.

````java
int[][][] cubo = {
    {
        {1, 2, 6}, 
        {3, 4, 9}
    },
    {
        {5, 6, 2}, 
        {7, 8, 1}
    }
};

// Acceso: cubo[seccion][fila][columna]
cubo[1][0][1] = 6;
````

## Propiedades de una matriz 

| Propiedad           | Descripción                                           |
|---------------------|-------------------------------------------------------|
| Bidimensional       | Organizada en filas y columnas (filas x columnas)     |
| Acceso directo      | Se accede a cada valor con índices [i][j] → O(1)      |
| Tamaño fijo         | Se define al crearla (como arrays normales)           |
| Recorrido anidado   | Se usa un bucle dentro de otro para recorrerla        |
| Homogeneidad        | Todos los elementos deben ser del mismo tipo          |

    
## Cuando usar matrices
 
- Cuando se necesita representar una tabla de datos o un tablero (como ajedrez).
- Para problemas con coordenadas, mapas, gráficas, pixeles, etc.
- En algoritmos clásicos: BFS/DFS en grids, Floyd-Warshall, dinámicas, etc.