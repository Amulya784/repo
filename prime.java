package primeornot;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
	
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		        boolean isPrime = Prime(number);

		        if (isPrime) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }
		    }

		    public static boolean Prime(int number) {
		        if (number <= 1) {
		            return false;
		        }

		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }

		        return true;
		    }
		
		
	}
