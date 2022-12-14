/****************************************************************
 * 
 * @author Maheep Singh Bhatia
 * Date: 11/11/2022 [F]
 * 
 */
import java.util.*;
public class Exercise06_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number is " + format(number, width));
		
		input.close();
	}
	
	public static String format(int n, int w) {
		String result = n + "";
		int len = w - result.length();
		for(int i = 0; i < w - len; i++) {
			result = "0" + result;
		}
			return result;
	}
}