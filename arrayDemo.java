package UNIT1;

import java.util.Scanner;

public class Arraydemo {

    public static void main(String[] args) {

        System.out.println("Enter 5 marks:");

        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[5];
        int total = 0;
        double avg;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
            total += arr1[i];
        }

        avg = (double) total / arr1.length;

        System.out.println("Average is " + avg);

        sc.close();
    }
}
