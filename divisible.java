package practice;
import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		
		
	
		        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the size of array:");
		        int n = scanner.nextInt();
		        int[] arr = new int[n];
		        System.out.println("Enter the elements of array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        System.out.println("The number of elements divisible by 5 is: " +Multiples(arr));
	}

		    public static int Multiples(int[] arr) {
		        int count = 0;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 5 == 0) {
		                count++;
		            }
		        }
		        return count;
		        
		    }
}
