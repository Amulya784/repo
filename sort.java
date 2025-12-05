package sort;

import java.util.Scanner;


public class sortarr {

	public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the size of array:");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        System.out.println("given array:");
	        sortArray(arr);

	        bubbleSort(arr);

	        System.out.println("Sorted array:");
	        sortArray(arr);
	    }

	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    // Swap arr[j] and arr[j+1]
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
	    
	    public static void sortArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
}
