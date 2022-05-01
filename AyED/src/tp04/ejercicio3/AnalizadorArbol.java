package tp04.ejercicio3;
import tp02.ejercicio2.*;
import tp04.ejercicio1.ArbolGeneral;


public class AnalizadorArbol {

	public static int devolverMaximoPromedio (ArbolGeneral<AreaEmpresa>arbol) {
		//lo implementaremos con recorrido por niveles
		int nodos = 0;
		int total = 0;
		int promedio = -1;
		if (arbol.esVacio())
			return -1;
		else {
			ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
			ArbolGeneral<AreaEmpresa> auxiliar;

			//encolo raiz y marca de fin de nivel
			cola.Encolar(arbol);
			cola.Encolar(null);
			
			while(!cola.esVacia()) {
				auxiliar = cola.Desencolar();
				
				if(auxiliar != null) {
					nodos++;
					total = total + auxiliar.getDato().getTardanza();
					
					if(auxiliar.tieneHijos()) {
						ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = auxiliar.getHijos();
						hijos.comenzar();
						while(!hijos.fin()) {
							cola.Encolar(hijos.proximo());
						}
					}
				}
				else {
					if(!cola.esVacia()) {
						cola.Encolar(null);
						promedio = Math.max(promedio, total / nodos);
						nodos = 0;
						total = 0;
					}
				}
			}
			
		}
		return promedio;
	}
	
	
	public static void main(String[] args) {
		
		AreaEmpresa eM = new AreaEmpresa("M", 14);
		ArbolGeneral<AreaEmpresa> arbolM = new ArbolGeneral<AreaEmpresa>(eM);
		
		AreaEmpresa eJ = new AreaEmpresa("J", 13);
		ArbolGeneral<AreaEmpresa> arbolJ = new ArbolGeneral<AreaEmpresa>(eJ);
		AreaEmpresa eK = new AreaEmpresa("K", 25);
		ArbolGeneral<AreaEmpresa> arbolK = new ArbolGeneral<AreaEmpresa>(eK);
		AreaEmpresa eL = new AreaEmpresa("L", 10);
		ArbolGeneral<AreaEmpresa> arbolL = new ArbolGeneral<AreaEmpresa>(eL);
		
		AreaEmpresa eA = new AreaEmpresa("A", 4);
		ArbolGeneral<AreaEmpresa> arbolA = new ArbolGeneral<AreaEmpresa>(eA);
		AreaEmpresa eB = new AreaEmpresa("B", 7);
		ArbolGeneral<AreaEmpresa> arbolB = new ArbolGeneral<AreaEmpresa>(eB);
		AreaEmpresa eC = new AreaEmpresa("C", 5);
		ArbolGeneral<AreaEmpresa> arbolC = new ArbolGeneral<AreaEmpresa>(eC);
		AreaEmpresa eD = new AreaEmpresa("D", 6);
		ArbolGeneral<AreaEmpresa> arbolD = new ArbolGeneral<AreaEmpresa>(eD);
		AreaEmpresa eE = new AreaEmpresa("E", 10);
		ArbolGeneral<AreaEmpresa> arbolE = new ArbolGeneral<AreaEmpresa>(eE);
		AreaEmpresa eF = new AreaEmpresa("F", 18);
		ArbolGeneral<AreaEmpresa> arbolF = new ArbolGeneral<AreaEmpresa>(eF);
		AreaEmpresa eG = new AreaEmpresa("G", 9);
		ArbolGeneral<AreaEmpresa> arbolG = new ArbolGeneral<AreaEmpresa>(eG);
		AreaEmpresa eH = new AreaEmpresa("H", 12);
		ArbolGeneral<AreaEmpresa> arbolH = new ArbolGeneral<AreaEmpresa>(eH);
		AreaEmpresa eI = new AreaEmpresa("I", 19);
		ArbolGeneral<AreaEmpresa> arbolI = new ArbolGeneral<AreaEmpresa>(eI);
		
		arbolM.agregarHijo(arbolJ);
		arbolM.agregarHijo(arbolK);
		arbolM.agregarHijo(arbolL);
		
		arbolJ.agregarHijo(arbolA);
		arbolJ.agregarHijo(arbolB);
		arbolJ.agregarHijo(arbolC);
		
		arbolK.agregarHijo(arbolD);
		arbolK.agregarHijo(arbolE);
		arbolK.agregarHijo(arbolF);
		
		arbolL.agregarHijo(arbolG);
		arbolL.agregarHijo(arbolH);
		arbolL.agregarHijo(arbolI);
		
		System.out.println("El maximo promedio es: "+ devolverMaximoPromedio(arbolM));
	}
}
