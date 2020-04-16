package vehicule;

public class Vehicle {
	protected final String serialNumber;
	protected int noPerson;
	protected String name;

	//2 constructori pentru clasa
	public Vehicle (String serialNumber, int noPerson) {
	this.serialNumber = serialNumber;
	this.noPerson = noPerson;
	}
	public Vehicle (String serialNumber, int noPerson, String name) {
	this(serialNumber, noPerson);
	this.name = name;
	}
	// getter pentru serialNumber
	public String getSerialNumber() {
		return this.serialNumber;
	}
	//metoda de addFuel
	public boolean addFuel(double amount) {
		System.out.println("Error: unknown type of vehicle…");
		return false;
	}
	// metoda de deplasare
	public boolean goTo(double positionX, double positionY) {
		System.out.println("Error: unknown vehicle cannot move…");
		return false;
	}
	public void printInfo() {
		System.out.println(" Vehicle properties: "
				+ " \n\t - serial number: " + this.serialNumber 
				+ " \n\t - capacity: " + this.noPerson + " persons" 
				+ " \n\t - name: " + this.name);
	}

}
