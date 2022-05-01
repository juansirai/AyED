package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ColaGenerica;
import tp02.ejercicio2.ListaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
		// caso base 1 si es vacio
		if (this.esVacio()){
			return -1;
		}
		
		int altura = -1;
		// caso base 2 si es hoja
		if (this.esHoja()){
			return 0;
		}
		
		//lamada recursiva sobre cada nodo
		else {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				//obtengo la maxima altura de los hijos
				altura = Math.max(altura, hijos.proximo().altura());
			}
		}
		//para cada nodo, devuelvo la maxima altura de sus hijos +1
		return altura+1;
		
	}
	
	
	public Integer nivel(T dato) {
		// implementado con recorrido por niveles
		int nivel = 0;
		boolean encontre = false;
		
		// prevengo si el arbol es vacio
		if(this.esVacio())
			return -1;
		else {
			ArbolGeneral<T> aux;
			ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
			
			//encolo la raiz y marca de fin de nivel
			cola.Encolar(this);
			cola.Encolar(null);
			
			// desencolo y recorro el elemento y sus hijos
			while(!cola.esVacia() && !encontre) {
				aux = cola.Desencolar();
				
				//recorro ese nivel
				if(aux != null && !encontre) {
					if(aux.getDato().equals(dato))
						encontre = true;
					else {
						if(aux.tieneHijos()) {
							ListaGenerica<ArbolGeneral<T>> hijos = aux.getHijos();
							hijos.comenzar();
							while(!hijos.fin()) {
								cola.Encolar(hijos.proximo());
							}
						}
					}	
				}
				
				//si corresponde, me muevo al siguiente nivel
				else {
					if(!cola.esVacia() && !encontre) {
						cola.Encolar(null);
						nivel++;
					}
				}
			}
		}
		if(!encontre)
			return -1;
		return nivel;
	}

	public Integer ancho() {
		// implementado con recorrido por niveles
		int ancho = 0;
		if(this.esVacio())
			return -1;
		else {
			ColaGenerica<ArbolGeneral<T>> cola = new ColaGenerica<ArbolGeneral<T>>();
			ArbolGeneral<T> arbolAuxiliar;
			int nodos = 0;
			cola.Encolar(this);
			cola.Encolar(null);
			
			while(!cola.esVacia()) {
				arbolAuxiliar = cola.Desencolar();
				
				if(arbolAuxiliar!=null) {
					nodos++;
					if(arbolAuxiliar.tieneHijos()) {
						ListaGenerica<ArbolGeneral<T>> hijos =arbolAuxiliar.getHijos();
						hijos.comenzar();
						while(!hijos.fin())
							cola.Encolar(hijos.proximo());
					}
				}
				else {
					if(!cola.esVacia()) {
						cola.Encolar(null);
						ancho = Math.max(ancho, nodos);
						// cuando cambio de nivel reseteo la cantidad de nodos
						nodos = 0;
					}
				}
			}
			
		}
		return ancho;
	}
	
	public Boolean esAncestro(T a, T b) {
		// se evalua con un recorrido en profundidad pre orden
		boolean resultado = false;

		ArbolGeneral<T> aux = null;
		ArbolGeneral<T> aux2 = null;
		
		if(!this.esVacio()) {
			aux = buscarA(a, this);
			if(aux!=null)
				aux2 = buscarA(b, aux);
		}
		
		resultado = (aux != null & aux2 != null);
		return resultado;
	}
	
	private ArbolGeneral<T> buscarA(T dato, ArbolGeneral<T>subArbol) {
		boolean encontre = false;
		T dato1 = subArbol.getDato();
		ArbolGeneral<T> aux = null;

		if(dato1.equals(dato)) {
			aux = subArbol;
			encontre = true;
			return aux;
		}
		else {
			if(subArbol.tieneHijos()) {
				ListaGenerica<ArbolGeneral<T>> hijos = subArbol.getHijos();
				hijos.comenzar();
			
				while(!hijos.fin() && aux==null) {
					aux = buscarA(dato, hijos.proximo());
				}
			}
		}
		
		return aux;
	}
}