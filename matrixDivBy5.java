package unit1;

import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[][] = new int[3][3];

		System.out.println("Enter matrix elements:");

    //input matrix
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				num[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elements divisible by 5:");

    //enhanced for loop
		for(int[] row : num) {
			for(int y : row) {
				if(y%5==0) {
					System.out.println(y);
				}
			}
		}
		sc.close();
	}

}

