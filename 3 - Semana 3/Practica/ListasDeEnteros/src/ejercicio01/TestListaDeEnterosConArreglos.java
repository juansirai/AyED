package ejercicio01;

import java.util.Scanner;

import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ListaDeEnterosConArreglos unaLista = new ListaDeEnterosConArreglos();
		
		/*Se dispone a cargar la lista*/
		String continua = "Y";
		while (continua.equals("Y")) {
			System.out.println("Ingrese un numero");
			int num = s.nextInt();
			s.nextLine();
			unaLista.agregarFinal(num);
			System.out.println("Quiere agregar otro? (Y/N)");
			continua = s.nextLine();
		}
		
		/*Se dispone a recorrer e imprimir la lista generada*/
		unaLista.comenzar();
		if(!unaLista.esVacia()) {
			System.out.println("Los numeros ingresados fueron: ");
			while (! unaLista.fin()) {
				System.out.println(unaLista.proximo());
			}
		}
		s.close();
	}
}