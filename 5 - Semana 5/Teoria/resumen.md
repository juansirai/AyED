<h1> Colas de Prioridad </h1>

<h2> Indice </h2>

* [Aplicaciones](#aplicaciones)
* [Definición](#definicion)
* [Distintas implementaciones](#implementaciones)
* [Heap Binaria](#binaria)
  * [Propiedad Estructural](#estructural)
  * [Propiedad de Orden](#orden)
  * [Implementación](#implementacion)
* [Operaciones](#operaciones)
* [Construcción de una Heap: operación BuildHeap](#construccion)
* [Eficiencia](#eficiencia)
* [HeapSort](#sort)

-------------------------------------------------------------------
<h2>Aplicaciones</h2>
<a id="aplicaciones"></a>

* Cola de impresion
* Sistema Operativo
* Algoritmos de ordenación

<h2>Definicion</h2>
<a id="definicion"></a>

Es una estructura de datos que permite al menos dos operaciones:
* `Insert:` Inserta un elemento en la estructura
* `DeleteMin:` Encuentra, recupera y elimina el elemento minimo

<h2>Distintas implementaciones</h2>
<a id="implementaciones"></a>

`Lista Ordenada`: 
* Insert tiene O(N) operaciones
* deleteMin tiene O(1) operaciones

`Lista no ordenada`:
* Insert tiene O(1) operaciones
* deleteMin tiene O(N) operaciones

`Arbol binario de busqueda`:
* Insert y deleteMin tienen un promedio de O(Log N) operaciones.

<h2>HEAP Binaria</h2>
<a id="binaria"></a>

Es una implementación de colas de prioridad que **no usa punteros** y permite implementar
ambas operaciones con **O(logN)** operaciones en el peor de los casos.

Cumple con dos prioridades: 

<h3>1) Propiedad Estructural</h3>
<a id="estructural"></a>

Una heap es un **arbol binario completo**. En un arbol binario completo de altura h
, es un arbol lleno de altura h-1 y en el nivel h los nodos se completan
de izquierda a derecha.

<img src="/images/heapBinaria.PNG" width="600">

En un arbol binario completo de altura H, el numero de nodos satisface:
```
2^h <= N <= 2^(h+1) - 1
```
La altura H del arbol es de O(log N)

Dado que un arbol binario completo es una estructura regular, puede almacenarse en un `arreglo` tal que:
* La raíz esté almacenada en la posicion 1
* Para un elemento en la posición i:
  * El hijo izquierdo está en 2^i
  * El hijo derecho está en 2^(i+1)
  * El padre está en | i/2 |
  * 
<img src="/images/arbolEnArreglo.PNG" width="600">

<h3>2) Propiedad de Orden</h3>
<a id="orden"></a>

`MinHeap`: 
* El elemento minimo está almacenado en la raiz
* El dato almacenado en cada nodo es menor o igual al de sus hijos

`MaxHeap`: 
* Se usa la propiedad inversa

<h3>Implementacion de una HEAP</h3>
<a id="implementacion"></a>

Una Heap H consta de:
* Un arreglo que contiene datos
* Un valor que me indica el numero de elementos almacenados

Ventaja:
* No necesita utilizar punteros
* Facil implementacion en las operaciones