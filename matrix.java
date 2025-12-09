package twodim;

import java.util.Scanner;

public class martix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int matrix1[][] = new int[2][2];
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {
				System.out.println("Enter the value for row " + (i + 1) + "column" + (j + 1));
				matrix1[i][j] = sc.nextInt();
			}
		}
		int matrix2[][] = new int[2][2];
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; i++) {
				System.out.println("Enter the value for row " + (i + 1) + "column" + (j + 1));
				matrix2[i][j] = sc.nextInt();
			}

		}
		int sum[][] = new int[2][2];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; i++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
				System.out.println("sum of two matrix is:" + sum[i][j]);

			}

		}
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; i++) {
				System.out.println(sum[i][j] + "  ");
			}
		}
		System.out.println(" ");
	}
}
