package Ejercicio01;

public class ejercicio01 {

	public static void main(String[] args) {
		// TODO llamar al modulo con un for
		System.out.println("Imprimimos entre 3 y 10");
		ImprimirEnteros.getBetweenFor(3, 10);
		
		// TODO llamar al módulo con un while
		System.out.println();
		System.out.println("Imprimimos entre 7 y 20");
		ImprimirEnteros.getBetweenWhile(7, 20);
		
		// TODO llamar al móduclo con una estructura que no sea de iteración
		System.out.println();
		System.out.println("Imprimimos entre 2 y 10");
		ImprimirEnteros.getBetweenRecursive(2, 10);
		

	}

}
