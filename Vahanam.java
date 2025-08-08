package sreehari;
class Vehicle{
	String brand;
	String model;
	Vehicle(String brand, String model){
		this.brand=brand;
		this.model=model;
	}
	public void displayinfo() {

		System.out.println("Brand= "+brand);
		System.out.println("Model= "+model);
	}
}
class Car extends Vehicle{
	String Fueltype;
	Car(String brand, String model, String fueltype){
		super(brand,model);
		this.Fueltype=fueltype;
	}
	public void displayinfo(){
		super.displayinfo();
		System.out.println("Fuel type= "+Fueltype);
	}
}
class Electriccar extends Car{
	double battarycapacity;
	Electriccar(String brand, String model, String fueltype, double battarycapacity){
		super(brand,model,fueltype);
		this.battarycapacity=battarycapacity;
	}
	public void displayinfo(){
		super.displayinfo();
		System.out.println("Battary Capacity= "+battarycapacity);
	}
}
public class Vahanam {

	public static void main(String[] args) {
		Electriccar ele = new Electriccar("xiaomi","XE","Electric", 101.00);
		ele.displayinfo();

	}

}
