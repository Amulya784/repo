package pos;

import java.util.Scanner;

public class positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();
		int absolutevalue = getabsolutevalue(num);

		System.out.println("absolute value of is:" + absolutevalue);
	}

	public static int getabsolutevalue(int num) {
		if (num < 0) {
			return -num;
		} else {
			return num;
		}
	}
}
