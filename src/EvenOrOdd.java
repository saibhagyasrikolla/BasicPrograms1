import java.util.Scanner;
//To Check whether the given number is Even or Odd
public class EvenOrOdd {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n+" is Even number");
		}
		else {
			System.out.println(n+" is Odd number");
		}
	}

}
