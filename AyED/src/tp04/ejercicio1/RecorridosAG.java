package tp04.ejercicio1;
import tp02.ejercicio2.*;

public class RecorridosAG {
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral
			<Integer> a, Integer n){
		
		ListaGenerica<Integer> aux = new ListaEnlazadaGenerica<Integer>();
		
		if(!a.esVacio()) {
			recorridoPreOrden(a, n, aux);
		}
		return aux;
	}
	private  void recorridoPreOrden(ArbolGeneral
		<Integer> a, Integer n, ListaGenerica<Integer> aux ){
			
		int dato = a.getDato();
		if(dato % 2 != 0 && dato>n)
			aux.agregarFinal(dato);
		
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		
		while(!hijos.fin()) {
			recorridoPreOrden(hijos.proximo(), n, aux);
		}
			
	}
	
	
	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden(ArbolGeneral
			<Integer> a, Integer n){
		
		ListaGenerica<Integer> aux = new ListaEnlazadaGenerica<Integer>();
		
		if(!a.esVacio()) {
			recorridoInOrden(a, n, aux);
		}
		return aux;
	}
	
	private void recorridoInOrden(ArbolGeneral<Integer>a, Integer n,
			ListaGenerica<Integer>aux){
		
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		
		if(!hijos.esVacia()) {
			recorridoInOrden(hijos.proximo(), n, aux);
		}
		
		int dato = a.getDato();
		if(dato % 2 !=0 && dato > n)
			aux.agregarFinal(dato);
		while(!hijos.fin()) {
			recorridoInOrden(hijos.proximo(), n, aux);
		}

	}
	
	public ListaGenerica<Integer > numerosImparesMayoresQuePostOrden (ArbolGeneral
			<Integer> a, Integer n){
		
		ListaGenerica<Integer>aux = new ListaEnlazadaGenerica<Integer>();
		
		if(!a.esVacio()) {
			recorridoPostOrden(a, n, aux);
		}
		return aux;
	}
	
	private void recorridoPostOrden(ArbolGeneral<Integer>a, Integer n, ListaGenerica<Integer>aux) {
		
		ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		
		while(!hijos.fin()) 
			recorridoPostOrden(hijos.proximo(), n, aux);
		
		int dato = a.getDato();
		if(dato % 2 !=0 && dato>n)
			aux.agregarFinal(dato);
	}
	
	
	public ListaGenerica< Integer > numerosImparesMayoresQuePorNiveles(ArbolGeneral
			<Integer> a, Integer n){
		
		ListaGenerica<Integer>aux = new ListaEnlazadaGenerica<Integer>();
		aux.comenzar();
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		ArbolGeneral<Integer> arbol_aux;
		
		cola.Encolar(a);
		while(!cola.esVacia()) {
			arbol_aux = cola.Desencolar();
			int dato = arbol_aux.getDato();
			if(dato % 2 !=0 && dato>n)
				aux.agregarFinal(dato);
			
			if(arbol_aux.tieneHijos()) {
				
				ListaGenerica<ArbolGeneral<Integer>>hijos = arbol_aux.getHijos();
				hijos.comenzar();
				while(!hijos.fin()) {
					cola.Encolar(hijos.proximo());
				}
			}
			
		}
		
		
		return aux;
	}
}

