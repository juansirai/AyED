package Ejercicio02;

public class Multiplos {
	/* TODO Escriba un m�todo de clase que dado un n�mero n devuelva un nuevo arreglo de
	tama�o n con los n primeros m�ltiplos enteros de n mayores o iguales que 1 */
	
	public static int[] getVector(int n){
		int[] vectorAux = new int[n];
		// consultar si es conveniente definirlo como variable de clase.
		for(int i=0; i < n; i++) {
			vectorAux[i] = n * (i+1);
		}
		return vectorAux;
	}
}
