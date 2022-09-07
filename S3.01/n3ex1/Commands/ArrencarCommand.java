package n3ex1;

public class ArrencarCommand implements Command {

	private Vehicle tipusVehicle;

	public ArrencarCommand(Vehicle tipusVehicle) {
		this.tipusVehicle = tipusVehicle;
	}

	@Override
	public void ejecutar() {
		this.tipusVehicle.arrencar();

	}

}
