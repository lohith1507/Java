//import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		d1.name = "Rama";
		d1.age = 50.2f;
		
		Doctor d2 = new Doctor();
		d2.name = "Sita";
		d2.age = 48.6f;
		
		
	
		if(d1.age>d2.age) {
			System.out.print(d1.name);
		}
		else {
			System.out.print(d2.name);
		}
		
		
//		
////		
//		Patient p1 = new Patient();
//		p1.name  = "Patient1";
////		p1.address = "Chennai";
//		p1.age = 52.3f;
//		
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter doctor's name :");
//		d1.name=sc.nextLine();
//		System.out.println("Enter doctor's age :");
//		d1.age = sc.nextFloat();
//		
//		
//		System.out.println("Doctors Name is :" + d1.name);
//		System.out.println("Doctors Age is :" + d1.age);
//		
//		//demo method invocation
//		d1.ExaminePatient();
//		d1.surgery();
//		
//		
//		System.out.println(p1.toString());
//		p1.takeMadicine();
//		p1.Prescription();
		
		
				
//		sc.close();

	}

}
