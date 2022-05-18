Ejercicio 4
Determinar si las siguientes sentencias son verdaderas o falsas, justificando la respuesta
utilizando notación Big-Oh.

<img src="img/enunciado4.png" width=600>

---------------------------------------------------

`a-`



Para el caso del enunciado, es **FALSO** que 3^n sea de O(2^n), esto lo podemos demostrar de la siguiente manera:

Recordando notación Big O, decimos que T(n) = O(F(n)) si existen constantes c>0 y n0 tales que:

` T(n)<= c f(n)` *para todo n>=n0*

Si tomamos como c=1, y para ambos terminos partimos de n0=1, tenemos que la desigualdad `3^n <= 2^n` nunca se cumple, ya que para cualquier valor de n > 1 el término exponencial con base 3 siempre crecerá más que el termino con base 2.

------------------------------------------------

`B-`

El caso B plantea que n+log2(n) es de O(n). Para llegar a la conclusión de si es verdadero o falso, procederemos a analizar cada término de forma individual, y luego unir los resultados.

<u> Termino 1</u>

n <= n

Si multiplicamos ambos miembros de la igualdad por 1, y tomamos n=1, vemos que se sigue cumpliendo que

1 * 1 <= 1 * 1

<u> Termino 2 </u>

log2(n) <= n

Por la tabla de crecimiento de las funciones, sabemos que una función logaritmica crece mas lento que una lineal.

Procederemos a multiplicar cada miembro de la igualdad por una constante 1, y si partimos de n = 1 tenemos que:

1 * log2(1) <= 1 * 1

<u>Paso 2 --> Unimos los resultados </u>

1 * n + 1 * log2(n) <= 1* n + 1*n
T(n)<= 2 * n

Entonces tenemos que la desigualdad se cumple para c=2 y n>1.

-----------------------------------------------------------------

`c-`

El ejercicio plantea que n^(1/2) + 10^20 es de O(n^(1/2))

Analizando los términos, tenemos que 10^20 es una constante. Con lo cual por la propiedad de la suma, el orden será el orden del término que crece más rapido, en este caso n^(1/2)

-----------------------------------------------------------------

`d-`

En este punto, tenemos dos ecuaciones distintas dependiendo del tamaño de n.

Si analizamos los casos en que n>= 100, nuestro algoritmo es una constante 317. Con lo cual se cumple que 317 <= O(n), ya que la constante no tiene crecimiento, y el orden lineal es una cota superior.

Los casos en que n<100 requerirán un mayor análisis:

3n + 17 <= n

<u> Analizo primer termino</u>

n <= n

Si multiplico ambos lados por una constante =3

Tenemos que

3n <= 3n

Con lo cual cumple que 3n es de O(n).

Luego, el segundo termino es una constante. Con lo cual por regla de la suma el orden de la ecuación es el termino que mas crece, en este caso 3n.

A su vez, 3n + 17 es el peor caso, ya que 317 es lineal.

En definitiva, el enunciado es de O(n) para c=3 y n>1


--------------------------------------------------------------

`e-`

Esto se puede demostrar por la regla del polinomio: si T(n) es un polinomio de grado k --> T(n) = O(n^k)

En este caso, T(n) es un polinomio de grado 5.

-------------------------------------------------------------------
`F`

Verdadero
