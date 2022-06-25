El siguiente DAG surge cuando el Profesor Miguel se viste a la mañana. El profesor debe
ponerse ciertas prendas antes que otras. Por ejemplo, las medias antes que los zapatos. Otras
prendas pueden ponerse en cualquier orden. Por ejemplo, las medias y los pantalones. Una arista
dirigida (v,w) en el DAG indica que la prenda v debe ser puesta antes que la prenda w. Enumere
algunos posibles órdenes topológicos que se pueden obtener a partir del DAG previo.


Version 1

Vector grado_in

| Reloj | Boxer | Camisa | Medias | Pantalones  | Cinturon | Zapatos | corbata | Saco |
| -- | -- | -- | -- | -- | -- | -- | -- | -- |
| `0` | 0 | 0 | 0 | 1 | 2 | 3 | 2 | 1|
| `0` | `0` | 0 | 0 | 0 | 2 | 2 | 2 | 1|
| `0` | `0` | `0` | 0 | 0 | 1 | 2 | 1 | 1|
| `0` | `0` | `0` | `0` | 0 | 1 | 1 | 1 | 1|
| `0` | `0` | `0` | `0` | `0` | 0 | 0 | 1 | 1|
| `0` | `0` | `0` | `0` | `0` | `0` | 0 | 0 | 1|
| `0` | `0` | `0` | `0` | `0` | `0` | `0` | 0 | 1|
| `0` | `0` | `0` | `0` | `0` | `0` | `0` | `0` | 0|
| `0` | `0` | `0` | `0` | `0` | `0` | `0` | `0` | `0`|





Salida

Reloj -> boxer -> medias -> pantalones -> cinturon -> zapatos -> corbata - >saco
