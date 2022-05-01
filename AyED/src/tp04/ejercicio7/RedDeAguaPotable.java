package tp04.ejercicio7;
import tp04.ejercicio1.*;
import tp02.ejercicio2.*;


public class RedDeAguaPotable<T> {
	private ArbolGeneral<T> a;
	
	public RedDeAguaPotable() {};
	public RedDeAguaPotable(ArbolGeneral<T> a) {
		this.a = a;
	}
	
	public double minimoCaudal(double caudal) {
		double minimo = 9999;
		if(!this.a.esVacio())
			minimo = calcularMinimo(caudal, this.a);
		return minimo;
	}
	
	private double calcularMinimo(double caudal, ArbolGeneral<T> arbol) {
		double minimo = 99999;
		if(arbol.esHoja())
			minimo = caudal;
		if(arbol.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = arbol.getHijos();
			hijos.comenzar();
			int bifurcaciones = hijos.tamanio();
			double caudalNodo = caudal/bifurcaciones;
			while(!hijos.fin())
				minimo = Math.min(minimo,calcularMinimo(caudalNodo, hijos.proximo())) ;
		}
		return minimo;
	}
}
