package ejercicio1_5;

import tp02.ejercicio1.*;
public abstract class ImprimirRecursivo {
	
	
	public static void inverso(ListaDeEnteros unaLista) {
		if(! unaLista.fin()) {
			int elemento = unaLista.proximo();
			inverso(unaLista);
			System.out.println(elemento);
		}
		
	}
}
