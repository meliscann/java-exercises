package question2;

public class SumSeries {
	public static void main(String[] args) {
		
		System.out.println("i   m(i)");
		System.out.println("---------------");
		float sum = 0;
		for(int i = 1; i < 21; i++) {
			sum += (i/(i+1f)); 
			// I coded this part as 1/(i+1) first, but I couldn't get the right result. 
			// By doing research on the web, I learned that it should be 1/(i+1f). 
			// I think this situation is called floating-point division.
			System.out.println(i + "    " + sum);
		}
	}
}
 