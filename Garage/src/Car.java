
public class Car extends Vehicle {

	private int wheels;

	public Car(int wheels, int price, String brand, String name) {
		super(price, brand, name); // calls the constructor of superclass
		this.wheels = wheels;

	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

}
