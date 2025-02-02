package question1;

import java.util.Scanner;  // We include the Scanner class.

public class CheckPassword {
	
	public static void checkPassword (String password) {
		
		int count = 0;
		for(int j = 0; j < password.length(); j++) {  // we check the number of digits in the password.
			if(password.charAt(j) >= '0' && password.charAt(j) <= '9') {
				count++;
			}
		}
		
		if(password.length() < 8) {  // We check the length of the password.
			System.out.println("Invalid password.");
			return;
		}
		
		for(int i = 0; i < password.length(); i++) {  // We check for valid characters for the password.
			if((password.charAt(i)  >= 'A' || password.charAt(i) <= 'Z' || password.charAt(i) >= '0' || password.charAt(i) <= '9') && count >= 2) {
				System.out.println("Valid password.");
				return;
			}
			else {
				System.out.println("Invalid password."); 
				return;
			}
		}
	}
		
	public static void main (String[] args) {
		System.out.println("Please enter an password.");
		System.out.println("Your password must have at least eight characters.");
		System.out.println("Your password consists of only letters and digits.");
		System.out.println("Your password must contain at least two digits.");

		Scanner input = new Scanner(System.in);  // We use Scanner class for the keyboard input.
		System.out.println("Your password is: ");
		String password = input.nextLine();  // We declare a string for password and use nextLine() method.
		checkPassword(password);  // We call the method.
	}	
}




