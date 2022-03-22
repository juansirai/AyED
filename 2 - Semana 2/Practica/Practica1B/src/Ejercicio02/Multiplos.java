package Ejercicio02;

public class Multiplos {
	/* TODO Escriba un método de clase que dado un número n devuelva un nuevo arreglo de
	tamaño n con los n primeros múltiplos enteros de n mayores o iguales que 1 */
	
	public static int[] getVector(int n){
		int[] vectorAux = new int[n];
		// consultar si es conveniente definirlo como variable de clase.
		for(int i=0; i < n; i++) {
			vectorAux[i] = n * (i+1);
		}
		return vectorAux;
	}
}
