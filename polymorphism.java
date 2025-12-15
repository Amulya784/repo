package polymorphism;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismDemo poly = new PolymorphismDemo() ;
		System.out.println("circle area :" +poly.area(12.00));
		System.out.println("Rectangle area :" +poly.area(10, 20));
		System.out.println("circle area :" +poly.area(5));
	}
	public int area(int side) {
		int area = side * side ;
		return area ;
	}
	public int area (int length , int breadth) {
		int area = length*breadth ;
		return area ;
	}
	public double area(double radius) {
		double area=3.13*radius*radius;
		return area;
	}
	

}
