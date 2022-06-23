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
		ciudades.conectar(lp, chas, 81);
		ciudades.conectar(chas, cast, 65);
		ciudades.conectar(cast, dol, 32);
		ciudades.conectar(dol, guido, 41);
		ciudades.conectar(guido, la, 53);
		ciudades.conectar(la, vidal, 44);
		ciudades.conectar(vidal, mdq, 300);
		
		ciudades.conectar(lp, bel, 1022);
		ciudades.conectar(bel, lan, 1);
		ciudades.conectar(lan, aya, 6);
		ciudades.conectar(aya, bal, 9);
		ciudades.conectar(bal, mdq, 30);
		
		ciudades.conectar(cast, bel, 79);
		ciudades.conectar(bel, cast, 79);
		ciudades.conectar(dol, lan, 107);
		ciudades.conectar(lan, dol, 107);
		ciudades.conectar(la, aya, 63);
		ciudades.conectar(aya, la, 63);
		ciudades.conectar(bal, vidal, 76);
		ciudades.conectar(vidal, bal, 76);
		
		
		
		Mapa mapa = new Mapa(ciudades);
		
		//System.out.println("El recorrido de La Plata a Mar del Plata es: ");
		//ListaGenerica<String> recorrido = mapa.devolverCamino("La Plata", "Mar del Plata");
		//System.out.println(recorrido.toString());
		
		
		//ListaEnlazadaGenerica<String> excepto = new ListaEnlazadaGenerica<String>();
		//excepto.agregarFinal("Dolores");
		//excepto.agregarFinal("Balcarce");
		
		//System.out.println("Recorrido sin pasar por dolores y balcarce: ");
		
		//ListaGenerica<String> recorrido2 = mapa.devolverCaminoExceptuando("La Plata", "Mar del Plata", excepto);
		//System.out.println(recorrido2.toString());
		
		
		//System.out.println("Camino mas corto desde La Plata a Mardel");
		//ListaGenerica<String> recorrido3 = mapa.caminoMasCorto("La Plata", "Mar del Plata");
		//System.out.println(recorrido3);
		
		
		//System.out.println("Camino mas corto desde La Plata a Mardel sin cargar combustible");
		//ListaGenerica<String> recorrido4 = mapa.caminoSinCargarCombustible("La Plata", "Mar del Plata", 500);
		//System.out.println(recorrido4);
		
		
		System.out.println("Camino mas corto desde La Plata a Mardel menor carga");
		ListaGenerica<String> recorrido5 = mapa.caminoConMenorCargaDeCombustible("La Plata", "Mar del Plata", 100);
		System.out.println(recorrido5);
	}

}
