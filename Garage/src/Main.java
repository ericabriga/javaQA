
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage garage = new Garage();
		//garage.fix("Car");

		Car car = new Car(4, 1000, "Ford", "T1");
		Van van = new Van(6, 3000, "Ford", "Transit");
		Motorcycle motorcycle = new Motorcycle(2, 500, "Kavasaki","Monster");
		
		garage.addVehicle(car);
	
		garage.addVehicle(van);
		garage.bill();
		
		garage.addVehicle(motorcycle);
		//garage.bill();

		
		car.getWheels();
		System.out.println(car.getWheels());
	}

	

}
