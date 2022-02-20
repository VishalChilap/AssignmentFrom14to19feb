package AssignementFeb14to19;
import java.util.*;

public class InchestoMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number in inches");
		
		int inch = sc.nextInt();
		double meter = 0.0508*inch;
		
		System.out.println(meter);

	}

}
