package ej1;
import java.util.Scanner;

public class ej2 {
	
	/*static int[] nros;*/
	
	public static int[] devolver(int a) {
		int[] nros= new int[a];		
		
		for (int i= 1; i < nros.length +1;i++) {
			/*System.out.println("i: " + i);
			System.out.println("a: " + a);*/
			nros[i-1]=a * i;
		}
		
		return nros;
	}
	
	public static void main (String[] args) {
		
		int[] arreglo= new int[5];
		arreglo= devolver(5);
		
		for(int elem: arreglo) {
			
			System.out.println("elemento: " + elem);
		}
		
	
	}

}
