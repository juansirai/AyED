package ejercicio1_6;

import tp02.ejercicio1.*;

public class Ejercicio1_6 {
	private ListaDeEnterosEnlazada unaLista;
	
	public Ejercicio1_6() {
		this.unaLista = new ListaDeEnterosEnlazada();
	}
		
	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		this.unaLista.agregarFinal(n);
		if (n != 1) {
			if (n%2==0) {
				calcularSucesion(n/2);
			}
			else {
				calcularSucesion(3*n + 1);
			}
		}
		return this.unaLista;
	}
	
	public static void main (String[] args) {
		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = f.calcularSucesion(20);
		
		l.comenzar();
		while (!l.fin()) {
			System.out.print(l.proximo() + " - ");
		}
	}

	
}
