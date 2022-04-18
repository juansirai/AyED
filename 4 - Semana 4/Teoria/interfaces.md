<h1> Interfaces </h1>

<h2> Indice </h2>

* [Interfaces: Para que son?](#intro)
* [Declaración de interfaces en java](#declaracion)
* [Implementación de interfaces](#implementacion)
* [Interfaces vs. clases abstractas](#difAbstractas)
* [Las interfaces Comparable y Comparator](#comparables)



<h2>Interfaces: Para que son?</h2>
<a id="intro"></a>

Una interface es una **coleccion de definiciones de metodos** sin implementacion/cuerpo, y de **declaraciones de variables de clase constantes**
, agrupadas bajo un nombre.

Las interfaces proporcionan un mecanismo para que una clase defina metodos de un tipo de datos```diferente al de su superclase```

Una interface establece ```qué debe hacer``` la clase que implementa, sin especificar el cómo.


<h2>Declaración de interfaces en java</h2>
<a id="declaracion"></a>

```.java
package nomPaquete;

public interface UnaInter extends SuperInter1, SuperInter2, ... {
    
    Declaración de métodos: implícitamente public y abstract
    Declaración de constantes: implícitamente public, static y final

}
```
El especificador de acceso `Public` establece que la interface puede ser usada por cualquier
clase o interface de cualquier paquete. **Si se omite**, la interface solamente podrá ser usada
dentro del paquete en que fue declarada.

Una interface `puede extender multiples` interfaces. Hay herencia multiple de interfaces.

Una interface `hereda` todas las constantes y metodos de sus super-interfaces.

En las interfaces, `las variables` son implícitamente public, static y final. <br>
Por su lado, `los metodos` son implicitamente public y abstract.

De ahí que las siguientes declaraciones son **equivalentes**:

```java
public interface Volador {
 public static final long UN_SEGUNDO=1000;
 public static final long UN_MINUTO=60000;
 public abstract String despegar();
 public abstract String aterrizar();
 public abstract String volar();
}
```

Equivale a 

```java
public interface Volador {
 long UN_SEGUNDO=1000;
 long UN_MINUTO=60000;
 String despegar();
 String aterrizar();
 String volar();
}
```

Luego, las `clases que implementan` Volador, deberán implementar los métodos `despegar()`,
`aterrizar()` y `volar()`, todos públicos, y <u>podrán usar</u> las constantes
UN_SEGUNDO y UN_MINUTO. <br>
Si una clase **NO** implementa alguno de estos métodos, entonces deberá **declararse abstract**.

Las interfaces se guardan en archivos con el mismo nombre que la interface, y extensión .Java.

<h2>Implementacion de interfaces</h2>
<a id="implementacion"></a>

Para especificar que una clase implementa una interface, se usa la palabra clave `implements`

```java
public class Pajaro
 implements Volador {
 . . .
}
```

Una clase que implementa una interface:
* `Hereda` todas sus constantes
* `Debe implementar` cada uno de los métodos

Una clase puede implementar `mas de una interfase`, y de esa manera se prevee un meqcanismo similar
al de herencia múltiple.

```java
public class Pajaro extends Animal implements Volador, Mascota {
 public String despegar() {..}
 public String aterrizar(){..}
 public String volar(){..}
 public getName(){..}
 public setName(){..}
}
```

<img src = "/images/interfaces.png" width="600">

Todos los métodos declarados en la interface, se deben implementar en la clase.

Una clase puede heredar de una **única clase base** e implementar **tantas interfaces como quiera**.
<img src = "/images/upcasting.png" width="600">

<h3><mark> Interfaces y Upcasting</mark></h3>

<img src="/images/upcasting2.PNG" width="600">

* Las interfaces definen un **nuevo tipo de dato**, entonces podemos decir:

    ```volador[] m= new volador[]```
* El mecanismo de **upcasting** no tiene en cuenta si volador es una clase concreta, abstracta o interface. Funciona de la misma manera.
* `Polimorfismo`: el método despegar() es polimórfico, se comportará dependiendo al tipo de objeto receptor.

**💡El principal objetivo de las interfaces es permitir el upcasting a otros tipos, además del upcasting al tipo base**.



<h2>Interfaces vs. clases abstractas</h2>
<a id="difAbstractas"></a>

* ✔ Ambas proveen una interface común
* ✔ No es posible crear instancias de interfaces o clases abstractas.
* ❌ La interface no tiene ningún tipo de implementacion.
* ❌ Con interfaces no hay herencia de métodos. Con clases abstractas si.
* ❌ Una clase puede extender **solo una** clase abstracta, pero puede implementar **multiples** interfaces.

**🤔¿Cuándo usar cada una?**

`Interfaces`:
* Si es posible crear una clase base con metodos sin implementacion y sin metodos de instancia.
* Si necesito simular la herencia múltiple.

`Clases Abstractas:`
* Si estamos forzados a tener implementación de algún método o a definir atributos.



<h2>Las interfaces Comparable y Comparator</h2>
<a id="comparables"></a>

La interface `Comparable <T>` hace a sus instancias comparables.
<br>Esta interface tiene solo un método `compareTo()`, el cual determina
**como comparar** dos instancias de la misma clase

```java
public interface Comparable<T> {
 public int compareTo(T o);
 }
```
Cada clase que la implemente recibirá un T del tipo de la clase.

El método retorna:
* =0: si el objeto receptor es igual al pasado en el argumento.
* \>0: si el objeto receptor es mayor que el pasado como parámetro.
* \<0: si el objeto receptor es menor que el pasado como parámetro

Ejemplo: clase persona implementa Comparable \<T>

<img src="/images/comparables.png" width="600">

Ejemplo: clase persona implementa Comparable \<Persona>

<img src="/images/comparablePersona.png" width="600">