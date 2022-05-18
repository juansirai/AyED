a.- Para que usted pueda experimentar el tiempo que demora cada uno de los dos algoritmos, lo
ponemos a vuestra disposición. Usted debe ejecutar cada uno de los algoritmo, con distinta cantidad
de elementos y complete la tabla. Luego haga la gráfica para comparar los tiempos de ambos
algoritmos. Tenga encuenta que el algoritmo posee dos constantes CANTIDAD_CUENTAS y
CANTIDAD_CONSULTAS, sin embargo, por simplicidad, ambas toman el mismo valor. Solo necesita modificar
CANTIDAD_CUENTAS

| Nº Cuentas (y consultas)| Procesar Movimientos | Procesar Movimientos Optimizado
| --- | ----------- | --- |
| 1.000| 0,063 | 0,002 |
| 10.000 | 0,549 | 0,006 |
| 25.000 | 3,898 | 0,021 |
| 50.000 | 18,057 | 0,026 |
| 100.000 | 70,366 | 0,04|


`b.- ¿Por qué procesarMovimientos es tan ineficiente? Tenga en cuenta que pueden existir millones de movimientos diarios que abarquen gran parte de las cuentas bancarias.`

ProcesarMovimientos es ineficiente, ya que al tener dos for anidados es de orden cuadrático. Eso implica que a medida que se aumenta la cantidad de datos que se deben procesar, el tiempo de ejecucion del algoritmo crecerá de forma cuadrática.

Relaciondo a ello, el arreglo de cuentas se recorrerá tantas veces como consultas haya asociadas a las mismas.


`c.- ¿En qué se diferencia procesarMovimientosOptimizado? Observe las operaciones que se realizan para cada consulta.`

La diferencia es que el algoritmo procesarMovimientosOptimizados, recorre ambos vectores (cuentas y movimientos) una sola vez.
