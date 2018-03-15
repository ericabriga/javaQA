public abstract class Vehicle {

	private int price;
	private String brand;
	private String name;
	private int id;

	public Vehicle(int price, String brand, String name) {
		super();
		this.price = price;
		this.brand = brand;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public int getId() {
		return id;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

}
