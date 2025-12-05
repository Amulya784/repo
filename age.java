package age;
import java.util.Scanner;

public class printage {

	public static void main(String[] args) {
	
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter age:");
		        int age = scanner.nextInt();
		        
		        while (age != -1) {
		            printAgeCategory(age);
		            System.out.println("Enter age:");
		            age = scanner.nextInt();
		        }
		    }

		    public static void printAgeCategory(int age) {
		        if (age >= 0 && age <= 12) {
		            System.out.println("kid");
		        } else if (age >= 13 && age <= 19) {
		            System.out.println("teenager");
		        } else if (age >= 20 && age <= 40) {
		            System.out.println("youngster");
		        } else if (age >= 41 && age <= 55) {
		            System.out.println("aged man");
		        } else if (age >= 56 && age <= 70) {
		            System.out.println("old man");
		        } else {
		            System.out.println("Age out of defined categories");
		        }
		    }
		

	}
