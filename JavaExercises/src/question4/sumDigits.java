package question4;

import java.util.Scanner;

public class sumDigits {
	public static int sumDigits(long num) {
		int sum = 0;
		while(num != 0) {
			long digit = num % 10;
			sum += digit;
			num /= 10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // We use Scanner class for the keyboard input.
		System.out.println("Please enter a number:");  
		long num = input.nextInt();  // We get a number input from the user.
		System.out.println("Sum of the digits: " +sumDigits(num));
	}
}
