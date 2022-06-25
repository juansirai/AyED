package tp06.ejercicio6;

import tp06.ejercicio3.*;
import tp02.ejercicio2.*;

public class VisitaOslo {

    
    public VisitaOslo(){

    }
    
    public ListaGenerica<String> paseoEnBici(Grafo<String>lugares, String destino, int maxTiempo, 
    		                                 ListaGenerica<String>lugaresRestringidos){
    	
    	ListaGenerica<Vertice<String>>vertices = lugares.listaDeVertices();
    	ListaEnlazadaGenerica<String>recorrido = new ListaEnlazadaGenerica<String>();
    	boolean[]visitados = new boolean[lugares.listaDeVertices().tamanio()+1];
    	String origen = "Ayuntamiento";
    	
    	vertices.comenzar();
    	while(!vertices.fin()) {
    		// busco si existe el destino antes de disparar el recorrido
    		Vertice<String>v = vertices.proximo();
    		if(v.dato().equals(origen)) {
    			this.dfs(v.getPosicion(), lugares, visitados, recorrido, lugaresRestringidos, maxTiempo, destino);
    		}
    	}
    	return recorrido;  	 	
    }
    
    private boolean dfs(int i, Grafo<String> lugares, boolean[]visitados, ListaEnlazadaGenerica<String>recorrido,
    				 ListaGenerica<String>lugaresRestrigidos, int maxTiempo, String destino) {
    	
    	boolean encontre = false;
    	visitados[i] = true;
    	Vertice<String>v = lugares.listaDeVertices().elemento(i);
    	recorrido.agregarFinal(v.dato());
    	
    	ListaGenerica<Arista<String>>ady = lugares.listaDeAdyacentes(v);
    	
    	if(v.dato().equals(destino)) {
    		encontre = true;
    	}
    	else {
    		ady.comenzar();
    		Arista<String>arista;
    		
    		while(!ady.fin() && !encontre) {
    			arista = ady.proximo();
    			int j = arista.verticeDestino().getPosicion();
    			Vertice<String>vDestino = arista.verticeDestino();
    			int p = arista.peso();
    			
    			if(!visitados[j] && !lugaresRestrigidos.incluye(vDestino.dato()) && maxTiempo-p>=0) {
    				encontre = dfs(j, lugares, visitados, recorrido, lugaresRestrigidos,
    						       maxTiempo-p, destino);
    			}
    		}
    		
    		if(!encontre) {
    			recorrido.eliminarEn(recorrido.tamanio());
    			visitados[i] = false;
    		}
    		
    	}
    	
    	return encontre;
    	
    }
    

}
