package tp03.ejercicio4;
import tp03.ejercicio1.ArbolBinario;

public class RedBinariaLlena {
	/*Ideal es crear un metodo privado con el parámetro, ya que la consigna no lo incluye*/
	public static int retardoReenvio(ArbolBinario <Integer> a) {
		int segundos = -1;
		
		if(a.esVacio())
			return -1;

		if(a.esHoja()) {
			return 0;
		}
		else {
			if(a.tieneHijoIzquierdo()) {
				segundos = Math.max(segundos, retardoReenvio(a.getHijoIzquierdo()));
			}
			if(a.tieneHijoDerecho()) {
				segundos = Math.max(segundos, retardoReenvio(a.getHijoDerecho()));
			}
		}
		//supongo cada nodo tiene su retardo almacenado en DATO.
		// lo que hace aca es sumar de cada nodo, sus segundos mas el maximo de sus
		// dos hijos
		return segundos + a.getDato(); 
		
	}
	
}
