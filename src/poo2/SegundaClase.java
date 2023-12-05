package poo2;

import poo2.Persona;

public class SegundaClase {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Juan Perez");
		Alumno alumno1 = new Alumno("Leo","M-4576");
		
		Persona persona2 = new Persona("Jose Martinez");
		
		System.out.println("Alumno: "+alumno1.dameNombre()+" | "+alumno1.getLegajo());
		System.out.println("El nombre de la Persona es: " + persona1.dameNombre());
		
		System.out.println("Bienvenido Alumno de AP 4.0 - 2° Etapa");
		
		NoDocente noDocente1 = new NoDocente("Carolina Rojas",10);
		System.out.println("El/La No Docente: "+noDocente1.dameNombre()+" | "+noDocente1.dameAntiguedad());

	}

}
