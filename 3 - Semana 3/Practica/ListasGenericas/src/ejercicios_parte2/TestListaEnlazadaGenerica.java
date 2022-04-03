package ejercicios_parte2;

import ejercicio03.Estudiante;
import tp02.ejercicio2.*;
import java.util.Scanner;

public class TestListaEnlazadaGenerica {
	
	public static void main(String[] args) {
		Estudiante unEstudiante;
		String nombre;
		String apellido;
		int comision;
		String email;
		String direccion;
	
		ListaEnlazadaGenerica<Estudiante> unaLista = new ListaEnlazadaGenerica<Estudiante>();
		Scanner s = new Scanner(System.in);
	
		for(int i=0; i<4;i++) {
			System.out.println("Instanciacion estudiante "+ (i+1));
			System.out.println("Nombre: ");
			nombre = s.nextLine();
			System.out.println("Apellido: ");
			apellido = s.nextLine();
			System.out.println("Comision: ");
			comision = s.nextInt();
			s.nextLine();
			System.out.println("Email: ");
			email = s.nextLine();
			System.out.println("Direccion: ");
			direccion = s.nextLine();
			unEstudiante = new Estudiante(nombre, apellido, comision, email, direccion);
			unaLista.agregarFinal(unEstudiante);
		}
		
		System.out.println("Imprimimos los Alumnos Cargados: ");
		unaLista.comenzar();
		while(!unaLista.fin()) {
			System.out.println(unaLista.proximo().tusDatos());
		}
		
		s.close();
	
	}
}
