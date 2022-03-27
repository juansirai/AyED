package ej1;

public class Test {

	public static void main(String[] args) {

		Estudiante[] estudiante1 = new Estudiante[2];
		Profesor[] profe1 = new Profesor[3];
	//	estudiante1[0]= new Estudiante();
	//	estudiante1[1]= new Estudiante();
		
		for(int i=0; i < estudiante1.length;i++) {
			estudiante1[i]= new Estudiante();
		}
		
		
		estudiante1[0].setNombre("Juan");
		estudiante1[0].setApellido("Perez");
		estudiante1[1].setNombre("Martin");
		estudiante1[1].setApellido("Guzman");
		
		for(Estudiante est: estudiante1) {
		  est.tusDatos();
		}
		
		for(int i=0; i< profe1.length;i++)
		profe1[i]= new Profesor();	
		
				
		profe1[0].setNombre("Mario");
		profe1[0].setApellido("Gonzalez");
		profe1[1].setNombre("Pepe");
		profe1[1].setApellido("Garcia");
		profe1[2].setNombre("Eustaquio ");
		profe1[2].setApellido("Ferreyra");
		
		
		for(Profesor profe: profe1) {
		 profe.tusDatos();
		}

	}

}
