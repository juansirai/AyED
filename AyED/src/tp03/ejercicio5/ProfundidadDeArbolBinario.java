package tp03.ejercicio5;
import tp03.ejercicio1.ArbolBinario;
import tp02.ejercicio2.*;

public class ProfundidadDeArbolBinario {
	ArbolBinario<Integer> a;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer>a) {
		this.a = a;
	}
	
	public int sumaElementosProfundidad(int p) {
		
		ArbolBinario<Integer> arbol = null;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		boolean continua = true;
		
		int profundidad = 0;
		int resultado = 0;
		
		cola.Encolar(this.a);
		cola.Encolar(null);
		
		//mientras no se vacie la cola
		while(!cola.esVacia() && continua) {
			
			arbol = cola.Desencolar();
			
			//si no es la marca de fin de nivel
			if(arbol!=null) {
				
				//me fijo si estoy en la profundidad deseada
				if(profundidad == p) 
					resultado = resultado + a.getDato();
				
				// encolo
				if(a.tieneHijoIzquierdo()) 
					cola.Encolar(a.getHijoIzquierdo());
				if(a.tieneHijoDerecho()) 
					cola.Encolar(a.getHijoDerecho());
			}
			else {
				if(!cola.esVacia()) {
					cola.Encolar(null);
					profundidad++;
				}
			}
			if(profundidad > p) 
				continua = false;
			
		}
		
		//me fijo si salí porque encontré el nivel o porque la cola se vació.
		if(!continua)
			return -1;
		else
			return resultado;
	}
}
