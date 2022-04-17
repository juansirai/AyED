package tp03.ejercicio1;

import tp02.ejercicio2.*;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho; 

	
	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
		int cantidadHojas = 0;
		
		if (this.esHoja()){
			return 1;
		}
		
		else {
			if(this.tieneHijoIzquierdo()) {
				cantidadHojas+= this.getHijoIzquierdo().contarHojas();
			}
			if(this.tieneHijoDerecho()) {
				cantidadHojas+= this.getHijoDerecho().contarHojas();
			}
		}
	
		return cantidadHojas;
		
	}
	

    public ArbolBinario<T> espejo() {
		
    	ArbolBinario<T> nuevoArbol = new ArbolBinario<T>(this.getDato());
    	
    	if(this.tieneHijoIzquierdo()) {
    		nuevoArbol.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
    	}
    	if(this.tieneHijoDerecho()) {
    		nuevoArbol.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
    	}
    	
		return nuevoArbol;
	}


	public void porNiveles(){
		ArbolBinario<T> V = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		// encolo la raiz
		cola.Encolar(this);
		//mientras cola no está vacia
		while(!cola.esVacia()) {
			//desencolo e imprimo
			V = cola.Desencolar();
			System.out.println(V.getDato());
			//encolo hijo izquierdo
			if(V.tieneHijoIzquierdo()) {
				cola.Encolar(V.getHijoIzquierdo());
			}
			//encolo hijo derecho
			if(V.tieneHijoDerecho()) {
				cola.Encolar(V.getHijoDerecho());
			}
		}
	}
	
	public void entreNiveles(int a, int b) {
		ArbolBinario<T> V = null; //auxiliar
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nroNivel = 0;
		
		//encolar raíz R en q; encolar ?? en q;
		cola.Encolar(this);
		cola.Encolar(null);
		
		//mientras no se vacíe la cola
		while(!cola.esVacia()) {
			//desencolo V
			V = cola.Desencolar();
			//me fijo que no sea la marca de fin
			if(V!=null) {
				
				//me fijo si estoy entre los niveles
				if(nroNivel>=a && nroNivel <=b) System.out.println(V.getDato());
				if(V.tieneHijoIzquierdo()) cola.Encolar(V.getHijoIzquierdo());
				if(V.tieneHijoDerecho()) cola.Encolar(V.getHijoDerecho());
		
			}
			else {
				if(!cola.esVacia()) {
					cola.Encolar(null);
					nroNivel++;
				}
			}	
			
		}
		
	}

	

}
