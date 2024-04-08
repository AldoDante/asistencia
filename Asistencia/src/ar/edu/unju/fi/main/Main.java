package ar.edu.unju.fi.main;


import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		
		
		
		Alumno alumno = new Alumno();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el Legajo: ");
		Integer legajo = scanner.nextInt();
		
		System.out.println("Ingrese el apellido: ");
		String apellido = scanner.next();
		
		System.out.println("Ingrese el nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		int numMaterias =1;
		
		while (numMaterias <=4) {
			
			System.out.println("Ingrese el Codigo de la Materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el Nombre de la Materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el Codigo del regisrto de Nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota Final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}

	}

}
