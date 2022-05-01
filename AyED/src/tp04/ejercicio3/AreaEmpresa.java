package tp04.ejercicio3;

public class AreaEmpresa {
	private String id;
	private int tardanza;
	
	public AreaEmpresa() {}
	public AreaEmpresa(String id, int tardanza) {
		this.id = id;
		this.tardanza = tardanza;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setTardanza(int tardanza) {
		this.tardanza = tardanza;
	}
	public int getTardanza() {
		return this.tardanza;
	}
}
