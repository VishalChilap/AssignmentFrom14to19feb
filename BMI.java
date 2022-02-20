package AssignementFeb14to19;
import java.util.*;

public class BMI {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the weight in kg");
		double w = sc.nextDouble();
		
		System.out.println("Enter the hright in meter");
		double h = sc.nextDouble();
		
		double result = w/(h*h);
		System.out.println("The body mass index is "+result);

	}

}
