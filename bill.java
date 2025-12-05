package ele;
import java.util.Scanner;
public class electricityBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the unit of electricity used:");
		int n=sc.nextInt();
		
		if (n<=30){
			double a=n*3.50;
			System.out.println("electric bill price consumed unit is:"+a);
		}
		else ifif (n>=30 && n<=50 ) {
			double b=n*4.25;
			System.out.println("electric bill price consumed unit is:"+b);
		}
		else ifif(n>=50 && n<100) {
			double c=n*5.25;
			System.out.println("electric bill price consumed unit is:"+c);
		}
		else
			double d=n*5.85;
			System.out.println("electric bill price consumed unit is: "+d);
		}
}
