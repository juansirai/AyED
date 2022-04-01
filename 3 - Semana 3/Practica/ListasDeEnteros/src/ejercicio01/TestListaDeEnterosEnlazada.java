package ejercicio01;

import java.util.Scanner;
import tp02.ejercicio1.*;
public class TestListaDeEnterosEnlazada {
	
	public static void main(String[] args) {
		ListaDeEnterosEnlazada unaLista = new ListaDeEnterosEnlazada();
		Scanner s = new Scanner(System.in);
		
		/* Comienzo la entrada de valores */
		System.out.println("Ingrese un numero (-1 para finalizar): ");
		int unNumero = s.nextInt();
		while (unNumero != -1) {
			unaLista.agregarFinal(unNumero);
			System.out.println("Ingrese un numero (-1 para finalizar): ");
			unNumero = s.nextInt();
		}
		
		if(!unaLista.esVacia()) {
			unaLista.comenzar();
			System.out.println("A continuacion los elementos de la lista: ");
			while(!unaLista.fin()) {
				System.out.println(unaLista.proximo());
			}
		}
		 s.close();	
	}
}