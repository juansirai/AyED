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
