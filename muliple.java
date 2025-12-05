package practice;

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		

		        Scanner Scanner = new Scanner(System.in);

		        System.out.println("Enter the size of array:");
		        int n = Scanner.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter the elements of array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = Scanner.nextInt();
		        }
		        

		        printMultiples(arr);
		    }

		    public static void printMultiples(int[] arr) {
		        int element = 0;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 3 == 0) {
		                element++;
		            }
		        }
		        System.out.println("The number of elements  divisible by 3 is: " + element);
		    }
}		

	}
