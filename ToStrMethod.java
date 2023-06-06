public class ToStrMethod{
	public static void main(String[] args){
		Car c = new Car();
		System.out.println(c);
	}
}

class Vehicle{
	String name;
	String color;
	int price;
    
    Vehicle(){
		System.out.println("Vehicle default constructor");
		name="Audi";
		color="blue";
	}
	public String toString(){
		return (name +"-"+ color);
	}
}
class Car extends Vehicle{
	Car(){
		System.out.println("Car default constructor");
	}
}