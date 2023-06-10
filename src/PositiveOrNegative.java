import java.util.Scanner;

//To check whether the given number is Positive or Negative
public class PositiveOrNegative {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n >= 0) {
			System.out.println(n+" is Positive number");
		}
		else {
			System.out.println(n+" is Negative number");
		}
	}

}
