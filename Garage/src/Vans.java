
public class Vans extends Vehicle {

	private int passengers;

	public Vans(int passengers, int price, String brand, String name) {
		super(price, brand, name); // calls the constructor of superclass
		this.passengers = passengers;

	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassenger(int pedals) {
		this.passengers = pedals;
	}

}
