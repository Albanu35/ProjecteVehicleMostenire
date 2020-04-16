package vehicule;

public class OnRoad extends Vehicle {
	private int noWheels = 4;
	private int noDoors = 4;

	// constructorii clasei

	public OnRoad(String serialNumber, int noPerson) {
		super(serialNumber, noPerson);
	}

	public OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}

	public OnRoad(String serialNumber, int noPersons, String name, int noWheels) {
		super(serialNumber, noPersons, name);
		this.noWheels = noWheels;
	}

	public OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors) {
		this(serialNumber, noPersons, name, noWheels);
		this.noDoors = noDoors;
	}

	// metodele clasei
	// metoda suprascrisa goTo
	@Override
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Driving the vehicle on road to coordinates: [" + positionX + ", " + positionY + "]");
		super.goTo(positionX, positionY);
		return true;
	}
	
	// metoda addFuel supraincarcata
	@Override
	public boolean addFuel(double amount) {
	
		System.out.println("Adding " + amount + " l of fuel to the driving vehicle");
		super.addFuel(amount);
		return true;
	}
	//metoda de printare
	public void printInfo() {
		System.out.println(" Vehicle properties: "
				+ " \n\t - serial number: " + this.serialNumber 
				+ " \n\t - capacity: " + this.noPerson + " persons" 
				+ " \n\t - name: " + this.name
				+ " \n Driving vehicle properties:"
				+ " \n\t - number of wheels: " + this.noWheels
				+ " \n\t - number of doors: " + this.noDoors);
	}

}
