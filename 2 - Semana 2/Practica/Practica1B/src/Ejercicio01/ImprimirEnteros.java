package Ejercicio01;

public class ImprimirEnteros {
	//private int a;
	//private int b;
	
	public static void getBetweenFor(int a, int b) {
		int i;
		for (i = a; i <= b; i++) {
			System.out.println(i);	
		}
	}
	
	public static void getBetweenWhile(int a, int b) {
		int i = a;
		while(i<=b) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void getBetweenRecursive(int a, int b) {
		if(a == b) System.out.println(a);
		else{
			System.out.println(a);
			getBetweenRecursive(a+ 1 , b);
		}
	}
}
