package question6;

import java.util.Scanner;

 public class Partition {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers will you enter?");
		int length = input.nextInt();
		int list[] = new int[length];
		for(int i = 0; i < list.length; i++) {
			System.out.print("Enter numbers for the list:"); 
	         list[i] = input.nextInt(); 
	         System.out.println(list[i]);
		}
	}
}
