package sumofdig;

import java.util.Scanner;

public class sumdig {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num = scanner.nextInt();

		int sumOfDigits = Sum(number);

		System.out.println("The sum of the digits of is: " + sumOfDigits);
	}

	public static int Sum(int number) {
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}

}
