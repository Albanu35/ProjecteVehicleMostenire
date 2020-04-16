package vehicule;

public class OnWater extends Vehicle {
	protected int noEngines = 2;
	protected double cargoCapacity;

// constructori

	public OnWater(String serialNumber, int noPerson) {
		super(serialNumber, noPerson);
	}

	public OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines) {
		super(serialNumber, noPersons, name);
		this.noEngines = noEngines;
	}

	public OnWater(String serialNumber, int noPersons, String name, int noEngines, double cargoCapacity) {
		this(serialNumber, noPersons, name, noEngines);
		this.cargoCapacity = cargoCapacity;
	}

	// metoda de deplasare goTo clasa OnWater
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Sailing the vessel to coordinates: [" + positionX + ", " + positionY + "]");
		super.goTo(positionX, positionY);
		return true;
	}

	// metoda de alimentare addFuel clasa OnWater
	public boolean addFuel(double amount) {
		System.out.println("Adding " + amount + " l of fuel to the vessel");
		super.addFuel(amount);
		return true;
	}

	// metoda de print
	public void printInfo() {
		System.out.println(" Vehicle properties: " 
							+ " \n\t - serial number: " + this.serialNumber
							+ " \n\t - capacity: " + this.noPerson + " persons" 
							+ " \n\t - name: " + this.name
							+ " \n Vessel properties:" 
							+ " \n\t - number of engines: " + this.noEngines 
							+ " \n\t - cargo capacity: " + this.cargoCapacity);
	}
}
