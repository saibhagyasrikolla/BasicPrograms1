import java.util.Scanner;

//Swapping of Two numbers
public class Swapping1 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Numbers:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping: "+"a = "+a+" b = "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping: "+"a = "+a+" b = "+b);
	}
}
