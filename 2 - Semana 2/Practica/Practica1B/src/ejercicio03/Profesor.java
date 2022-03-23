package ejercicio03;

public class Profesor {
	private String nombre;
	private String apellido;
	private String email;
	private int catedra;
	private String facultad;
	
	
	public Profesor(String nombre, String apellido, String email, int catedra, String facultad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.catedra = catedra;
		this.facultad = facultad;
	}
	
	public Profesor() {
	}
	
	public String getApellido() {
		return apellido;
	}
	public int getCatedra() {
		return catedra;
	}
	public String getEmail() {
		return email;
	}
	public String getFacultad() {
		return facultad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCatedra(int catedra) {
		this.catedra = catedra;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// TODO Agregue un método de instancia llamado tusDatos()  que retorne un String con los datos de los atributos de las mismas
	
	public String tusDatos() {
		
		return("Nombre: " + this.getNombre() + " Apellido: " + this.getApellido()+" Catedra: "+ this.getCatedra() +
				" Email: "+this.getEmail()+ " Facultad: "+this.getFacultad());
	}

}
