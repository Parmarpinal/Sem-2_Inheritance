import java.util.Scanner;
public class Shape3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side:");
		float side=sc.nextFloat();
		Square s=new Square(side);
		s.displaySqrArea();

		System.out.println("Enter radius:");
		float r=sc.nextFloat();
		Circle c=new Circle(r);
		c.displayCirArea();

		System.out.println("Enter 3 side:");
		float x=sc.nextFloat();
		float y=sc.nextFloat();
		float z=sc.nextFloat();
		Triangle t=new Triangle(x,y,z);
		t.displayTriArea();
	}
}
class Shape{
	float side;
	float radius;
	float x,y,z;
}
class Square extends Shape{
	Square(float side){
		this.side=side;
	}
	void displaySqrArea(){
		System.out.println("Area of Square="+(side*side));
	}
}
class Circle extends Shape{
	Circle(float radius){
		this.radius=radius;
	}
	void displayCirArea(){
		System.out.println("Area of Circle="+(Math.PI*radius*radius));
	}
}
class Triangle extends Shape{
	Triangle(float x,float y,float z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void displayTriArea(){
		float s;
		s=(x+y+z)/2f;
		double ans;
		ans=Math.sqrt(s*(s-x)*(s-y)*(s-z));
		System.out.println("Area of Triangle="+ans);
	}
}