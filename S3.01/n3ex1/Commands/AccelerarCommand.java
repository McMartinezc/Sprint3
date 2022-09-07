package n3ex1;

public class AccelerarCommand implements Command {

	private Vehicle tipusVehicle;

	public AccelerarCommand(Vehicle tipusVehicle) {
		this.tipusVehicle = tipusVehicle;
	}

	@Override
	public void ejecutar() {
		this.tipusVehicle.accelerar();

	}

}
