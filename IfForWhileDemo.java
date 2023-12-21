import java.util.Scanner;

public class IfForWhileDemo {

	public static void main(String[] args) {
		int x =10;
		float y= 5.6f;
		
		//Logic demo
		if(x<y) {
			System.out.println(x + " is lesser than " + y);
		}else {
			System.out.println(x + " is greater than " + y);
		}
		
		//Looping Demo
		for(int i=0;i<5;i++) {
			System.out.println("i = " + i);
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		//Looping demo with break
		System.out.println("\n Looping demo with break");
		for (int i = 0; i < 50; i++) {

			System.out.println("Enter some number :");
			int n = sc.nextInt();
			if (n == 7)
				break;

			System.out.println("i=" + i);
		}

		
		//Looping Demo with Continue
		for(int i=0; i< 10 ;i++) {
			System.out.println("Hello i = " + i);
			
			if(i % 2 == 0)
				continue;
			System.out.println("bye i = " + i);
		}
		
		
		//Looping Switch Case Demo 
		System.out.println("\n \n  Switch case demo");
		int k=5;
		switch(k) {
		case 1:System.out.println(" executing  case 1 " ); break;
		case 3:System.out.println(" executing  case 3 " ); break;
		case 4:
			System.out.println(" executing  case 4 "); break;	
		default: System.out.println(" executing  default case " );
		}

		System.out.println("DONE");
		
		
	}

}
