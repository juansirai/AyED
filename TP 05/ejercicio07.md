Para cada uno de estos algoritmos calcule el tiempo de ejecución

```java
for(int i = 0; i< n; i++)
  sum++;
```

Tenemos un for desde 0 hasta (n-1), con paso 1, y dentro del for una asignación (tiempo constante)<br>
Esto es equivalente a tener un for desde 1 hasta n, con paso constante, que es lo mismo que multiplicar n veces la constante

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Orange}&space;=&space;\sum_{0}^{n-1}&space;C1}&space;{\color{Orange}&space;=&space;\sum_{1}^{n}&space;C1}&space;{\color{Orange}&space;=&space;n&space;*&space;C1}&space;">



----------------------------------------------------------------

```java
for(int i = 0; i< n; i+=2)
  sum++;

```
Acá tenemos un for desde 0 hasta (n-1), con paso doble (i se incrementa de 2 en 2)

Esto equivale a tener una sumatoria desde 1 hasta n, con paso doble, lo que a su vez equivale a una sumatoria desde 1 hasta n/2.

Dentro del cuerpo del for tengo una asignación, que la represento como una constante C, y esa misma constante la voy a utilizar para representar la comparación contra n, y el aumento del indice.

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Orange}\sum_{1}^{n/2}&space;C&space;=&space;n/2&space;*&space;C&space;}">



------------------------------------------------------------------

```java
for(int i = 0; i< n; i++)
  for(int j = 0; j< n; j++)
    sum++;

```

En este caso, tenemos un for de 0 hasta n-1, adentro otro for de 0 hasta n-1 (ambos con paso 1), y adentro una asignación C.

La sumatoria de 0 a n-1 es equivalente a tener una sumatoria de 1 hasta n.

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Orange}&space;=&space;\sum_{1}^{n}&space;\left&space;(&space;\sum_{1}^{n}&space;C&space;\right&space;)">

Luego, la sumatoria de 1 a n de C es n * C.

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Orange}&space;\sum_{1}^{n}&space;\left&space;(&space;n&space;*&space;C&space;\right&space;)}">

Y siguiendo el mismo patrón con la sumatoria de afuera:

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Orange}&space;=&space;n&space;*&space;n&space;*&space;C&space;=&space;n^{2}&space;*&space;C}">

-----------------------------------------------------------

```java
for(int i = 0; i< n; i++)
for(int j = 0; j< n*n; j++)
  sum++;

```

En este codigo tenemos:
* Un for de 0 a n-1 --> equivale a una sumatoria de 1 a n, avanzando de a 1.
  * Un for de 0 a (n^2)-1 --> equivale a una sumatoria de 1 a n^2
    * Una asignación

<img src="https://latex.codecogs.com/svg.image?\inline&space;{\color{Emerald}&space;\sum_{1}^{n}&space;\left&space;(&space;{\color{Orange}&space;\sum_{1}^{n^{2}}&space;C}&space;\right&space;)}">

Esto equivale a la sumatoria de 1 a n de multiplicar n^2 por C

<img src="https://latex.codecogs.com/svg.image?\inline&space;\LARGE&space;{\color{Orange}&space;\sum_{1}^{n}&space;n^{2}&space;*&space;C}&space;=&space;{\color{Emerald}&space;n&space;*&space;n^{2}&space;*&space;C}&space;=&space;{\color{Pink}&space;n^{3}&space;*&space;C}">

La constante C representa la asignacion de i, j, la comparación contra n y contra n*n, el incremento de i, j, el incremento de sum.

----------------------------------------------

```java
for(int i = 0; i< n; i++)
  for(int j = 0; j< n; j++)
    sum++;
for(int i = 0; i< n; i++)
  sum++

```

En este caso tenemos:
* Sumatoria de 0 hasta n-1, con paso simple (es lo mismo que sumatoria de 1 hasta n)
  * Adentro una sumatoria de 0 hasta n-1, con paso simple. Equivale a sumatoria de 1 hasta n.
    * Adentro una asignación
* Sumatoria de 0 hasta n-1 (es lo mismo que de 1 hasta n)
  * Adentro una asignación

Matemáticamente, esto se puede representar:

<img src="https://latex.codecogs.com/svg.image?\inline&space;\LARGE&space;{\color{Orange}&space;\sum_{1}^{n}\left&space;(&space;{\color{Emerald}&space;\sum_{1}^{n}&space;C}&space;\right&space;)&space;&plus;&space;\sum_{1}^{n}&space;C}">

Reemplazando las sumatorias por su equivalente, tenemos que:

<img src="https://latex.codecogs.com/svg.image?\inline&space;\LARGE&space;{\color{Orange}&space;n&space;*&space;n&space;*&space;C&space;&plus;&space;n&space;*&space;C&space;==&space;n^{2}&space;*&space;C&space;&plus;&space;n&space;*&space;C}">

Donde la primera constante representa el incremento de sum, la inicializacion de j, comparacion con n, aumento de j, inicializacion de i, comparacion con n, aumento de i.<br>
Y la constante C2 representa la asignacion e incremento de i, su comparación con n, y el aumento de sum.

---------------------------------------------------

```java
for(int i = 0; i< n/2; i++)
  for(int j = 0; j< n/2; j++)
    sum++
```

En este caso tenemos:
* Un for de 0 a (n/2)-1 --> sumatoria de 1 a n/2
  * Adentro otro for de o a (n/2)-1 --> Sumatoria de 1 a n/2
    * Adentro una asignacion

Matematicamente nos queda lo siguiente:

<img src="https://latex.codecogs.com/svg.image?\inline&space;\LARGE&space;{\color{Orange}&space;\sum_{1}^{n/2}&space;\left&space;(&space;{\color{Emerald}&space;\sum_{1}^{n/2}&space;C}&space;\right&space;)}"> <br>

Y si reemplazamos las correspondientes sumatorias nos queda:

<img src="https://latex.codecogs.com/svg.image?\inline&space;\LARGE&space;{\color{Orange}&space;\frac{n}{2}&space;*&space;(\frac{n}{2}&space;*&space;C)&space;=&space;\frac{n^{2}}{4}*&space;C}&space;">
