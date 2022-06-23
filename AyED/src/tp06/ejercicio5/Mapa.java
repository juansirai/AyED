package tp06.ejercicio5;

import tp06.ejercicio3.*;
import tp02.ejercicio2.*;

public class Mapa {
	private Grafo<String> mapa;
	
	public Mapa(Grafo<String> mapa) {
		this.mapa= mapa;
	}
	
	
	
	private Vertice<String> buscar(String ciudad){
		ListaGenerica<Vertice<String>> vertices = this.mapa.listaDeVertices();
		Vertice<String> v = null;
		vertices.comenzar();
		boolean encontre = false;
		while(!vertices.fin() && !encontre) {
			v = vertices.proximo();
			if(v.dato().equals(ciudad)) {
				encontre = true;
				return v;
			}
		}
		return v;
	}
	
	public ListaGenerica<String> devolverCamino(String ciudad1, String ciudad2){
		ListaEnlazadaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		boolean[] marca = new boolean[this.mapa.listaDeVertices().tamanio()+1];
		Vertice<String> origen = buscar(ciudad1);
		dfs(origen.getPosicion(), this.mapa, camino, marca, ciudad2);
		return camino;
	}
	
	private boolean dfs(int i, Grafo<String> grafo, ListaEnlazadaGenerica<String> camino, boolean[]marca, String ciudad2) {
		boolean encontre = false;
		
		marca[i] = true;
		
		Vertice<String> V = grafo.listaDeVertices().elemento(i);
		
		camino.agregarFinal(V.dato());
		
		ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(V);
		if(grafo.listaDeVertices().elemento(i).dato().equals(ciudad2)) {
			encontre = true;
		}
		else {
			ady.comenzar();
			Arista<String> arista;
			while(!ady.fin() && !encontre) {
				arista = ady.proximo();
				int j = arista.verticeDestino().getPosicion();
				if(!marca[j]) {
					encontre = dfs(j, grafo, camino, marca, ciudad2);
				}
			}
			if(!encontre) {
				camino.eliminarEn(camino.tamanio());
				marca[i] = false; 
			}
		}
		
		return encontre;
		
	}
	
	
	public ListaGenerica<String> devolverCaminoExceptuando(String origen, String destino, ListaGenerica<String> ciudades){
		ListaEnlazadaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		boolean[]marca = new boolean[this.mapa.listaDeVertices().tamanio()+1];
		Vertice<String> vOrigen = buscar(origen);
		
		dfsExcluyendo(vOrigen.getPosicion(), this.mapa, camino, marca, ciudades, destino);
		
		return camino;
	}
	
	private boolean dfsExcluyendo(int i, Grafo<String> grafo, ListaEnlazadaGenerica<String>camino, boolean[]marca, ListaGenerica<String> ciudades, String destino) {
		boolean encontre = false;
		marca[i] = true;
		
		Vertice<String>v = grafo.listaDeVertices().elemento(i);
		
		camino.agregarFinal(v.dato());
		
		ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(v);
		
		/*caso base*/
		if(grafo.listaDeVertices().elemento(i).dato().equals(destino)) {
			encontre = true;
		}
		else {
			ady.comenzar();
			Arista<String> arista = null;
			while(!ady.fin() && !encontre) {
				arista = ady.proximo();
				int j = arista.verticeDestino().getPosicion();
				
				if(!marca[j] && !ciudades.incluye(arista.verticeDestino().dato())) {
					encontre = dfsExcluyendo(j, grafo, camino, marca, ciudades, destino);
				}
			}
			
			if(!encontre) {
				camino.eliminarEn(camino.tamanio());
				if(!ciudades.incluye(arista.verticeDestino().dato()))
					marca[i] = false;
			}
		}
		return encontre;
	}
	
	
	public ListaGenerica<String> caminoMasCorto(String ciudad1, String ciudad2){
		ListaEnlazadaGenerica<String>camino = new ListaEnlazadaGenerica<String>();
		ListaEnlazadaGenerica<String>aux = new ListaEnlazadaGenerica<String>();
		
		boolean[] marca = new boolean[this.mapa.listaDeVertices().tamanio()+1];
		Vertice<String> origen = buscar(ciudad1);
		Minimo minimo = new Minimo(9999);
		int costo = 0;
		aux.agregarFinal(origen.dato());
		marca[origen.getPosicion()] = true;
		
		dfsCorto(origen.getPosicion(), ciudad2, marca, this.mapa, camino, minimo, aux, costo);
		
		return camino;
	}

	private void dfsCorto(int i, String destino, boolean[]marca, Grafo<String> grafo, ListaEnlazadaGenerica<String>camino, Minimo minimo, ListaEnlazadaGenerica<String>aux, int costo) {
		Vertice<String> vDestino = null;
		int p=0; int j=0;
		Vertice<String> v = grafo.listaDeVertices().elemento(i);
		
		ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(v);
		ady.comenzar();
		
		while(!ady.fin()) {
			Arista<String> arista = ady.proximo();
			j = arista.verticeDestino().getPosicion();
			if(!marca[j]) {
				p = arista.peso();
				if(costo+p<=minimo.getMinimo()) {
					vDestino = arista.verticeDestino();
					aux.agregarEn(vDestino.dato(), aux.tamanio()+1);
					marca[j] = true;
					
					if(vDestino.dato().equals(destino)) {
						minimo.setMinimo(costo+p);
						copiarLista(aux, camino);
					}
					else
						dfsCorto(j, destino, marca, grafo, camino, minimo, aux, costo+p);
					
					aux.eliminar(vDestino.dato());
					marca[j] = false;
				}
			}
		}
		
		
	}
	
	
	
	private void copiarLista (ListaEnlazadaGenerica<String> lis,ListaEnlazadaGenerica<String> camino) {
		lis.comenzar();
		camino.comenzar();
		while(!camino.fin())
			camino.eliminar(camino.proximo());

		while(!lis.fin()) {
			camino.agregarFinal(lis.proximo());
		}
	}
	
	public ListaGenerica<String> caminoSinCargarCombustible(String ciudad1, String ciudad2, int tanque){
		ListaEnlazadaGenerica<String> camino = new ListaEnlazadaGenerica<String>();
		boolean[]marca = new boolean[this.mapa.listaDeVertices().tamanio()+1];
		Vertice<String>origen = buscar(ciudad1);
		
		dfsSinCombustible(origen.getPosicion(), this.mapa, marca, camino, ciudad2, tanque);
		
		return camino;
	}
	
	
	private boolean dfsSinCombustible(int i, Grafo<String>grafo, boolean[]marca, ListaEnlazadaGenerica<String>camino, String destino, int tanque) {
		boolean encontre = false;
		marca[i] = true;
		Vertice<String>v = grafo.listaDeVertices().elemento(i);
		ListaGenerica<Arista<String>> ady = grafo.listaDeAdyacentes(v);
		
		camino.agregarFinal(v.dato());
		
		/*caso base*/
		if(v.dato().equals(destino))
			encontre = true;
		else {
			ady.comenzar();
			Arista<String>arista ;
			
			while(!ady.fin()&& !encontre) {
				arista = ady.proximo();
				int j = arista.verticeDestino().getPosicion();
				
				if(!marca[j]) {
					int p = arista.peso();
					
					if(tanque-p>0) {
						encontre = dfsSinCombustible(j, grafo, marca, camino, destino, tanque-p);
					}
				}
			}
			if(!encontre) {
				camino.eliminarEn(camino.tamanio());
				marca[i] = false; 
			}
		}
		
		return encontre;
	}
	
	
	
	public ListaGenerica<String> caminoConMenorCargaDeCombustible(String ciudad1, String ciudad2, int tanqueAuto){
		ListaEnlazadaGenerica<String> camino = new ListaEnlazadaGenerica<String>(); /*camino a retornar*/
		ListaEnlazadaGenerica<String> aux = new ListaEnlazadaGenerica<String>(); /*auxiliar para ir guardando los minimos*/
		
		Vertice<String> v = buscar(ciudad1);
		boolean[] marca = new boolean[this.mapa.listaDeVertices().tamanio()+1];
		
		Minimo minimo = new Minimo(9999);
		
		aux.agregarFinal(v.dato()); /*agrego el vertice y lo marco como visitado (ver si es correcto)*/
		marca[v.getPosicion()] = true;
		
		int remanente = tanqueAuto;
		int cargas = 0;
				
		dfsCombustibleMinimo(v.getPosicion(), this.mapa, marca, camino,aux, ciudad2, tanqueAuto,remanente,minimo, cargas);
		return camino;
	}
	
	
	
	private void dfsCombustibleMinimo(int i, Grafo<String>grafo, boolean[]marca,ListaEnlazadaGenerica<String> camino,
			                          ListaEnlazadaGenerica<String> aux , String destino, 
			                          int tanque,int remanente, Minimo minimo, int cargas ) {
		
	
	Vertice<String>vDestino= null;
	int p=0; int j=0;
	Vertice<String>v = grafo.listaDeVertices().elemento(i);
	ListaGenerica<Arista<String>>ady = grafo.listaDeAdyacentes(v);
	
	if(v.dato().equals(destino)) {	
		if(cargas<=minimo.getMinimo()){
				minimo.setMinimo(cargas);
			copiarLista(aux, camino);
		}
	}
	else {
		ady.comenzar();
		while(!ady.fin()) {
		
			Arista<String>arista = ady.proximo();
			j = arista.verticeDestino().getPosicion();
			if(!marca[j]) {
			
				p = arista.peso();  //consumo de combustible que me implicaria el tramo
				if(p<tanque) {
				    if(remanente-p<=0) {
					    remanente = tanque;
					    cargas += 1;
				    }
			
				
				    vDestino = arista.verticeDestino();
				    aux.agregarEn(vDestino.dato(), aux.tamanio()+1);
				    marca[j] = true;
					
				    dfsCombustibleMinimo(j, this.mapa, marca, camino,aux, destino, tanque,remanente-p,minimo, cargas);
				
				    aux.eliminar(vDestino.dato());
					marca[j] = false;
					cargas-=1;
				
					}
		
				}
			}

		}	
	}
	
}

