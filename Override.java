public class Override{
	public static void main(String[] args){
		Bike b1 = new Bike();
		b1.start();
		Car c1=new Car();
		c1.start();
	}
}
class Vehicle{
	void start(){
		System.out.println("Vehicle started");
	}
}
class Bike extends Vehicle{
	void start(){
		System.out.println("Bike started");
	}
}
class Car extends Vehicle{
	void start(){
		System.out.println("Car started");
	}
}