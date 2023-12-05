package poo2;

public class Persona {

	private String nombre;
	
	public Persona(String nombre){
		this.nombre = nombre;
	}
	//Sobrecarga de metodo constructor
	public Persona() {
		nombre = "PERSONA NN";
	}
	
	public String dameNombre(){
		return nombre;
	}
}
