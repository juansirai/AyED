package tp06.ejercicio5;

import tp06.ejercicio3.*;
import tp06.ejercicio5.*;
import tp02.ejercicio2.*;

public class TestMapa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vertice<String> lp = new VerticeImplListAdy<String>("La Plata");
		Vertice<String> chas = new VerticeImplListAdy<String>("Chascomus");
		Vertice<String> cast = new VerticeImplListAdy<String>("Castelli");
		Vertice<String> dol = new VerticeImplListAdy<String>("Dolores");
		Vertice<String> guido = new VerticeImplListAdy<String>("Gral Guido");
		Vertice<String> la = new VerticeImplListAdy<String>("Las Armas");
		Vertice<String> vidal = new VerticeImplListAdy<String>("Coronel Vidal");
		Vertice<String> mdq = new VerticeImplListAdy<String>("Mar del Plata");
		
		Vertice<String> bel = new VerticeImplListAdy<String>("Gral Belgrano");
		Vertice<String> lan = new VerticeImplListAdy<String>("Langueyu");
		Vertice<String> aya = new VerticeImplListAdy<String>("Ayacucho");
		Vertice<String> bal = new VerticeImplListAdy<String>("Balcarce");
		
		Grafo<String> ciudades = new GrafoImplListAdy<String>();
		
		ciudades.agregarVertice(lp);
		ciudades.agregarVertice(chas);
		ciudades.agregarVertice(cast);
		ciudades.agregarVertice(dol);
		ciudades.agregarVertice(guido);
		ciudades.agregarVertice(la);
		ciudades.agregarVertice(vidal);
		ciudades.agregarVertice(mdq);
		
		ciudades.agregarVertice(bel);
		ciudades.agregarVertice(lan);
		ciudades.agregarVertice(aya);
		ciudades.agregarVertice(bal);

		/*creo los enlaces entre nodos*/
		ciudades.conectar(lp, chas);
		ciudades.conectar(chas, cast);
		ciudades.conectar(cast, dol);
		ciudades.conectar(dol, guido);
		ciudades.conectar(guido, la);
		ciudades.conectar(la, vidal);
		ciudades.conectar(vidal, mdq);
		ciudades.conectar(lp, bel);
		ciudades.conectar(bel, lan);
		ciudades.conectar(lan, aya);
		ciudades.conectar(aya, bal);
		ciudades.conectar(bal, mdq);
		
		ciudades.conectar(cast, bel);
		ciudades.conectar(bel, cast);
		ciudades.conectar(dol, lan);
		ciudades.conectar(lan, dol);
		ciudades.conectar(la, aya);
		ciudades.conectar(aya, la);
		ciudades.conectar(bal, vidal);
		ciudades.conectar(vidal, bal);
		
		
		
		Mapa mapa = new Mapa(ciudades);
		
		System.out.println("El recorrido de La Plata a Mar del Plata es: ");
		ListaGenerica<String> recorrido = mapa.devolverCamino("La Plata", "Mar del Plata");
		System.out.println(recorrido.toString());
		
		
		ListaEnlazadaGenerica<String> excepto = new ListaEnlazadaGenerica<String>();
		excepto.agregarFinal("Dolores");
		excepto.agregarFinal("Balcarce");
		
		System.out.println("Recorrido sin pasar por dolores y balcarce: ");
		
		ListaGenerica<String> recorrido2 = mapa.devolverCaminoExceptuando("La Plata", "Mar del Plata", excepto);
		System.out.println(recorrido2.toString());
	}

}
