`En la documentación de la clase arrayList que se encuentra en el siguiente `
<a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> link</a> `se encuentran las siguientes afirmaciones`
* "The size, isEmpty, get, set, iterator, and listIterator operations run in constant time.”
* “All of the other operations run in linear time (roughly speaking)”

`Explique con sus palabras por qué cree que algunas operaciones se ejecutan en tiempo constante y
otras en tiempo lineal.`

Esto es así ya que, gracias a que el vector es una estructura de datos indexada, y que lleva como variable de instancia indicadores de tamanio y estado (vacia/no vacia), muchas operaciones tales como preguntar si está vacío, devolver el elemento ubicado en determinada posicion, devolver el tamaño, insertar, o devolver un iterable se ejecutarán en un tiempo constante.

Por otro lado, para el resto de las operaciones el tiempo de ejecución es lineal, ya que en el peor caso deberán recorrer todo el vector hasta poder retornar el resultado deseado.
