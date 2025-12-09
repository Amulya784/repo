package array;

public class arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {10,23,45,35,23};
		int sum = 0;
		for( int i = 0 ; i < number.length ; i++ ) {
			sum += number[i];
			
		}
		System.out.println("sum of array elements : "+sum);

	}

}
