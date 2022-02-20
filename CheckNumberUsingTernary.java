package AssignementFeb14to19;
import java.util.*;
public class CheckNumberUsingTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int result = (a==10)? a : ((a==20)? a : ((a==30)? a : ((a==40)? a :50)));
		System.out.println(result);

	}

}
