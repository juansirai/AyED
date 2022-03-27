package ej1;

public class Estudiante {
	private String nombre;
	private String direccion;
	private String comision;
	private String apellido;
	private String email;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public String getComision() {
		return comision;
	}
	
	public void setComision(String comision) {
		this.comision = comision;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String  getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void tusDatos() {
		System.out.println( "Estudiante nombre=" + getNombre() + " Apellido= "+ getApellido());
	}
	

	
	

}
