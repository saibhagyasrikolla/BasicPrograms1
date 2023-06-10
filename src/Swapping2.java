import java.util.Scanner;

//Swapping of Two numbers without using 3rd variable
public class Swapping2 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter two Numbers:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Before Swapping: "+"a = "+a+" b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping: "+"a = "+a+" b = "+b);
	}

}
