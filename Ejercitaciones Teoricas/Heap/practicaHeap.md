<h1>Algoritmos y Estructuras de Datos</h1>
<h2>Ejercitación sobre Colas de Prioridades - Heap</h2>


`Ejercicio 1`

`A partir de una heap inicialmente vacía, inserte de a uno los siguientes valores:
6, 4, 15, 2, 10, 11, 8, 1, 13, 7, 9, 12, 5, 3, 14`

Este ejercicio lo realizaremos con el tradicional Insert, de orden (n logN), que consiste en insertar de a uno cada elemento en ultimo lugar de la heap, y realizar sucesivamente filtrados ascendentes para restaurar al orden.

<img src="img/ejercicio1.png" width=600><br>


`Ejercicio 2`

`a) ¿Cuántos elementos hay, al menos, en una heap de altura h?`
Dado que una heap es un Arbol Binario Completo, como mínimo tenemos 2^h elementos.

`b) ¿Dónde se encuentra ubicado el elemento mínimo en una max-heap?`
En una Max-Heap, el elemento mínimo se encontrará en una hoja.

`c) ¿El siguiente arreglo es una max-heap : [23, 17, 14, 6, 13, 10, 1, 5, 7, 12] ?`

NO, ya que si lo analizamos en forma de arreglo, tenemos que cada nodo en la posición i tiene a sus hijos en 2*i y 2*i+1.<br>
Siendo una max heap, deberíamos verificar que todo elemento en i sea mayor que los respectivos elementos en 2*i y 2*i+1.

Esta propiedad de orden, no se cumple para el elemento 14, que tendría de hijo izquierdo al 10 y de hijo derecho al 1.

`Ejercicio 3`

`Dados los siguientes árboles, indique si representan una heap. Justifique su respuesta`

```
       1
    /    \
   3      7
         / \
        8  9
```
No, ya que no satisface la propiedad estructural, dado que una heap es un arbol binario completo, el último nivel debe completarse de izquierda a derecha.

```
       4
     /   \
    2     7
   / \   / \
  1   3 6   9
```
No, dado que no satisface la propiedad de orden.

Para ser una Min-Heap, el elemento padre debería ser inferior a sus hijos (no se cumple en elemento 4), y para ser una max heap, el elemento padre debería ser superior a sus hijos (tampoco se cumple en elemento 4).

`Ejercicio 4`

`Dibuje todas las min-heaps posibles para este conjunto de claves: {A, B, C, D, E}`

<img src="img/ejercicio4.png" width=600><br>

`Ejercicio 5`

`A partir de una min-heap inicialmente vacía, dibuje la evolución del estado de la heap al ejecutar las siguientes operaciones:`

`Insert(5), Insert(4), Insert(7), Insert(1), DeleteMin(), Insert(3), Insert(6), DeleteMin(), DeleteMin(),
Insert(8), DeleteMin(), Insert(2), DeleteMin(), DeleteMin()`

<img src="img/ejercicio5.png" width=600><br>

`Ejercicio 6`

`Aplique el algoritmo BuildHeap, para construir una min-heap en tiempo lineal, con los siguientes valores`

{150, 80, 40, 10, 70, 110, 30, 120, 140, 60, 50, 130, 100, 20, 90}

De acuerdo algoritmo BuildHeap, insertaremos los elementos en un arbol binario, y a partir de alli comenzaremos a aplicar filtrado hacia abajo desde el elemento en la posicion N/2

<img src="img/ejercicio6.png" width=600><br>

`Ejercicio 7`

`Aplique el algoritmo HeapSort, para ordenar descendentemente los siguientes elementos:`
{15, 18, 40, 1, 7, 10, 33, 2, 140, 500, 11, 12, 13, 90}

`Muestre paso a paso la ejecución del algoritmo sobre los datos`

Para el metodo heap-sort, necesitaremos construir una MinHeap con los elementos que se desean ordenar, intercambiar el último elemento con el primero, decrementar el tamaño de la heap y filtrar hacia abajo.

`Ejercicio 8`

`Construir una max-heap binaria con los siguientes datos:`

{5, 8, 12, 9, 7, 10, 21, 6, 14, 4}

`a) Insertándolos de a uno`

<img src="img/ejercicio8a.png" width=600><br>

`b) Usando el algoritmo BuildHeap`

<img src="img/ejercicio8b.png" width=600><br>

`Ejercicio 9`

`Suponga que una heap que representa una cola de prioridades está almacenada en el arreglo A (se comienza de la posición A[1]). Si insertamos la clave 16, ¿en qué posición quedará?`

<img src="img/ejercicio9.png" width=600><br>

Graficamente, la heap es:
```
                       11
                    /      \
                  21        27
                /   \      /   \
              37    36    34    32
            /  \   /  \   /
           43  44 42  51 62
```
La clave se insertaría en la posición 13 inicialmente. Si luego se realiza un percolate up para restaurar la propiedad de orden, lo primero que haría sería intercambiar lugar con el 34, para posteriormente terminar en el lugar del 27 `(posición 2)`


`Ejercicio 12`

`¿Cuáles de los siguientes arreglos representan una max-heap, min-heap o ninguna de las dos?`
* **arreglo 1: 0 1 2 0 4 5 6 7 8 9** --> ❌ Ninguna
* **arreglo 2: 9 8 7 6 5 4 3 2 1 0** --> ✅ Max Heap
* **arreglo 3: 5 5 5 6 6 6 6 7 7 1** --> ❌ Ninguna
* **arreglo 4: 9 3 9 2 1 6 7 1 2 1** --> ✅ Max Heap
* **arreglo 5: 8 7 6 1 2 3 4 2 1 2** --> ❌ Ninguna


`Ejercicio 13`

`Un arreglo de 7 enteros se ordena ascendentemente usando el algoritmo HeapSort. Luego de la fase inicial del algoritmo (la construcción de la heap), ¿cuál de los siguientes es un posible orden del arreglo? `
* (a) 85 78 45 51 53 47 49
* (b) 85 49 78 45 47 51 53
* (c) 85 78 49 45 47 51 53
* (d) 45 85 78 53 51 49 47
* (e) 85 51 78 53 49 47 45 ✅


`Ejercicio 14`

`En una Heap, ¿para un elemento que está en la posición i su hijo derecho está en la posición` **2*i + 1**

`Ejercicio 15`

`¿Siempre se puede decir que un árbol binario lleno es una Heap?`

NO, ya que eso no garantiza que cumpla con la propiedad de orden

`Ejercicio 16`

`La operación que agrega un elemento a la heap que tiene n elementos, en el peor caso es de` O(log n)

`Ejercicio 17`

`Se construyó una Máx-Heap con las siguientes claves: 13, 21, 87, 30, 25, 22, 18. ¿Cuál de las siguientes opciones corresponde al resultado de realizar la construcción insertando las claves una a una?`
* (a) 87, 30, 25, 22, 21, 18, 13 ❌
* (b) 87, 30, 22, 21, 25, 13, 18 ❌
* (c) 87, 30, 25, 13, 22, 18, 21 ❌
* (d) 87, 30, 22, 13, 25, 21, 18 ✅


`Ejercicio 18`

`Se construyó una Máx-Heap con las siguientes claves: 13, 21, 87, 30, 25, 22, 18. ¿Cuál de las siguientes opciones corresponde al resultado de realizar la construcción aplicando el algoritmo Build-Heap?`
* (a) 87, 30, 25, 22, 21, 18, 13 ❌
* (b) 87, 30, 22, 21, 25, 13, 18 ✅
* (c) 87, 30, 25, 13, 22, 18, 21 ❌
* (d) 87, 30, 22, 13, 25, 21, 18 ❌

`Ejercicio 19`

`El algoritmo HeapSort consta de dos etapas:`
* `1) se construye una heap y`
* `2) se realizan los intercambios necesarios para dejar ordenados los datos.`

`Asuma que la heap ya está construida y es la siguiente:`

58 38 53 23 28 40 35 18

`¿Cómo quedan los datos en el arreglo después de ejecutar sólo 2 pasos de la segunda etapa del Heapsort?`

* (a) 40 38 23 28 35 18 53 58 ❌
* (b) 53 38 40 23 28 18 35 58 ❌
* (c) 40 38 23 35 28 18 53 58 ❌
* (d) 40 38 35 23 28 18 53 58 ✅

`Ejercicio 20`

`Dada la Min-Heap 3, 8, 5, 15, 10, 7, 19, 28, 16, 25, 12. ¿En qué posición está ubicado el hijo derecho de la clave 15?`
* (a) 7 ❌
* (b) 8 ❌
* (c) 9 ✅
* (d) 10 ❌

`Ejercicio 21`

`Construya una min-heap con las siguientes claves: 15, 25, 23, 13, 18, 2, 19, 20, 17 insertándose una a una. Indique en qué posiciones quedaron ubicadas las claves: 2, 18 y 25.`

Quedan dispuestas de la siguiente manera:
* Clave 2: posicion 1
* Clave 18: posicion 5
* Clave 25: posicion 8

`Ejercicio 22`

`Luego de insertar la clave 15 en la siguiente min-heap, ¿cuántas de las claves que ya estaban en la heap han mantenido su lugar (es decir, ocupan en la min-heap resultante la misma posición que ocupaban antes de la inserción)?`

```
                    1
                  /   \
                2      3
              /   \   /  \
            17    19 36   7
          /   \
        25    100
```
La clave 15 se insertar+ia como hija de la 19, debiendo cambiar su lugar con ella.
Queda luego la clave 2 como padre de la 17 y 15, y siendo que estamos en una minheap es correcto.

Por lo tanto, 8 claves permanecen en la misma posicion.


`Ejercicio 23`

`Luego de una operación de borrado del mínimo en la siguiente min-heap, ¿cuántas claves han cambiado de lugar (es decir, ocupan en la min-heap resultante un lugar diferente al que ocupaban en la min-heap antes del borrado) ? (No contar la clave borrada, ya que no pertenece más a la heap)`

```
                    1
                  /   \
                2      3
              /   \   /  \
            17    19 36   7
          /   \
        25    100
```

Luego de la operacion de deleteMin, la heat resultante es:

```
                    2
                  /   \
                17      3
              /   \   /  \
            25    19 36   7
          /   \
        100    X
```

Es por ello que 4 claves ocupan un lugar diferente.
