package vehicule;

public class Main {

	public static void main(String[] args) {
		// cream obiectul tip Vehicle
		Vehicle vehicle = new Vehicle("3FDS9DFF8FSD7", 4, "Ford");

		// Clasa Vehicle
		// metoda getter pentru serialNumber
		System.out.println("Serial Number a vehicolului este: " + vehicle.getSerialNumber());

		// metoda de deplasare goTo
		vehicle.goTo(2, 5);
		
		// metoda addFuel Clasa Vehicle
				vehicle.addFuel(200);

		// metoda de printare Vehicle
		vehicle.printInfo();

		// cream obiectul clasei copil OnRoad
		OnRoad auto = new OnRoad("3FDS9DFF8FSAU1", 5, "VW", 4, 3);

		// metoda goTo pt OnRoad
		auto.goTo(5, 12);

		// metoda addFuel supraincarcata Clasa OnRoad
		auto.addFuel(275);

		// metoda de print clasa OnRoad
		System.out.println();
		auto.printInfo();

		// cream un obiect in clasa copil OnWater
		OnWater salupa = new OnWater("F8GFDG86D87GGD", 15, "ReginaMarii", 4, 3000);

		// metoda goTo pt OnWater
		salupa.goTo(20, 35);

		// metoda addFuel supraincarcata OnWater
		salupa.addFuel(1050);

		// metoda de print OnWater
		System.out.println();
		salupa.printInfo();

//Cream obiectul OnAir
		OnAir avion = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, "has first class");

		// metoda goTo pt OnAir
		avion.goTo(35, 35);

		// metoda addFuel supraincarcata OnAir
		avion.addFuel(3000);

		// metoda de print OnAir
		System.out.println();
		avion.printInfo();

	}
}
