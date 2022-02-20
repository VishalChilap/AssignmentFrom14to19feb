package AssignementFeb14to19;
import java.util.*;

public class HourtoDayandYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the hour");
		
		int hour = sc.nextInt();
		
		double day = 0.0416667*hour;
		System.out.println(day+" Day");

		double year = 0.000114155*hour;
		System.out.println(year+" Year");


	}

}
