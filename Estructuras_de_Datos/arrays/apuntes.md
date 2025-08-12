# Arrays

Un array es una estructura de datos que almacena una colección de elementos del 
mismo tipo, Se accede a cada elemento por un índice numérico, comenzando desde 0. 
    
## Tamaño de un array    

Su tamaño suele ser fijo (aunque algunos lenguajes tienen versiones dinámicas)Es decir, una vez creado, no se puede cambiar su 
tamaño.

## Almacenamiento de una array

Un array guarda todos sus elementos juntos y en orden en la memoria RAM, en direcciones contiguas.

Esto permite acceder a cualquier posición usando directamente su índice, en tiempo constante O(1), sin recorrer nada.

| Propiedad                | Descripción                                         |
| ------------------------ | --------------------------------------------------- |
| Tamaño fijo              | Se define al crearlo, no suele crecer dinámicamente |
| Acceso por índice        | Se accede directamente a cualquier posición → O(1)  |
| Homogeneidad             | Todos los elementos deben ser del mismo tipo        |
| Contigüidad en memoria   | Se almacenan en direcciones adyacentes              |

## Complejidad algoritmica en operaciones comunes de un array
    
| Operación          | Complejidad    | Explicación                   |
| ------------------ | -------------- | ----------------------------- |
| Acceso (`arr[i]`)  | O(1)           | Directo al índice             |
| Modificación       | O(1)           | Cambiar un valor es inmediato |
| Recorrido completo | O(n)           | Necesita ver cada elemento    |
| Búsqueda lineal    | O(n)           | No está ordenado              |
| Búsqueda binaria   | O(log n)       | Solo si está ordenado         |


## Cuando usar un array

- Cuando se sabe de antemano cuántos elementos tendrá y de que tipo.
- Cuando se necesita velocidad máxima y control de memoria.
- Cuando se está implementando algoritmos como sorting, búsqueda, etc.


## Formas de recorrer un array

Existen varios patrones útiles para recorrer arrays dependiendo del objetivo:

| Tipo de recorrido      | Inicialización típica                  | Uso común                        |
|------------------------|----------------------------------------|----------------------------------|
| Desde el inicio        | `for (int i = 0; i < n; i++)`          | Lectura completa, suma, búsqueda |
| Desde el final         | `for (int i = n - 1; i >= 0; i--)`     | Recorrido inverso, rotaciones    |
| Desde la mitad         | `for (int i = n / 2; i < n; i++)`      | Análisis parcial, simetrías      |
| Hasta la mitad         | `for (int i = 0; i < n / 2; i++)`      | Intercambios extremos, inversión |

**Nota**: `n` es el tamaño del array (`arr.length` en Java)

Estos patrones son esenciales en muchos algoritmos, como:

- Invertir un array → `hasta la mitad`
- Rotar elementos → `desde el final` o `desde el inicio`
- Comparar mitades → `desde la mitad`