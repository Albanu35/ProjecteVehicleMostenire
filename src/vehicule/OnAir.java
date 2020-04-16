package vehicule;

public class OnAir extends Vehicle{
	protected int noTurbines = 2;
	protected String hasFirstClass;
	
	// constructori

		public OnAir(String serialNumber, int noPerson) {
			super(serialNumber, noPerson);
		}

		public OnAir(String serialNumber, int noPersons, String name) {
			super(serialNumber, noPersons, name);
		}

		public OnAir(String serialNumber, int noPersons, String name, int noTurbines) {
			super(serialNumber, noPersons, name);
			this.noTurbines = noTurbines;
		}

		public OnAir(String serialNumber, int noPersons, String name, int noTurbines, String hasFirstClass) {
			this(serialNumber, noPersons, name, noTurbines);
			this.hasFirstClass = hasFirstClass;
		}
		
		// metoda de deplasare goTo clasa OnWater
		public boolean goTo(double positionX, double positionY) {
			System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "]");
			super.goTo(positionX, positionY);
			return true;
		}
		// metoda de alimentare addFuel clasa OnWater
		public boolean addFuel(double amount) {
			System.out.println("Adding " + amount + " l of fuel to the airplane");
			super.addFuel(amount);
			return true;
		}
		// metoda de print
		public void printInfo() {
			System.out.println(" Vehicle properties: " 
								+ " \n\t - serial number: " + this.serialNumber
								+ " \n\t - capacity: " + this.noPerson + " persons" 
								+ " \n\t - name: " + this.name
								+ " \n Airplane properties:" 
								+ " \n\t - number of turbines: " + this.noTurbines 
								+ " \n\t -"  + this.hasFirstClass);
		}
}
