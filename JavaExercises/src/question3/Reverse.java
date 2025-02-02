package question3;

import java.util.Scanner;  // We include the Scanner class.

public class Reverse {
	public static void reverse(int num) {
		int reversed = 0;
		while(num != 0) {
			int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
		}
		System.out.println("Reversed number: " +reversed);	
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // We use Scanner class for the keyboard input.
		System.out.println("Please enter a number:");  
		int num = input.nextInt();  // We get an integer input from the user.
		reverse(num);  // We call the reverse method.
	}
}
