package array;

import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("Enter the value for row " + (i + 1) + " column " + (j + 1));
				arr[i][j] = sc.nextInt();
			}
			System.out.println(" ");
		}
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[i][j] >= 1 && arr[i][j] < 50) {
					count++;
				} else if (arr[i][j] >= 50 && arr[i][j] <= 100) {
					count1++;
				} else if (arr[i][j] > 100) {
					count2++;
				}

			}
			System.out.println("In the above array there are " + count + " number between 1 to 50");
			System.out.println("In the above array there are " + count1 + " number between 50 to 100");
			System.out.println("In the above array there are " + count2 + " number greater than 100");
		}
	}
}
