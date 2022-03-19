<h1>Herencia y clases abstractas</h1>

<h3>✨ Herencia</h3>

La programación orientada a objetos permite a las clases expresar **similitudes** entre objetos que tienen características y comportamiento en común. Estas similitudes se pueden expresar a través de la **herencia**.


<mark>Herencia:</mark> se refiere al hecho que una clase hereda los atributos y comportamientos de otra.
* La clase que hereda se llama **subclase**
* La clase de la cual se hereda es la **superclase**.

La herencia permite la **rehusabilidad** del código.
* Una subclase puede agregar comportamientos y atributos a su superclase.
* Una subclase puede sobre-escribir el comportamiento heredado. (*reemplazar o modificar*)<br>

A través de la palabra clave <mark>extends</mark>, la subclase obtiene automáticamente las variables y métodos de la clase base.

**Superclase**
```java
public class Vehiculo {
  // variables
  private String marca;
  private double precio;
 . . .
 // metodos
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getMarca() {
    return marca;
  }
 . . .
}
```
**Subclase**
```java
public class Camioneta extends Vehiculos {
  // variables
  private boolean tieneDobleCabina;
  private boolean es4x4;

  // Metodos
  public void setTieneDobleCabina(boolean tieneDobleCabina) {
    this.tieneDobleCabina = tieneDobleCabina;
  }
  public boolean isTieneDobleCabina() {
    return tieneDobleCabina;
  }
 . . .
}
```

Luego, al utilizar el objeto Camioneta, se pueden invocar todos los métodos propios, así como los heredados de la clase Vehículos.

<h5>📌 Sobrescritura de métodos</h5>

Un métodos sobrescribe a otro, cuando se define en una subclase y coincide el <u>nombre, tipo de retorno y lista de argumentos </u> con un método ya definido en una superclase.

```java
public class Vehiculo {
  private String marca;
  private double precio;
 . . .
 public String detalles() {
   return “Vehiculo marca: "+ getMarca()+"\n”+ "Precio: "+this.getPrecio();
 }
 ```

```java
 public class Camion extends Vehiculo {
   private boolean tieneDobleCaja;
   private int cargaMaxima;

   public String detalles() {
     return "Vehiculo marca: "+getMarca()+"\n"+"Precio: "+getPrecio()+"\n"+"carga máxima:"+getCargaMaxima();
   }
 // getter y setter
}
```
En este ejemplo, el método ```detalles()``` definido en la superclase vehículo, es reemplazado en la subclase Camión.

Luego, se puede invocar al método ```detalles()``` de la clase Vehículo, mediante la palabra reservada ```super```

<mark>Upcasting:</mark> Implica tratar a una referencia de la clase derivada como una referencia de la clase base. La conversión es hacia arriba en la jerarquía de herencia, y se pierde el tipo específico del objeto.<br>
El upcasting es seguro, ya que la clase base tiene una interfaz que es igual o es un subconjunto de la clase derivada.<br>

<mark>Downcasting</mark>: Sirve para recuperar el tipo específico de objeto, moviéndose hacia abajo en la jerarquía de clases.

```java
Vehiculo vc = new Camion();   // --->upcasting
vc.setMarca("Mercedes Benz"); // ✔ ok
vc.setPrecio(35120.4);        // ✔ ok
vc.setCargaMaxima(3000);      // ❌ No está visible desde Vehículo
System.out.println(vc.detalles());

// el código así escrito no compilaría
```
<br>

<mark>La clase object</mark>: es la raíz de todas las clases de java, y se encuentra en el paquete java.lang. <br>
Cuando se declara una clase sin especificar la palabra clave ```extends```, el compilador agrega automáticamente ```extends Object``` a la declaración de la clase.<br>

De esta manera estamos habilitados para sobrescribir los métodos heredados de Object:
* ```public boolean equals(Object obj){}```: Compara la igualdad de dos objetos. La versión original de este método devuelve true si las referencias de memoria son iguales, es por eso que frecuentemente se lo sobrescribe para comparar contenido.
* ```public string toString(){}```: Retorna la dirección del objeto como un string.

<h5>📌 Clases Abstractas </h5>

* En un objeto abstracto, la finalidad NO es generar instancias.
* El objetivo es generar una interface de comportamiento común para los objetos de la subclase.
* Se espera que una clase abstracta sea extendida por subclases, que implementen todos sus métodos abstractos.
* Una clase abstracta puede tener métodos concretos como métodos abstractos.
* **Método Abstracto:** es un método que NO tiene implementación, NO tiene código. Sirve para definir un comportamiento común a los objetos de las clases concretas.
* El compilador NO permite crear objetos de una clase abstracta. Fallará en compilación.

```java
public abstract class FiguraGeometrica {
 // Color de la figura
  private Color color;
  private int x;
  private int y;

  public void mover(int x, int y){
    // Método concreto
    this.x = x;
    this.y = y;
 }

  public void setColor(Color nuevoColor){
    // Método concreto
    color = nuevoColor;
    dibujar();
  }

  public abstract void dibujar();
  //Método abstracto. Se antepone la palabra abstract y termina con ;
```

* Para que las subclases de "FiguarGeometrica" sean concretas, deben proveer una implementación para c/u de los métodos abstractos de la superclase.
