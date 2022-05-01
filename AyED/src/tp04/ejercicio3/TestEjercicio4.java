package tp04.ejercicio3;

import tp02.ejercicio2.*;
import tp04.ejercicio1.*;

public class TestEjercicio4 {

	public static void main(String[] args) {

		
		ArbolGeneral<Integer> arbol7 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> arbol3 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> arbol5 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> arbol19 = new ArbolGeneral<Integer>(19);
		ArbolGeneral<Integer> arbol22 = new ArbolGeneral<Integer>(22);
		ArbolGeneral<Integer> arbol15 = new ArbolGeneral<Integer>(15);
		ArbolGeneral<Integer> arbol1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> arbol31 = new ArbolGeneral<Integer>(31);
		ArbolGeneral<Integer> arbol25 = new ArbolGeneral<Integer>(25);
		
		arbol7.agregarHijo(arbol3);
		arbol7.agregarHijo(arbol5);
		
		arbol3.agregarHijo(arbol19);
		arbol3.agregarHijo(arbol22);
		arbol3.agregarHijo(arbol15);
		
		arbol5.agregarHijo(arbol1);
		arbol5.agregarHijo(arbol31);
		
		arbol22.agregarHijo(arbol25);
		
		RecorridosAG recorrido = new RecorridosAG();
		
		ListaGenerica<Integer> L = recorrido.numerosImparesMayoresQuePreOrden(arbol7, 2);
		
		System.out.println("Numeros impares mayores que 2 (pre-orden): ");
		System.out.println(L.toString());
		
		
		ListaGenerica<Integer> L2 = recorrido.numerosImparesMayoresQueInOrden(arbol7, 2);
		
		System.out.println("Numeros impares mayores que 2 (in-orden): ");
		System.out.println(L2.toString());
		
		ListaGenerica<Integer> L3 = recorrido.numerosImparesMayoresQuePostOrden(arbol7, 2);
		
		System.out.println("Numeros impares mayores que 2 (post-orden): ");
		System.out.println(L3.toString());
		
		ListaGenerica<Integer> L4 = recorrido.numerosImparesMayoresQuePorNiveles(arbol7, 2);
		
		System.out.println("Numeros impares mayores que 2 (por niveles): ");
		System.out.println(L4.toString());

	}

}
