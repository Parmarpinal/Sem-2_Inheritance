public class Multiple{
	public static void main(String[] args) {
		People p1=new People();
		p1.personDetails();
		p1.studentDetails();
	}
}
interface Person{
	String name = "Pinal";
	int age = 19;

	public void personDetails();
	
} 
interface Student{
	int enrollmentNo = 2201010;
	String branch = "CSE";
	int rollNo = 401;

	public void studentDetails();
	
}
class People implements Person,Student{
	public void personDetails(){
		System.out.println("Name of person = "+name);
		System.out.println("Age = "+age);
	}
	public void studentDetails(){
		System.out.println("Enrollment No = "+enrollmentNo);
		System.out.println("Branch = "+branch);
		System.out.println("Roll No = "+rollNo);
	}
}
