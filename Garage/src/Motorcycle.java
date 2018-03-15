
public class Motorcycle extends Vehicle {

	private int pedals;

	public Motorcycle(int pedals, int price, String brand, String name) {
		super(price, brand, name); // calls the constructor of superclass
		this.pedals = pedals;

	}

	public int getPedals() {
		return pedals;
	}

	public void setPedals(int pedals) {
		this.pedals = pedals;
	}

}
