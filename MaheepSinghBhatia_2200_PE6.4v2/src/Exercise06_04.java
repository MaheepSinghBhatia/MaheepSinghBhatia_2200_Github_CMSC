/********************************************************
 * 
 * @author Maheep Singh Bhatia
 * Date: 11/16/2022 [W]
 * Exercise 6.4 V2 Practice Exam
 */
import java.util.*;
public class Exercise06_04 {

	public static void main(String[] args) {
		System.out.println("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		reverse(number);

		
		input.close();
	}
	
	public static void reverse(int n) {
		if (n == 0) {
			System.out.println("0");
		}
		if (n <= 0) {
			System.out.print(n % 10);
			n = n / -10;
		}
		while(n != 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}
	
}
