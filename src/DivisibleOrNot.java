import java.util.Scanner;

//To check whether the 1st number is divisible by 2nd number or not
public class DivisibleOrNot {

	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		i = sc.nextInt();
		System.out.println("Enter Second number: ");
		j = sc.nextInt();
		
		if(i%j == 0) {
			System.out.println("The 1st number ("+i+") is divisible by the 2nd number ("+j+")");
		}
		else {
			System.out.println("The 1st number ("+i+") is not divisible by the 2nd number ("+j+")");
		}
	}

}
