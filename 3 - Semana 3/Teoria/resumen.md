<h1> Arboles binarios y de Expresion </h1>

<h2>✨ Arbol Binario</h2>

Un **arbol binario** es una colección de nodos tal que:
* Puede estar vacía
* Puede estar formada por un nodo **R** llamado raíz, y dos sub-árboles **T1** y **T2**, donde la raíz de cada sub-arbol está conectada a R por medio de una arista.
* Cada nodo puede tener **a lo sumo dos** nodos hijos.
* **Hoja**: es un nodo que NO tiene hijos.
* **Hermanos**: aquellos nodos que tienen el mismo nodo padre.

<u>Algunos conceptos a utilizar :</u>

* <mark>Camino</mark>: desde n1 hasta nk, es una secuencia de nodos tal que ni es el padre de ni+1 para 1 <= i < k.
 * La **longitud** del camino es el número de aristas (K-1).
 * <u>Existe</u> un camino de <u>longitud cero</u>, de cada nodo hacia si mismo.
 * <u>Existe un único camino</u> desde la raíz a cada nodo.
* <mark>Profundidad</mark>: de ni, es la longitud del único camino desde la raíz hasta ni.
 * La raíz tiene profundida cero.
* <mark>Grado</mark>: del nodo n, es el número de hijos del nodo n.
* <mark>Altura</mark>: de ni, es la longitud del camino mas largo desde ni hasta una hoja:
 * Las hojas tienen altura cero.
 * La <u>altura de un arbol</u> es la altura del nodo raíz.
* <mark>Ancestro/Descendiente</mark>: si existe un camino desde n1 a n2, se dice que n1 es ancestro de n2, y n2 es descendiente de n1.

<img src='images/graficoArbol.PNG' width=700 height=300><br>

* <mark>Arbol binario lleno</mark>: Dado un arbol T de altura h, está lleno si cada <u>nodo interno</u> tiene <u>grado 2</u>, y todas las <u>hojas están en el mismo nivel</u>.
Entonces, T está lleno si:
 * T es un nodo simple
 * T es de altura h y sus sub-arboles son llenos de altura h-1.
 * Cantidad de nodos: 2 ^(h+1) – 1
  >En donde h es la altura

<img src='images/cantNodos.PNG' width=700 height=300><br>

* <mark>Arbol binario completo</mark>: un arbol binario está completo, si es lleno de altura h-1, y el nivel h se completa de izq a derecha.<br>
En un arbol binario completo, la **cantidad de nodos** varia entre **(2^h)** y **2 ^(h+1) – 1**

<img src='images/cantNodosCompleto.PNG' width=700 height=300><br>

Finalmente, cada **nodo** tiene:
* Información propia del nodo.
* Referencia a su hijo izquierdo.
* Referencia a su hijo derecho.

<h2>✨Recorridos</h2>

* **Pre-Orden**: se procesa primero la raíz, y luego sus hijos: izq y der.
* **In-Orden**: se procesa primero el hijo izquierdo, luego la raíz, y luego el hijo derecho.
* **Post-Orden**: se procesan primero los hijos, izquierdo y derecho, y luego la raíz.
* **Por niveles**: se procesan primero la raiz, luego los hijos, luego los hijos de estos, etc.

<mark>Pseudocodigo - Recorrido pre orden</mark>

``` java
  public void preorden() {
    imprimir (dato);
    si (tiene hijo_izquierdo)
      hijoIzquierdo.preorden();
    si (tiene hijo_derecho)
      hijoDerecho.preorden();
    }
```

<mark>Pseudocodigo - Recorrido por niveles</mark>

``` java
public void porNiveles() {
  encolar(raíz);
  mientras (cola no se vacíe) {
    desencolar(v);
    imprimir (dato de v);
    si (tiene hijo_izquierdo)
      encolar(hijo_izquierdo);
    si (tiene hijo_derecho)
      encolar(hijo_derecho);
    }
}
```

<h2>✨ Arbol de Expresión</h2>

Es un arbol binario asociado a una **expresión aritmética**.
* Nodos internos representan **operadores**
* Hojas representan **operandos**

<img src='images/arbolExpresion.PNG' width=700 height=300><br>

<mark>Algunas aplicaciones:</mark>

* En compiladores, para analizar, optimizar y traducir programas
* Evaluar expresiones algebraicas o logicas
* Traducir expresiones a notacion prefija, sufija e infija.

<img src='images/recorridoArbolExpresion.PNG' width=700 height=300><br>

<h2>📌 Construcción de un arbol de expresion </h2>

<img src='images/contruccion.PNG' width=700 height=300><br>

<mark>Construccion a partir de una expresion postfija</mark>

Pseudocodigo:
```
  tomo un carácter de la expresión
  mientras ( existe carácter ) hacer
    si es un operando : creo un nodo y lo apilo.
    si es un operador: (lo tomo como la raíz de los dos últimos nodos creados)
        - creo un nodo R,
        - desapilo y lo agrego como hijo derecho de R
        - desapilo y lo agrego como hijo izquierdo de R
        - apilo R.
    tomo otro carácter
  fin
 ```

 <img src='images/construccionPostfija.GIF' width=700 height=300><br>

 <mark>Construccion a partir de una expresion pre fija</mark>

 Pseudocodigo:
 ```
 ArbolExpresión (A: ArbolBin, exp: string )
    si exp nulo : nada.
    si es un operador :
      - creo un nodo raíz R
      -  ArbolExpresión (subArbIzq de R, exp sin 1° carácter) )
      - ArbolExpresión ( subArbDer de R, exp (sin 1° carácter) )
    si es un operando: creo un nodo (hoja)
  ```
<mark>Construccion a partir de una expresion Infija</mark>

* Se debe convertir la expresion infija a postfija
* A partir de la postfija se construye el arbol de expresion.

Estrategia para convertir de infija a postfija:
```
* a) si es un operando ➡ se coloca en la salida.
* b) si es un operador ➡ se maneja una pila según la prioridad del
operador en relación al tope de la pila
 * operador con > prioridad que el tope –> se apila
 * operador con <= prioridad que el tope –> se desapila elemento
 colocándolo en la salida.
 * Se vuelve a comparar el operador con el tope de la pila
* c) si es un “(“ , “)” ➡ “(“ se apila “)” se desapila todo hasta el “(“, incluído éste
* d) cuando se llega al final de la expresión, se desapilan todos los elementos llevándolos a la salida, hasta que la pila quede vacía.
```

Operadores ordenados de menor a mayor segun prioridad:
* ˄ (potencia)
* *, / (multiplicación y división)
* +, - (suma y resta)
* Los “ ( “ siempre se apilan como si tuvieran la mayor prioridad y se desapilan sólo cuando aparece un “ ) ” .
