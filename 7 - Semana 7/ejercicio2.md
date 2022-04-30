<h2>Ejercicio 2</h2>

`a) ¿Qué recorridos conoce para recorrer en profundidad un árbol general? Explique brevemente.`

Para recorrer en prudundidad un arbol general, tenemos 3 tipos de recorridos:

* **Recorrido Pre Orden:** Comienza recorriendo primero la raíz, luego el hijo más izquierdo, y luego los restantes hijos derechos.
* **Recorrido In Orden:** Comienza recorriendo primero el hijo mas izquierdo, luego la raíz, luego los hijos más derechos.
* **Recorrido Post Orden:** Comienza recorriendo primero el hijo más izquierdo, luego los restantes hijos derechos, luego la raíz.

`b) ¿Qué recorridos conoce para recorrer por niveles un árbol general? Explique brevemente.`

Para ello tenemos el recorrido por niveles, que consiste en procesar los nodos teniendo en cuenta sus niveles: primero la raiz, luego los hijos, luego los hijos de estos.

Para implementarlo lo que hacemos es manejarnos con una cola y una estructura de arbol auxiliar.<br>
Encolamos la raíz y mientras la cola no esté vacía, desencolamos el elemento, lo procesamos (imprimir, analizar, etc), y encolamos cada hijo de dicho elemento repitiendo el proceso.


`c) ¿Existe alguna diferencia entre los recorridos preorden, postorden, inorden para recorrer los árboles generales respecto de los árboles binarios? Justifique su respuesta.`

Conceptualmente no existe diferencia.<br>
En terminos de implementación si, ya que los arboles binarios tienen a lo sumo 0, 1 o dos hijos (izquierdo y derecho), mientras que con los arboles generales nos podemos manejar con mas de ese numero, dejando de tener tan marcado el concepto de hijo izquierdo y derecho.

`d) ¿Existe alguna noción de orden entre los elementos de un árbol general? Justifique su respuesta.`

Si:
* En terminos de niveles, al igual que los árboles binarios los árboles los nodos de los arboles generales se organizan en niveles de acuerdo a la profundidad del mismo.
* Entre nodos de un mismo nivel, tenemos al hijo mas izquierdo que posee la referencia a su hermano derecho.


`e) En un árbol general se define el grado de un nodo como el número de hijos de ese nodo y el grado del árbol como el máximo de los grados de los nodos del árbol. ¿Qué relación encuentra entre los Árboles Binarios sin tener en cuenta la implementación? Justifique su respuesta. `

La relación es que un arbol general de grado <=2, sería similar a un arbol binario.
