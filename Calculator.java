import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		
		double res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		double a = sc.nextDouble();
		
		System.out.println("Choose any of the operator (+, -, *, /, % )");
		char op = sc.next().charAt(0); 
		
		System.out.println("Enter Second Number");
		double b = sc.nextDouble();
		
		
		switch(op) {
		case '+' : 
			res = a+b;
			System.out.println("A + B = " + res);
			break;
			
		case '-' : 
			res = a-b;
			System.out.println("A - B = " + res);
			break;
			
		case '*' : 
			res = a*b;
			System.out.println("A * B = " + res);
			break;
			
		case '/' : 
			res = a/b;
			System.out.println("A / B = " + res);
			break;
			
		case '%' : 
			res = a%b;
			System.out.println("A % B = " + res);
			break;	
				
		}
		

	}

}
