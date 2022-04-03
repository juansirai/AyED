package tp02.ejercicio2;

public class PilaGenerica<T> {
	ListaGenerica<T> datos ;
	
	public PilaGenerica() {
		this.datos = new ListaEnlazadaGenerica<T>();
	}
	
	public boolean Apilar(T elemento) {
		this.datos.agregarInicio(elemento);
		return true;
	}
	
	public T Tope(){
		return this.datos.elemento(1);
	}
	
	public T Desapilar() {
		T elemento = this.Tope();
		this.datos.eliminarEn(1);
		return elemento;
	}
	
	public boolean esVacia() {
		return this.datos.esVacia();
	}
}
