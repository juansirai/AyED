package tp03.ejercicio3;

import tp03.ejercicio1.ArbolBinario;
import tp02.ejercicio2.*;

public class ContadorArbol {
	ArbolBinario<Integer> arbol;
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	public ContadorArbol() {
		this.arbol = null;
	}
	
	
	public ListaEnlazadaGenerica<Integer> numerosPares() {
		ListaEnlazadaGenerica<Integer> lista = new ListaEnlazadaGenerica <Integer>();
		//lista = this.posOrden( this.arbol);
		this.inOrden(lista, this.arbol);
		return lista;
	}
	
	private void inOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> a){
		if(a.tieneHijoIzquierdo()) 
			inOrden(lista, a.getHijoIzquierdo());
		if(a.getDato() % 2 ==0) 
			lista.agregarFinal(a.getDato());
		if(a.tieneHijoDerecho()) 
			inOrden(lista, a.getHijoDerecho());
	}
	
	private void posOrden(ListaEnlazadaGenerica<Integer> lista, ArbolBinario<Integer> a) {
		if(a.tieneHijoIzquierdo())
			posOrden(lista, a.getHijoIzquierdo());
		if(a.tieneHijoDerecho()) {
			posOrden(lista, a.getHijoDerecho());		}
		if(a.getDato()%2 ==0)
			lista.agregarFinal(a.getDato());
	}
}
