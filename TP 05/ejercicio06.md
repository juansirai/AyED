`a.- Se tiene un algoritmo A, que se ejecuta sobre una computadora que procesa 10.000 operaciones
por segundo. Si el algoritmo A requiere f(n) = n * log10 n operaciones para resolver un problema,
determine el tiempo en segundos requerido por el algoritmo para resolver un problema de tamaño
n=10.000.`

Los datos que tenemos son:
* f(n) = n * log10 n
* Velocidad = 10.000 operaciones / seg
* n = 10.000

Si reemplazamos n en f(n):

f(10.000) = 10.000 * log10 10.000
f(10.000) = 10.000 * 4
f(10.000) = 40.000

Luego, sabiendo que hace 10.000 operaciones por segundo, el tiempo requerido será 40.000/10.000 = 4

----------------------------------------


`b.- Suponga que tenemos un algoritmo ALGO-1 cuyo tiempo de ejecución exacto es 100n3 para un
tamaño de entrada n.
i) si el tamaño de la entrada aumenta al doble, es decir, sería 2n, ¿Cuánto más lenta sería la
respuesta del algoritmo ALGO-1?
ii) y si aumenta al triple?`

Sabiendo que el tiempo de ejecución es 100n3:
* Si n aumenta el doble, el tiempo se retardaría 8 veces (2^3)
* Si n aumenta el triple, el tiempo se retardaría 27 veces (3^3)
