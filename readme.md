<h1>Algoritmos y Estructuras de Datos</h1>
<h3>Universidad Nacional de La Plata<br>
2022</h3>

<img src="http://ahorasomos.izertis.com/solidgear/wp-content/uploads/2016/08/technology-1283624_770.jpg" width="1000" height="200" alt="algorithm">

<h2>Propósito de este repositorio</h2>

En el presente repositorio se organizará todo el material teórico y práctico correspondiente a la materia
`Algoritmos y Estructuras de Datos` año 2022.

<h2>Material Teoria</h2>


------------------------------------------
<h2>Practicas Resueltas</h2>

<h3> <a href="https://github.com/juansirai/AyED/blob/master/2%20-%20Semana%202/Practica/2022_TP01B_Introduccion_al_Lenguaje_Java..pdf" >
✨Practica 1 </a></h3>

* <a href="https://github.com/juansirai/AyED/tree/master/2%20-%20Semana%202/Practica/Practica1B/src/Ejercicio01">Ejercicio 1</a>
* <a href="https://github.com/juansirai/AyED/tree/master/2%20-%20Semana%202/Practica/Practica1B/src/Ejercicio02">Ejercicio 2</a>
* <a href="https://github.com/juansirai/AyED/tree/master/2%20-%20Semana%202/Practica/Practica1B/src/ejercicio03">Ejercicio 3</a>
* <a href="https://github.com/juansirai/AyED/tree/master/2%20-%20Semana%202/Practica/Practica1B/src/ejercicio05">Ejercicio 5</a>

<h3><a href="https://github.com/juansirai/AyED/blob/master/3%20-%20Semana%203/Practica/2022_TP02_Listas.pdf">✨Practica 2 </a></h3>

* <a href="https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasDeEnteros/src/ejercicio01">Ejercicio 1.2 y 1.3</a>
* <a href="https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasDeEnteros/src/ejercicio1_5https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasDeEnteros/src/ejercicio1_5">Ejercicio 1.5</a>
* <a href="https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasDeEnteros/src/ejercicio1_6">Ejercicio 1.6</a>
* <a href="https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasGenericas/src/ejercicios_parte2">Ejercicio 2</a>
* <a href="https://github.com/juansirai/AyED/tree/master/3%20-%20Semana%203/Practica/ListasGenericas/src/tp02/ejercicio2">Ejercicio 3</a>
* <a href="https://github.com/juansirai/AyED/blob/master/3%20-%20Semana%203/Practica/ListasGenericas/src/tp02/ejercicio2/TestBalanceo.java">Ejercicio 4</a>

<h3><a href="https://github.com/juansirai/AyED/blob/master/5%20-%20Semana%205/Practica/2022_TP03_AB.pdf">✨Practica 3 </a></h3>

* <a href="https://github.com/juansirai/AyED/tree/master/AyED/src/tp03/ejercicio1">Ejercicio 2</a>
* <a href="https://github.com/juansirai/AyED/tree/master/AyED/src/tp03/ejercicio3">Ejercicio 3</a>
* <a href="https://github.com/juansirai/AyED/tree/master/AyED/src/tp03/ejercicio4">Ejercicio 4</a>
* <a href="https://github.com/juansirai/AyED/tree/master/AyED/src/tp03/ejercicio5">Ejercicio 5</a>

---------------------------------------------------------------------------------------
<<<<<<< HEAD

<h2>Algoritmos Genéricos</h2>

<h3> Arreglos </h3>

`Busqueda Secuencial`:Arreglo desordenado
```java
public static int secSearch(int [] a, int key ){
  int index = -1;
  for (int i=0; i<N; i++){
    if(a[i] == key) index = i;
  }
  return index;
}
```

`Busqueda Binaria`: Arreglo ordenado

```java
public static int binarySearch(int [] a, int key){
  int lo = 0;
  int hi = a.lenght() - 1;
  while (lo <= hi){
    int mid = lo + (hi - lo) / 2;
    if(key < a[mid]) hi = mid-1;
    else if(key>a[mid]) lo = mid + 1;
    else return mid;
  }
  return -1;
}
```
`MergeSort`: Ordenación recursiva de vectores.

```java
public static void mergeSort(int[] a, int izq, int der){
  if(izq < der){
    int m = (izq + der) / 2;
    mergeSort(a, izq, m);
    mergSort(a, m+1, der);
    merge(a, izq, m, der);
  }
}

public static void merge(int[] a, int izq, int m, int der){
  int i, j, k;
  int[] b = new int[a.length];        // array auxiliar
  for(i=izq; i<= der; i++{
    b[i] = a[i];
  }
  i = izq; j = m+1; k = der;
  while(i<=m && j<=der){              // copia el sig elemento mas grande
    if(b[i]<= b[j])
      a[k++] = b[i++];
    else
      a[k++] = b[j++];
    }
  while(i<=m){                        // copia los elementos que quedan de la
    a[k++] = b[i++];                  // 1ra mitad(si los hay)
  }
}
```

`Maximo de un arreglo:`

```java
public class Calculadora {
  public static int maximo(int[] datos) {
    int max = 0;
    for (int i = 0; i < datos.length; i++) {
      if (datos[i] > max)
      max = datos[i];
    }
    return max;
  }
}
```

`Maximo y Minimo de un Arreglo`

```java
public class Calculadora {
 . . .
 public static Datos maxmin(int[] datos) {
   int max = 0, min = 9999;
   for (int i = 0; i < datos.length; i++) {
     if (datos[i] > max) max = datos[i];
     if (datos[i] < min) min=datos[i];
   }
   Datos obj = new Datos();
   obj.setMax(max);
   obj.setMin(min);
   return obj;
  }
}

// Luego tendriamos al objeto Datos
public class Datos {
  private int min;
  private int max;
  public int getMin() {
    return min;
  }
  public void setMin(int min) {
    this.min = min;
  }
  public int getMax() {
    return max;
  }
  public void setMax(int max) {
    this.max = max;
  }
}

```

<h3>Arboles</h3>

`Recorrido pre-orden`
*R-->HI-->HD*

```java
public void preorden() {
  imprimir (dato);
    si (tiene hijo_izquierdo)
      hijoIzquierdo.preorden();
    si (tiene hijo_derecho)
      hijoDerecho.preorden();
}
```

`Recorrido in-orden`:*HI --> R -->HD*

```java
	private void inOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> a){
		if(a.tieneHijoIzquierdo())
			inOrden(lista, a.getHijoIzquierdo());
		System.out.println(a.getDato());
		if(a.tieneHijoDerecho())
			inOrden(lista, a.getHijoDerecho());
	}
```

`Recorrido Pos-Orden`: *HI -->HD-->R*

```java
	private void posOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> a) {
		if(a.tieneHijoIzquierdo())
			posOrden(lista, a.getHijoIzquierdo());
		if(a.tieneHijoDerecho()) {
			posOrden(lista, a.getHijoDerecho());		}
		System.out.println(a.getDato());
	}
```

`Recorrido por niveles`

```java
public void porNiveles(){
		ArbolBinario<T> V = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		// encolo la raiz
		cola.Encolar(this);
		//mientras cola no está vacia
		while(!cola.esVacia()) {
			//desencolo e imprimo
			V = cola.Desencolar();
			System.out.println(V.getDato());
			//encolo hijo izquierdo
			if(V.tieneHijoIzquierdo()) {
				cola.Encolar(V.getHijoIzquierdo());
			}
			//encolo hijo derecho
			if(V.tieneHijoDerecho()) {
				cola.Encolar(V.getHijoDerecho());
			}
		}
	}
```

<h3>Arboles de Expresion</h3>

`A partir de una expresion postfija`

**a b d * c + * e f g * + +**

```java
tomo un carácter de la expresión
  mientras ( existe carácter ) hacer
    si es un operando  creo un nodo y lo apilo.
    si es un operador (lo tomo como la raíz de los dos últimos nodos creados)
      creo un nodo R,
      desapilo y lo agrego como hijo derecho de R
      desapilo y lo agrego como hijo izquierdo de R
      apilo R.
    tomo otro carácter
  fin
```

` A partir de una expresion prefija`

```java
ArbolExpresión (A: ArbolBin, exp: string )
  si exp nulo
    nada.
  si es un operador
    creo un nodo raíz R
    ArbolExpresión (subArbIzq de R, exp(sin 1° carácter) )
    ArbolExpresión ( subArbDer de R, exp (sin 1° carácter) )
  si es un operando
    creo un nodo (hoja)
```

`A partir de una expresion Infija`

Pasos:
* Se convierte a post fija
* A partir de ahi se crea el arbol.

¿Como se convierte a post fija?

```
  a)si es un operando ➡ se coloca en la salida.
  b) si es un operador ➡ se maneja una pila según la prioridad del operador en relación al tope de la pila
    operador con > prioridad que el tope –> se apila
    operador con <= prioridad que el tope –> se desapila elemento colocándolo en la salida.
    Se vuelve a comparar el operador con el tope de la pila
  c) si es un “(“ , “)” ➡
    “(“ se apila
    “)” se desapila todo hasta el “(“, incluído éste
  d) cuando se llega al final de la expresión, se desapilan todos los elementos llevándolos a la salida, hasta que la pila quede vacía
  ```
=======
>>>>>>> 092eb6086a61bc45e24489f59a5fb87f55a07400
