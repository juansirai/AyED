package ejercicio03;

public class Estudiante {
	private String nombre;
	private String apellido;
	private int comision;
	private String email;
	private String direccion;
	
	// constructores
	
	public Estudiante(String nombre, String apellido, int comision, String email, String dir) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.comision = comision;
		this.email = email;
		this.direccion = dir;
	}
	
	public Estudiante() {
		
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// TODO Agregue un método de instancia llamado tusDatos()  que retorne un String con los datos de los atributos de las mismas
	
	public String tusDatos() {
		
		return("Nombre: "+this.getNombre()+ " Apellido: "+this.getApellido()+" Email: "+this.getEmail()+ " Comision: "+this.getComision()+
				" Dirección: "+ this.getDireccion());
	}

}
