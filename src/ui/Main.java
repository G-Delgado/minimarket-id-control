package ui;

import java.util.Scanner;

import exceptions.NotOfLegalAgeException;
import exceptions.NotTheDayToGoOutException;
import model.Minimarket;

public class Main {
	
	private Scanner in;
	private Minimarket mm;
	
	public Main() {
		in = new Scanner(System.in);
		mm = new Minimarket();
	}
	
	public static void main(String args[]) {
		Main ppal = new Main();
		int option = 1;
		while (option != 0) {
			System.out.println("M I  B A R R I O  T E  Q U I E R E\n" +
					"(1) Permitir ingreso\n" +
					"(2) Consultar las personas que han intentado ingresar\n" +
					"(0) Para salir\n" );
			option = ppal.in.nextInt(); // Watch this.
			ppal.in.nextLine(); // WATCH THISSSSS ----------
			
			ppal.executeProgram(option);
		}
	}
	
	public void executeProgram(int opt) {
		switch (opt) {
			case 1:
				allowEntrance();
				break;
			case 2:
				listAttempts();
				break;
			case 0:
				System.out.println("\nSaliendo...");
				break;
		}
	}
	
	public void allowEntrance() {
		String id = "";
		String idType = "";
		System.out.println("\nIngresa tu tipo de documento entre:\n" +
							"- TI (Tarjeta de identidad)\n" +
							"- CC (Cedula de ciudadania)\n" +
							"- PP (Pasaporte)\n" +
							"- CE (Cedula de extranjeria)\n");
		idType = in.nextLine();
		idType = idType.replaceAll(" ", "").toUpperCase();
		System.out.println("Ingresa tu documento (Ej. 12123910)\n");
		id = in.nextLine();
		
		// Tengo queb hacer un try catch en alguna parte uwu
		// Con las exception que creemos
		// Podríamos hacerlo en el model
		//mm.increaseAttempt();
		try {
			mm.addAllowed(idType, id);
		} catch (NotOfLegalAgeException | NotTheDayToGoOutException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
	public void listAttempts() {
		System.out.println("\nEl numero de intentos de registro es: " + mm.getAttempt() + "\n");
	}
}
