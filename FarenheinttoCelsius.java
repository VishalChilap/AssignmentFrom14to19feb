package AssignementFeb14to19;
import java.util.*;

public class FarenheinttoCelsius {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the fahrenheit tempreture");
		
		double f = sc.nextInt();
		double result1 = (f-32)*5/9;
		
		System.out.println(result1);
	}

}
