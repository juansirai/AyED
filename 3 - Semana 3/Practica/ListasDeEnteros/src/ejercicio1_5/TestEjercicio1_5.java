package ejercicio1_5;

import tp02.ejercicio1.*;
import java.util.*;

public class TestEjercicio1_5 {

	public static void main(String[] args) {
		ListaDeEnterosConArreglos unaLista = new ListaDeEnterosConArreglos();
		ListaDeEnterosEnlazada unaLista2 = new ListaDeEnterosEnlazada();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Generamos una lista con arreglo, insertando adelante: ");
		System.out.println("Ingrese un numero, -1 para finalizar: ");
		int unNumero = s.nextInt();
		
		while(unNumero != -1) {
			unaLista.agregarInicio(unNumero);
			System.out.println("Ingrese un numero, -1 para finalizar: ");
			unNumero = s.nextInt();
		}
		
		/*imprimimos de forma recursiva*/
		unaLista.comenzar();
		System.out.println("--------------------------------------");
		System.out.println("Como se insertó adelante, esta lista se imprime en el orden en que ingresamos los numeros: ");
		if(!unaLista.esVacia()) ImprimirRecursivo.inverso(unaLista);
		
		
		System.out.println("Generamos una lista enlazada, insertando atras: ");
		System.out.println("Ingrese un numero, -1 para finalizar: ");
		unNumero = s.nextInt();
		
		while(unNumero != -1) {
			unaLista2.agregarFinal(unNumero);
			System.out.println("Ingrese un numero, -1 para finalizar: ");
			unNumero = s.nextInt();
		}
		/*imprimimos de forma recursiva*/
		unaLista2.comenzar();
		System.out.println("--------------------------------------");
		System.out.println("Como se insertó atras, esta lista se imprime del último al primero: ");
		if(!unaLista2.esVacia()) ImprimirRecursivo.inverso(unaLista2);
	}

}
