*Ejercicio 1
Teniendo en cuenta las dos representaciones de grafos: Matriz de Adyacencias y Lista de Adyacencias.
a. Bajo qué condiciones usaría una Matriz de Adyacencias en lugar de una Lista de Adyacencias para
representar un grafo. Y una Lista de Adyacencias en lugar de una Matriz de Adyacencias.
Fundamentar.
b. ¿En función de qué parámetros resulta apropiado realizar la estimación del orden de ejecución para
algoritmos sobre grafos densos? ¿Y para algoritmos sobre grafos dispersos? Fundamentar.
c. Si representamos un grafo no dirigido usando una Matriz de Adyacencias, ¿cómo sería la matriz
resultante? Fundamentar*

a) La `matriz de adyacencias`, la utilizaría para grafos con poca cantidad de vértices, o cuando son grafos muy densos.<br>
Esto es debido a que con este tipo de representación, la matriz se completa con 1 cuando existe arista entre vértices, y 0 cuando no. En caso de grafos que no son densos, la matriz quedaría con mucha cantidad de ceros, y estaríamos desperdiciando espacio.<br>
El costo espacial de este tipo de grafos es el número de vértices al cuadrado.<br>
Por otro lado, la ventaja es que el costo de tiempo de acceder a una posición dada, es de O(1), ya que tenemos perfectamente indexados los elementos.

Por su parte, la `lista de adyacencias` es útil para grafos que no son densos (|E| < |V^2|), o que tienen gran cantidad de vértices.<br>
Tenemos un Vector de tamaño igual a la cantidad de vértices, y en cada posición hay un puntero a la lista de los vértices adyacentes a i.<br>
Si el grafo es dirigido, tendremos la suma total de elementos en la lista de adyacencias será igual a la cantidad de aristas.<br>
Si el grafo es no dirigido, la suma total de elementos en la lista será igual al doble de aristas.<br>
En cualquiera de los casos, el costo espacial será V+E<br>
La desventaja, es que el costo temporal es O(grado G), ya que en el peor de los casos debo recorrer la totalidad de la mayor lista de adyacencias.

-----------------------------------------------------

*b. ¿En función de qué parámetros resulta apropiado realizar la estimación del orden de ejecución para
algoritmos sobre grafos densos? ¿Y para algoritmos sobre grafos dispersos? Fundamentar.*

Para algoritmos sobre grafos densos, dado que la cantidad de aristas va a tender a V^2, con solo conocer la cantidad de vértices se podría estimar el orden, ya que en el peor de los casos tendrías V^2 aristas y deberías recorrerlas todas.

Para algoritmos sobre grafos dispersos, al no conocer la cantidad de aristas debo tener que considerar ambos parámetros (V y E)


------------------------------------------------------------

*c. Si representamos un grafo no dirigido usando una Matriz de Adyacencias, ¿cómo sería la matriz
resultante? Fundamentar*

LA matriz sería simétrica, ya que tendríamos 1 en los casos que (i,j) pertenezca a E. Como en este tipo de grafos es lo mismo a(i,j) que a(j,i), la matriz será igual de la diagonal principal hacia arriba que hacia abajo.
