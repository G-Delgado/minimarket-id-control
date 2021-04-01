package ui;

import java.util.Scanner;

public class Main {
	
	private Scanner in;
	
	public Main() {
		in = new Scanner(System.in);
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
		
	}
	
	public void listAttempts() {
		
	}
}
