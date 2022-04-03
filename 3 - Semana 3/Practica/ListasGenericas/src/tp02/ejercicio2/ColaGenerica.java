package tp02.ejercicio2;

public class ColaGenerica<T>{
	private ListaGenerica<T> datos = new ListaEnlazadaGenerica<T>();
	
	public boolean Encolar(T elemento) {
		this.datos.agregarFinal(elemento);
		return true;
	}
	
	public T Tope(){
		T elemento = this.datos.elemento(1);
		return elemento;
	}
	
	public T Desencolar() {
		T elemento = this.Tope();
		this.datos.eliminarEn(1);
		return elemento;
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
}
