package UNIT1;

public class matrixadd {

	public static void main(String[] s) {

		int mat[][] = new int[3][3];

	
  //initialising matrix
	for(int i=0; i<3; i++) {

		for(int j=0; j<3; j++) {

			mat[i][j]= (i+j);

		}

	}

  //printing matrix
	for(int k=0; k<3; k++) {

		for(int l=0; l<3; l++) {

			System.out.print(mat[k][l]+" ");

		}

		System.out.println("\n");

	}

}

}




