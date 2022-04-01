

El arbol del ejemplo es homogeneo, ya que una vez que se pasa el tipo por parámetro, todos los elementos deben ser de ese tipo.

Es recursivo, ya que los nodos hijo izquierdo y derecho son instancias del arbol binario (se puede ver en los setters de hijo izq y der)

El arbol binario se crea de abajo hacia arriba, primero las **hojas**, es decir primero creamos las insstancias de las hojas y luego las agregamos como hijos izq o der.

Los arboles binarios no tienen una idea de orden, no son como los arboles binarios de busqueda.

Los metodos de recorrido in orden, pre orden y pos orden son **recursivos**.
El metodo por niveles es **iterativo**.
Ponemos el primer elemento en la cola, y luego preguntamos si está vacia.
Como no está vacia, lo sacamos de la cola, lo imprimimos y preguntamos si tiene hijo izq y derecho respectivamente, los cuales pondremos en la cola y volvemos a repetir el proceso.

Al utilizar la cola, que tiene una estrategia primero entrado primero salido, nos permite imprimir el arbol por niveles.

A medida que encolamos, vamos poniendo el elemento en la cola y un null para indicar el fin de cada nivel.

<h2> Arbol binario lleno </h2>

Dado que la cantidad maxima de nodos que puede tener un arbol es 2^h (en donde h es el nivel), de antemano yo se cuantos nodos tiene un nivel dado
LLevando entonces un contador de nivel y un contador de nodos con nivel, podemos saber si el arbol esta lleno o no solamente comparando la cantidad real de ndoos en cada nivel con la teorica, si en al menos un nivel nos da false, es porque no está lleno.