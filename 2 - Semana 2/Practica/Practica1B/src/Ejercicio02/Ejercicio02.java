package Ejercicio02;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO probar con distintos valores de n ingresándolos por teclado
		int a;
		int[] vector;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese limite inferior (-1 para finalizar): ");
		a = s.nextInt();
		while(a != -1) {
			System.out.println("A continuacion el vector de multiplos: ");
			vector = Multiplos.getVector(a);
			for(int i=0; i<a; i++) {
				System.out.println(vector[i]);
			}
			System.out.println("Ingrese limite inferior (-1 para finalizar): ");
			a = s.nextInt();
		}
		s.close();
	}

}
