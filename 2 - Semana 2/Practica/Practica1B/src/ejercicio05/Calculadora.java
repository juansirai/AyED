package ejercicio05;

public class Calculadora {
	private static int globalMax;
	private static int globalMin;
	private static double globalAvg;

	// TODO Devuelva lo pedido por el mecanismo de retorno de un método en Java
	public static Datos metodo1(int[] arreglo){
		int max = -1; int min = 9999; int total=0;
		
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] > max) max = arreglo[i];
			if(arreglo[i]<min) min = arreglo[i];
			total = total + arreglo[i];
		}
		
		Datos resultado = new Datos();
		resultado.setAvg((double)total / arreglo.length);
		resultado.setMax(max);
		resultado.setMin(min);
		
		return resultado;
	}
	
	// TODO Devuelva lo pedido interactuando con algún parámetro
	
	public static void metodo2(int[] arreglo, Datos resultado) {
		int max = -1; int min = 9999; int total=0;
	
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] > max) max = arreglo[i];
		    if(arreglo[i]<min) min = arreglo[i];
			total = total + arreglo[i];
		}
		
		// resultado ya viene instanciado desde el pp.
		resultado.setAvg((double) total / arreglo.length);
		resultado.setMax(max);
		resultado.setMin(min);
	}
	
	// TODO Devuelva lo pedido sin usar parámetros ni la sentencia "return"
	
	
	public static void metodo3(int[] arreglo) {
		globalMax = -1; globalMin = 9999; int total=0;
	
		for(int i=0; i<arreglo.length; i++) {
			if(arreglo[i] > globalMax) globalMax = arreglo[i];
			if(arreglo[i]<globalMin) globalMin = arreglo[i];
			total = total + arreglo[i];
		}
		
		globalAvg = (double)total / arreglo.length;
		
	}
	
	public static int getGlobalMin() {
		return globalMin;
	}
	
	public static double getGlobalAvg() {
		return globalAvg;
	}
	
	public static int getGlobalMax() {
		return globalMax;
	}
}
