package tp02.ejercicio2;
import java.util.*;

public class TestBalanceo {
	
	public static boolean Validar(Character ch) {
		
	// Devuelve true si el caracter recibido está dentro de los permitidos
		boolean result;
		char aux = ch.charValue();
		switch(aux) {
			case '[': 
				result = true;
				break;
			case ']': 
				result = true;
				break;
			case '(': 
				result = true;
				break;
			case ')': 
				result = true;
				break;
			case '{': 
				result = true;
				break;
			case '}': 
				result = true;
				break;
			default: 
				result = false;
		}
		return result;
	}
	
	public static boolean Coincide(char ele1, char ele2) {
		/* en una situacion normal, como desapilo desde la ultima posicion del string,
		los caracteres que tendría como elemento 1 (en la pila aux) deberían ser de cierre, ya que
		los voy eliminando a medida que cierran con la pila 1*/
		
		boolean resultado = false;
		switch(ele1) {
			case '}': 
				resultado = ele2 == '{';
				break;
			case ')': 
				resultado = ele2 == '(';
				break;
			case ']': 
				resultado = ele2 == '[';
				break;
		}
		return resultado;
	}
	
	public static boolean Termino(char ele1) {
	/*Esta funcion va a evaluar el caracter que acabo de apilar en la estructura
	 * secundaria. Si es un caracter de apertura, es porque no he podido cerrarlo
	 * previamente, con lo cual el patrón no se cumplió y debo dejar de iterar*/
		return (ele1 == '(' || ele1 == '[' || ele1 == '{');	
	}

	
	public static boolean evaluarPila(PilaGenerica<Character> pilaUno) {
		PilaGenerica<Character> aux = new PilaGenerica<Character>();
		boolean cierra = false; 
		boolean continua = true;
		boolean exito = false;
		char elemento1;
		char elemento2;
		while (continua && !pilaUno.esVacia()) {
			// paso un elemento a la pila auxiliar
			if(!cierra || aux.esVacia()) aux.Apilar(pilaUno.Desapilar());
			
			// veo cual es el elemento que le sigue a la primera pila
			elemento2 = pilaUno.Tope().charValue();
			elemento1 = aux.Tope().charValue();
			
			// me fijo si corresponde seguir iterando
			continua = !Termino(elemento1);
			if(continua) {
				// me fijo si entre ambas pilas puedo cerrar
				cierra = Coincide(elemento1, elemento2);
				if(cierra) {
					//si cierra, desapilo ambos elementos
					aux.Desapilar();
					pilaUno.Desapilar();
					}
				}
			}
			
		if(continua && pilaUno.esVacia() && aux.esVacia()) exito = true;
	
		return exito;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaGenerica<Character> unaPila = new PilaGenerica<Character>(); //por que me pide que sea Character y no char?
		
		Character unCaracter;
		boolean resultado = false;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Por favor ingrese la secuencia de caracteres ");
		String texto = s.nextLine();
		if(!texto.equals(" ")) {
			/*TRANSFIERO LOS ELEMENTOS A LA PILA*/
			int i=0;
			unCaracter = '?';
			boolean ok = true;
			while(i<texto.length() && ok) {
			
				// nos quedamos con cada caracter del string
				unCaracter = texto.charAt(i);
				ok = Validar(unCaracter);
				//almacenamos el caracter en la pila
				if (ok) {
					unaPila.Apilar(unCaracter);
					i++;
				}
			}
		
			// si los caracteres cumplian la condicion, procedo a inspeccionar la pila
			if(ok) {
				resultado = evaluarPila(unaPila);
			}
			else System.out.println("El string contenia caracteres no permitidos " + unCaracter);
		}
		
		// si el string era un string vacio
		else resultado = true;
		
		System.out.println("El resultado de la evaluacion es "+ resultado);
	    s.close();
	}	
}


