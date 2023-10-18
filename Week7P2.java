import java.util.Scanner;

public class Week7P2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1, num2, gcd = 1;

		do {
			System.out.print("Input number 1: ");
			num1 = in.nextInt();
			if (num1 < 0 || num1 > 1000) {
				System.out.println("Please pick a number between 0-1000");
			}
		} while(num1 < 0 || num1 > 1000);
		
		do {
			System.out.print("Input number 2: ");
			num2 = in.nextInt();
			if (num2 < 0 || num2 > 1000) {
				System.out.println("Please pick a number between 0-1000");
			}
		} while(num2 < 0 || num2 > 1000);
		
		int smaller = Math.min(num1, num2);
		
        for (int i = 2; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
		
		System.out.print("GCD(" + num1 + "," + num2 + ") = " + gcd);
		in.close();
	}
}
