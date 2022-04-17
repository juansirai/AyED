package tp03.ejercicio1;

import java.util.*;

public class testArboles {
	
	public static void imprimirArbol (ArbolBinario<Integer> arbol) {
		System.out.println(arbol.getDato());
		if (arbol.tieneHijoIzquierdo()) {
			imprimirArbol(arbol.getHijoIzquierdo());
		}
		if (arbol.tieneHijoDerecho()) {
			imprimirArbol(arbol.getHijoDerecho());
		}
	}

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(1); 
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(2); 
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(3); 
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(4); 
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(5);
		ArbolBinario<Integer> f = new ArbolBinario<Integer>(6); 
		ArbolBinario<Integer> g = new ArbolBinario<Integer>(7);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		d.agregarHijoIzquierdo(f);
		d.agregarHijoDerecho(g);
		
		imprimirArbol(a);
		
		System.out.println(' ');
		
		System.out.println(a.contarHojas());
		
		System.out.println(' ');
		
		imprimirArbol(a.espejo());
		
		System.out.println(' ');
		
		imprimirArbol(a);
		
		System.out.println(' ');
		
		System.out.println("Recorrido por niveles: ");
		a.porNiveles();
		
		System.out.println("Recorrido Entre niveles 2 y 3: ");
		a.entreNiveles(2,3);
		

	}

}
