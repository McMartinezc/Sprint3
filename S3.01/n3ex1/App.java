package n3ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		// Declarem variables
		int opcions;
		String tipusVehicle;
		Vehicle vehicle;
		GestioCommand gestioCommand = new GestioCommand();

		tipusVehicle = introInfo("Selecciona tipus de vehicle: cotxe, bicicleta, vaixell, avio");
		vehicle = seleccioVehicle(tipusVehicle);

		Command arrencar = new ArrencarCommand(vehicle); // Creem les comandes que volem executar
		Command frenar = new FrenarCommand(vehicle);
		Command accelerar = new AccelerarCommand(vehicle);

		gestioCommand.addCommand(accelerar);
		gestioCommand.addCommand(frenar);
		gestioCommand.addCommand(arrencar);

		gestioCommand.llistaCommands();

	}

	// Metode selecció de vehicle i crea objecte en concret
	static Vehicle seleccioVehicle(String tipusVehicle) {
		Vehicle vehicle = null;
		switch (tipusVehicle) {
		case "cotxe": // tipus Cotxe
			vehicle = new Cotxe();
			break;
		case "vaixell": // tipus vaixell
			vehicle = new Vaixell();
			break;
		case "bicicleta": // tipus bicicleta
			vehicle = new Bicicleta();
			break;
		case "avio":
			vehicle = new Avio();
			break;
		}
		return vehicle;
	}

	////// ENTRADA DE DATOS

	// Metodes introduïr informació
	static String introInfo(String missatge) {
		Scanner input = new Scanner(System.in);
		System.out.println(missatge);
		return input.nextLine();// Retorna String
	}

}