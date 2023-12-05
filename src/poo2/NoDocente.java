package poo2;

public class NoDocente extends Persona {
	
	private int antiguedad;
	
	public NoDocente(String nombre, int anioAnt) {
		super(nombre);
		antiguedad = anioAnt;
	}
	
	public int dameAntiguedad() {
		return antiguedad;
	}
}
