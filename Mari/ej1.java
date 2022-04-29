package ej1;

public class ej1 {
	public static void imprimirNros(int a, int b) {
		
		for (int i=a; i <= b; i++ ) {
			System.out.println(i);
			
		}
	}
	
	public static void imprimirNrosWhile(int a, int b) {
		int i=a;
		
		while (i <= b) {
			
			System.out.println(i);
			i++;
			
		}
	}
	public static void imprimir(int a,int b) {		
		if (a <= b) {
			System.out.println(a );		
			a++;			
		    ej1.imprimir(a,b);
		}
		
	}
	
	public static void main (String[] args) {
		System.out.println("Por for:");
		ej1.imprimirNros(3, 5);
		System.out.println("Por While:");
		ej1.imprimirNrosWhile(5, 9);
		System.out.println("Recursiva:");
		ej1.imprimir(1, 5);
	}

}
