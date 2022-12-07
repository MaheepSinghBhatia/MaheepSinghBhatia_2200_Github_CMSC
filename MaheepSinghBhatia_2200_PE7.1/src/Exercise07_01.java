/******************************************************
 * 
 * @author Maheep Singh Bhatia
 * Date: 11/30/2022 [W]
 * Edited: 12/7/2022 [W]
 * 
 */
import java.util.*;
public class Exercise07_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		double[] scores = new double[numberOfStudents];
		double best = 0;
		
		System.out.println("Enter " + numberOfStudents + " scores: ");
		for(int i = 0; i < numberOfStudents; i++) {
			scores[i] = input.nextDouble();
			
			if(scores[i] > best) {
				best = scores[i];
			}
		}
		//System.out.println("The best is " + best );
		char grade;
		
		for(int i = 0; i < numberOfStudents; i++) {
			if(scores[i] >= best - 10) grade = 'A';
			else if(scores[i] >= best - 20) grade = 'B';
			else if(scores[i] >= best - 30) grade = 'C';
			else if(scores[i] >= best - 40) grade = 'D';
			else grade = 'F';
			
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
		}
		input.close();

	}

}
