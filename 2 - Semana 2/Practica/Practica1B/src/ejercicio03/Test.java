package ejercicio03;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// vectores
		Estudiante[] arregloEstudiante = new Estudiante[2];
		Profesor[] arregloProfesor = new Profesor[3];
		// para instanciar los objetos
		String unNombre;
		String unApellido;
		String unEmail;
		int unaComision;
		int unaCatedra;
		String unaFacultad;
		String unaDireccion;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Inicia la carga de estudiantes: ");
		for(int i=0;i<2;i++) {
			System.out.println("Carga del estudiante "+(i+1));
			System.out.println("Nombre: "); 
			unNombre = s.nextLine();
			System.out.println("Apellido: ");
			unApellido = s.nextLine();
			System.out.println("Email: ");
			unEmail = s.nextLine();
			System.out.println("Direccion: ");
			unaDireccion = s.nextLine();
			System.out.println("Comision: ");
			unaComision = s.nextInt();
			//ya que despues de nextInt, el cursor queda parado en line 34, debo hacer un nuevo nextline para evitar leer el salto de linea.
			s.nextLine(); 
			arregloEstudiante[i] = new Estudiante();
			
			//Segun lo pide el enunciado, cargamos las variables de instancia mediante los setters
			arregloEstudiante[i].setApellido(unApellido);
			arregloEstudiante[i].setNombre(unNombre);
			arregloEstudiante[i].setComision(unaComision);
			arregloEstudiante[i].setDireccion(unaDireccion);
			arregloEstudiante[i].setEmail(unEmail);
			
		}
		
		System.out.println("Inicia la carga de Profesores: ");
		for(int i=0;i<3;i++) {
			System.out.println("Carga del Profesor "+(i+1));
			System.out.println("Nombre: "); 
			unNombre = s.nextLine();
			System.out.println("Apellido: ");
			unApellido = s.nextLine();
			System.out.println("Email: ");
			unEmail = s.nextLine();
			System.out.println("Facultad: ");
			unaFacultad = s.nextLine();		
			System.out.println("Catedra: ");
			unaCatedra = s.nextInt();
			//ya que despues de nextInt, el cursor queda parado en line 60, debo hacer un nuevo nextline para evitar leer el salto de linea.
			s.nextLine();
			arregloProfesor[i] = new Profesor();
			
			//Segun lo pide el enunciado, cargamos las variables de instancia mediante los setters
			arregloProfesor[i].setApellido(unApellido);
			arregloProfesor[i].setNombre(unNombre);
			arregloProfesor[i].setCatedra(unaCatedra);
			arregloProfesor[i].setFacultad(unaFacultad);
			arregloProfesor[i].setEmail(unEmail);
			
		}
		
		// TODO recorra ambos arreglos imprimiendo los valores obtenidos mediante el método tusDatos()
		
		System.out.println("Imprimimos los datos de estudiantes: ");
		for(int i=0; i<2;i++) {
			System.out.println(arregloEstudiante[i].tusDatos());
		}
		System.out.println("Imprimimos los datos de profesores: ");
		for(int i=0; i<3; i++) {
			System.out.println(arregloProfesor[i].tusDatos());
		}
		
		s.close();
		
	}

}
