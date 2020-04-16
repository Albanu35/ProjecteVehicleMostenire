package nature;

public class Terrestrial extends Animal {
	private int legs;
	private int eyes;

	public Terrestrial(boolean carnivore, int weight, int size, String species) {
		// apeleaza cosntructorul din clasa Animal cu parametrii aferenti
		super(carnivore, weight, size, species);
	}

	public Terrestrial(boolean carnivore, int weight, int size, String species, int legs, int eyes) {
		super(carnivore, weight, size, species);
		this.legs = legs;
		this.eyes = eyes;
	}

	public void fight() {
		System.out.println("The terrestrial animal is now fighting!!");
	}

	// metoda suprascrisa descriptio()
	@Override
	public void description() {
		System.out.println("The Terrestrial animal has: " + this.legs + " legs and " + this.eyes + " eyes");
		super.description();
	}

	public void move(int distance) {
		System.out.println("This is Terrestrial species.");
		super.move(distance);
	}

}
