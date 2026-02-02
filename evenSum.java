package unit1;

import java.util.Scanner;

public class staticDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0;

        // Print even numbers
        System.out.println("Even sum");
        for (int num : arr) {
            if (num % 2 == 0) {
                sum+=num;
            }
        }

        System.out.println(sum);

        sc.close();
    }
}
