package tp04.ejercicio6;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.RecorridosAG;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		System.out.println("3 es ancestro de 25 " + arbol7.esAncestro(3, 25));
		System.out.println("3 es ancestro de 1 " + arbol7.esAncestro(3, 1));
		System.out.println("5 es ancestro de 1 " + arbol7.esAncestro(5, 1));
		System.out.println("5 es ancestro de 31 " + arbol7.esAncestro(5, 31));
		System.out.println("1 es ancestro de 5 " + arbol7.esAncestro(1, 5));
		System.out.println("8 es ancestro de 1 " + arbol7.esAncestro(8, 1));
		System.out.println("3 es ancestro de 10 " + arbol7.esAncestro(3, 10));
	}
		
		
}


