package AssignementFeb14to19;
import java.util.*;

public class TwonumbersAndOnecharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the first number");
		double num1 = sc.nextInt();
		
		System.out.println("Enter the first number");
		double num2 = sc.nextInt();
		
		System.out.println("Enter the charecter");
		char a = sc.next().charAt(0);
		int ascii = a;
		
		System.out.println("Addition "+ (num1+num2+ascii));
		System.out.println("Subtraction "+ (num1+num2-ascii));
		System.out.println("Multiplication "+ ((num1*num2)+ascii));
		
		double result = (num1*num2)/ascii;
		System.out.println("Division "+ result);
	}

}
