package n1ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//Declaració de variables
		int opcions;
		String comanda = null;
		Undo comanda1 = Undo.getSingletonInstance(comanda); //Instanciem desde el getSingletonInstance ja que el constructor es privat i no podem fer un new
		
		do {

			opcions = menuEntrada();

			if (opcions == 1) { // Sortir programa
				System.out.println("Has sortit del programa.");

			} else {

				switch (opcions) {

				case 2:// Afegir 
					comanda = introInfo("Introdueix comanda: ");
					comanda1.afegir(comanda);
					break;
				case 3: //Eliminar
					comanda = introInfo("Introdueix comanda que vols eliminar: ");
					comanda1.eliminar(comanda);
					break;

				case 4: //Imprimir llista
					comanda1.imprimirLlista();
					comanda1.toString();
					break;
				}
			}

		} while (opcions != 1);
	    
	   }
	

	// Metode menu info entrada
	static int menuEntrada() {
		int opcions = introInfoInt("Escull:\n1.Sortir de l'aplicació" + "\n2.Afegir"
				+ "\n3.Eliminar"+ "\n4.Imprimir llistat");
		return opcions;
	}

	////// ENTRADA DE DATOS

	// Metodes introduïr informació
	static String introInfo(String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		return input.nextLine();// Retorna String
	}

	static int introInfoInt(String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		return input.nextInt();// Retorna Int
	}
}

