package tp06.ejercicio5;

import tp06.ejercicio3.*;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ColaGenerica;

public class Recorridos<T> {
	
	
	public ListaGenerica<Vertice<T>> dfs(Grafo<T> grafo){
		/*inicializar arreglo de booleanos en false*/
		boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()+1];
		
		// inicializo la lista de resultado
		ListaEnlazadaGenerica<Vertice<T>> lista = new ListaEnlazadaGenerica<Vertice<T>>();
		
		// para cada vertice, si no está visitado invoco el metodo dfs
		
		for(int i=1; i<=grafo.listaDeVertices().tamanio();i++) {
			if(! marca[i]) {
				//invoco al metodo privado
				dfs(i, marca, grafo, lista);
			}
		}
		return lista;		
	}
	
	private void dfs(int i, boolean[]marca, Grafo<T> grafo, ListaEnlazadaGenerica<Vertice<T>> lista) {
		marca[i] = true; // marco como visitado
		Vertice<T> v = grafo.listaDeVertices().elemento(i);
		
		//Aca dependiendo de lo que pida el enunciado tengo que hacer algo.
		lista.agregarFinal(v);
		
		ListaGenerica<Arista<T>> ady = grafo.listaDeAdyacentes(v); // obtengo la lista de adyacentes del v actual.
		ady.comenzar();
		
		while(!ady.fin()) {
			
			int j = ady.proximo().verticeDestino().getPosicion();
			if(!marca[j]) {
				dfs(j, marca, grafo, lista);
			}
		}
		
	}
	
	public ListaGenerica<Vertice<T>> bfs(Grafo<T> grafo){
		// inicializo la lista de booleanos
		boolean[] marca = new boolean[grafo.listaDeVertices().tamanio()+1];
		
		//inicializo la lista a retornar como resultado
		ListaEnlazadaGenerica<Vertice<T>> lista = new ListaEnlazadaGenerica<Vertice<T>>();
		
		for(int i=1; i<=marca.length;i++) {
			if(!marca[i]) {
				this.bfs(i, marca, lista, grafo);
			}
		}
		return lista;
	}
	
	private void bfs(int i, boolean[]marca, ListaEnlazadaGenerica<Vertice<T>> lista, Grafo<T> grafo) {
		
		marca[i] = true; // marco
		
		ListaGenerica<Arista<T>> ady = null;
		ColaGenerica<Vertice<T>> cola = new ColaGenerica<Vertice<T>>();
		
		cola.Encolar(grafo.listaDeVertices().elemento(i));
		while(!cola.esVacia()) {
			
			Vertice<T> v = cola.Desencolar();
			lista.agregarFinal(v);
			
			ady = grafo.listaDeAdyacentes(v); //veo los adyacentes del vertice que acabo de encolar
			ady.comenzar();
			while(!ady.fin()) {
				
				Arista<T> a = ady.proximo();
				int j = a.verticeDestino().getPosicion();
				
				if(!marca[j]) {
					Vertice<T> w = a.verticeDestino();
					cola.Encolar(w);
					marca[j] = true;
				}			
			}
		}
	
	}
	
}