package poo2;

public class Alumno extends Persona {

	private String legajo;
	
	public Alumno(String nombre, String legajo) {
		super(nombre);
		this.legajo = legajo;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
	
}
