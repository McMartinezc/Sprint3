package n3ex1;

public class FrenarCommand implements Command {

	private Vehicle tipusVehicle;

	public FrenarCommand(Vehicle tipusVehicle) {
		this.tipusVehicle = tipusVehicle;
	}

	@Override
	public void ejecutar() {
		this.tipusVehicle.frenar();

	}

}
