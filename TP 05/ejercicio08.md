`Para cada uno de los algoritmos presentados:`

* a. Expresar en función de n el tiempo de ejecución.
* b. Establecer el orden de dicha función usando notación big-Oh.

```java
public static void uno (int n) {
  int i, j, k ;
  int [] [] a, b, c;
  a = new int [n] [n];
  b = new int [n] [n];
  c = new int [n] [n];
  for ( i=1; i<=n-1; i++) {
    for ( j=i+1; j<=n; j++) {
      for ( k=1; k<=j; k++) {
        c[i][j] = c[i][j]+ a[i][j]*b[i][j];
      }
    }
  }
  }
```

<img src="img/ejercicio8_1.png">

<img src="img/ejercicio8_2.png">

<img src="img/ejercicio8_3.png">

---------------------------------------------------

```java
public static void dos (int n){
  int i, j, k, sum;
  sum = 0;
  for ( i=1; i<=n; i++) {
    for ( j=1; j <= i*i; j++) {
      for ( k=1; k<= j; k++) {
        sum = sum + 1;
      }
    }
  }
  }
```

<img src="img/ejercicio8_4.png">
