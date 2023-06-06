import java.util.Scanner;
public class lab8_1_2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter details of person:");
		Person p1=new Person();
		p1.getDetails();

		System.out.println("Enter details of employee");
		Employee e1=new Employee();
		e1.getDetails();

		System.out.println("Enter number of teacher:");
		int n=sc.nextInt();
		Teacher[] t = new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter details of teacher "+(i+1)+" : ");
			t[i]=new Teacher();
			t[i].getDetails();
		}

		System.out.println("==========Details of person=========");
		p1.display();
		System.out.println("==========Details of employee=========");
		e1.display();
		for(int i=0;i<n;i++){
			System.out.println("===========Details of teacher "+(i+1)+"  =========== ");
			t[i].display();
		}
	}
}
class Person{
	int pID;
	String name;
	int age;

	void getDetails(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person ID:");
		pID=sc.nextInt();
		System.out.println("Enter name:");
		name=sc.next();
		System.out.println("Enter age:");
		age=sc.nextInt();
	}

	void display(){
		System.out.println("Person ID= "+pID);
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
}
class Employee extends Person{
	int eID;
	long salary;
	String designation;

	void getDetails(){
		super.getDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee ID:");
		eID=sc.nextInt();
		System.out.println("Enter salary:");
		salary=sc.nextLong();
		System.out.println("Enter designation:");
		designation=sc.next();
	}

	void display(){
		super.display();
		System.out.println("Employee ID= "+eID);
		System.out.println("Salary= "+salary);
		System.out.println("Designation= "+designation);
	}
}
class Teacher extends Employee{
	int tID;
	String subject;
	int experience;

	void getDetails(){
		super.getDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter teacher ID:");
		tID=sc.nextInt();
		System.out.println("Enter Subject:");
		subject=sc.next();
		System.out.println("Enter experience:");
		experience=sc.nextInt();
	}

	void display(){
		super.display();
		System.out.println("Teacher ID= "+tID);
		System.out.println("Subject= "+subject);
		System.out.println("Experience= "+experience);
	}
}