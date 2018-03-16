
public class Van extends Vehicle {

	private int passengers;

	public Van(int passengers, int price, String brand, String name) {
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
