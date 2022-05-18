`a. Analizar si todos los algoritmos terminan o alguno puede quedar en loop infinito. `


Los primeros dos algoritmos podrían llegar a quedar en un loop infinito, ya que:

* El primer algoritmo usa un generador de numeros aleatorios, y luego ejecuta un while hasta tanto el numero que salga no se encuentre en un vector cargado previamente. Esto podría desencadenar un loop toda vez que el generador aleatorio no devuelva un numero sin repetir.
* El segundo algoritmo, si bien utiliza una segunda estructura, parte de una metodología similar: mediante un generador aleatorio intenta llenar el vector resultado con numeros distintos, es decir que hasta tanto no salga un numero sin repetir, el algoritmo seguirá ejecutandose.
* El tercer algoritmo SI va a finalizar, ya que si bien utiliza un generador aleatorio, este no tiene como objetivo generar numeros sin repetir, sino que nos va a indicar entre que posiciones hacer el swap. Como permutaciones repetidas son de todas formas permutaciones, el algoritmo de intercambio va a finalizar.


-----------------------------------------------------
`b. Describa con palabras la cantidad de operaciones que realizan.`

```java

public static int[] randomUno(int n) {
  int i, x = 0, k;
  int[] a = new int[n];
  for (i = 0; i < n; i++) {
    boolean seguirBuscando = true;
    while (seguirBuscando) {
      x = ran_int(0, n - 1);
      seguirBuscando = false;
      for (k = 0; k < i && !seguirBuscando; k++)
        if (x == a[k])
          seguirBuscando = true;
        }
        a[i] = x;
      }
      return a;
  }
```

El primer algoritmo hace 3 inicializaciones de variables, y luego inicializa un vector a de numeros enteros.

Ejecuta un for externo, dentro del cual:
* Se inicializa una variable booleana
* se ejecuta un while dentro del cual
  * se realizan 3 asignaciones (x, booleano, a[i])
  * se ejecuta un for dentro del cual se realiza una comparación y una asignacion

Como tenemos 3 iteraciones enlazadas (for --> while --> for), el orden de este algoritmo será O(n^3)



```java

public static int[] randomDos(int n) {
 int i, x;
 int[] a = new int[n];
 boolean[] used = new boolean[n];
 for (i = 0; i < n; i++) used[i] = false;
 for (i = 0; i < n; i++) {
   x = ran_int(0, n - 1);
   while (used[x]) x = ran_int(0, n - 1);
   a[i] = x;
   used[x] = true;
  }
 return a;
}

```

El segundo algoritmo:
* Realiza las primeras 3 inicializaciones de la misma manera
* Realiza la asignacion adicional de un vector de booleanos de N elementos.
* Inicializa dicho vector con un for.
* Ejecuta un for de 0 hasta n dentro del cual:
  * Se realiza una asignacion
  * Se ejecuta un while dentro del cual se realiza una asignacion
  * se realizan dos asignaciones mas: en el vector de resutado y en el vector de booleanos

Como tenemos solamente dos estructuras de iteración anidadas, el orden del algoritmo es de O(n^2)


```java
public static int[] randomTres(int n) {
  int i;
  int[] a = new int[n];
  for (i = 0; i < n; i++) a[i] = i;
  for (i = 1; i < n; i++) swap(a, i, ran_int(0, i - 1));
  return a;
}

```

El tercer y último algoritmo:
* Tiene 2 asignaciones
* Ejecuta un for con el cual realiza n asignaciones
* Ejecuta un segundo for con el cual se realizan tambien n asignaciones, relacionadas al intercambio

Como no tiene estructuras iterativsa anidadas, el orden es lineal.
