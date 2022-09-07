package n3ex1;

import java.util.ArrayList;
import java.util.List;

public class GestioCommand { // Invoca el command

	private List<Command> llistaCommand = new ArrayList<Command>();

	public void addCommand(Command command) {
		llistaCommand.add(command);
	}

	public void llistaCommands() {
		for (Command command : llistaCommand) {
			command.ejecutar();
		}
	}

}
