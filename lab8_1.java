import java.util.Scanner;
public class lab8_1{
	public static void main(String[] args) {
		float l,w,h;
		byte n;
		int b,s,li,f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details of room:");
		System.out.println("Enter length:");
		l=sc.nextFloat();
		System.out.println("Enter width:");
		w=sc.nextFloat();
		System.out.println("Enter height:");
		h=sc.nextFloat();
		System.out.println("Enter windows:");
		n=sc.nextByte();
		Room r1=new Room(l,w,h,n);
		
		System.out.println("Enter Details of Classroom:");
		System.out.println("Enter length:");
		l=sc.nextFloat();
		System.out.println("Enter width:");
		w=sc.nextFloat();
		System.out.println("Enter height:");
		h=sc.nextFloat();
		System.out.println("Enter windows:");
		n=sc.nextByte();
		System.out.println("Enter benches:");
		b=sc.nextInt();
		System.out.println("Enter seats:");
		s=sc.nextInt();
		System.out.println("Enter lights:");
		li=sc.nextInt();
		System.out.println("Enter fans:");
		f=sc.nextInt();
 		
 		Classroom cr1=new Classroom(l,w,h,n,b,s,li,f);
 		System.out.println("Details of room: ");
 		r1.display();
 		System.out.println("Details of Classroom: ");
 		cr1.display();
	}
}
class Room{
	float length,width,height;
	byte windows;

	Room(float l,float w,float h,byte n){
		length=l;
		width=w;
		height=h;
		windows=n;
	}
	double area(){
		return (length*width);
	}
	void display(){
		System.out.println("Length="+length);
		System.out.println("Width="+width);
		System.out.println("Height="+height);
		System.out.println("Number of windows="+windows);
		System.out.println("Area of room="+area());
	}
}
class Classroom extends Room{
	int bench,seats,light,fan;

	Classroom(float l,float w,float h,byte n,int b,int s,int li,int f){
		super(l,w,h,n);
		bench=b;
		seats=s;
		light=li;
		fan=f;
	}

	void display(){
		super.display();
		System.out.println("Number of benches="+bench);
		System.out.println("Number of seats per bench="+seats);
		System.out.println("Number of lights="+light);
		System.out.println("Number of fans="+fan);
		System.out.println("Total seats in a class="+getSeats());
	}

	int getSeats(){
		return bench*seats;
	}
}