//create an array of integers, get total sum and avg of input.
package practice;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
        int total = 0;
        double avg;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        
        avg = (double) total / arr.length;
        
        System.out.println("Total is " + total);
        System.out.println("Average is " + avg);

	}
}
