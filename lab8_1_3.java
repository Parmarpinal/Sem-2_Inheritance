import java.util.Scanner;
public class lab8_1_3{
	public static void main(String[] args) {
		System.out.println("Enter details of Car: ");
		Car c=new Car();
		c.getDetails();

		System.out.println("Enter details of Bike: ");
		Bike b=new Bike();
		b.getDetails();

		System.out.println("==============Details of Bike============== ");
		b.display();
		System.out.println("==============Details of Car============== ");
		c.display();
	}
}
class Vehicle{
	String company;
	double price;

	void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle company: ");
		company=sc.next();
		System.out.println("Enter vehicle price: ");
		price=sc.nextDouble();
	}

	void display(){
		System.out.println("Vehicle company: "+company);
		System.out.println("Vehicle price: "+price);
	}
}
class Car extends Vehicle{
	int noOfAirbags;

	void getDetails(){
		super.getDetails();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter number of airbags: ");
		noOfAirbags=sc.nextInt();
	}

	void display(){
		super.display();
		System.out.println("Number of airbags: "+noOfAirbags);
	}
}
class Bike extends Vehicle{
	String moped;

	void getDetails(){
		super.getDetails();
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter bike moped or not: ");
		moped=sc.next();
	}

	void display(){
		super.display();
		System.out.println("Bike is : "+moped);
	}
}
