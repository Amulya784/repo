package logicalOR;
import java.util.Scanner;
public class OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number:");
		        int a = scanner.nextInt();

		        System.out.println("Enter the second number:");
		        int b = scanner.nextInt();

		        boolean result = isGreatNumber(a, b);

		        System.out.println("given no is greater? " + result);
		    }

		    public static boolean isGreatNumber(int a, int b) {
		        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
		    }
		
	}
