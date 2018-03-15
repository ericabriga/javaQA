import java.util.ArrayList;

public class Garage {

	int carBill = 0;
	int vanBill = 0;
	int motorcycleBill = 0;
	
	
	
	public int getCarBill() {
		return carBill;
	}

	public void setCarBill(int carBill) {
		this.carBill = carBill;
	}

	public int getVanBill() {
		return vanBill;
	}

	public void setVanBill(int vanBill) {
		this.vanBill = vanBill;
	}

	public int getMotorbikeBill() {
		return motorcycleBill;
	}

	public void setMotorbikeBill(int motorbikeBill) {
		this.motorcycleBill = motorbikeBill;
	}

	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	int id = 0;

	public void addVehicle(Vehicle vehicle) {

		vehicle.setId(id);
		id++;

		vehicleList.add(vehicle);
	}

	public ArrayList<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void removeVehicleId(int id) {
		for (int i = 0; i < vehicleList.size(); i++) {
			if (id == vehicleList.get(i).getId()) {
				vehicleList.remove(i);
			}
		}
	}

	public void removeVehicleType(String type) {
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < vehicleList.size(); i++) {
			if (type == vehicleList.get(i).getClass().toString()) {
				intList.add(i);
			}
		}

		for (int i = 0; i < intList.size(); i++) {
			vehicleList.remove(intList.get(i) - i);
		}

	}

	// fix
	public void fix (int carBill, int vanBill, int motorbikeBill) {
		for (int i = 0; i < this.vehicleList.size(); i++) {
			if (type == vehicleList.get(i).getClass().toString()) {
				System.out.println("The bill for car is equal to + carBill");
				System.out.println("The bill for van is equal to + vanBill");
				System.out.println("The bill for motorcycle is equal to + motorcycleBill");
		
			}
		}

	// empty
	public void emptyGarage(String type) {
			vehicleList.clear();
		}

	}
}