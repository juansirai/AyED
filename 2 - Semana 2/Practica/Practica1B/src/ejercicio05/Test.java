package ejercicio05;

public class Test {

	public static void main(String[] args) {
		int[] arreglo1 = {1,5,75,43,23,56,32,4,32};
		Datos resultado;
		Datos resultado2;
		
		System.out.println("Resultado con metodo 1: ");
		resultado = Calculadora.metodo1(arreglo1);
		System.out.println("Minimo: "+ resultado.getMin() + " Maximo: "+resultado.getMax()+" Promedio: "+resultado.getAvg());
		
		System.out.println("Resultado con metodo 2: ");
		resultado2 = new Datos();
		Calculadora.metodo2(arreglo1, resultado2);
		System.out.println("Minimo: "+ resultado2.getMin() + " Maximo: "+resultado2.getMax()+" Promedio: "+resultado2.getAvg());

		System.out.println("Resultado con metodo 3: ");
		Calculadora.metodo3(arreglo1);
		System.out.println("Minimo: "+ Calculadora.getGlobalMin() + " Maximo: "+Calculadora.getGlobalMax()+" Promedio: "+Calculadora.getGlobalAvg());
	}

}
