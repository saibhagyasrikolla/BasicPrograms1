import java.util.Scanner;

//Absolute Number of a given number
public class AbsoluteNumber {

	public static void main(String[] args) {
		float a;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println(Math.abs(a));
	}

}
