package LeapDemo;

public class StudentInfo {
	int id;
	String First_Name;
	String Last_Name;
	double salary;
	public void getId(int id)
	{
		System.out.println("id="+ id);
	}
	
	public void getName(String First_Name,String Last_Name)
	{
		System.out.println("first name and last name="+(First_Name+Last_Name));
	}
	public void getSalary(double salary)
	{
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo si1=new StudentInfo();
		si1.getId(32);
		si1.getName("priyanka","pr");
		si1.getSalary(130000.00);
		StudentInfo si2=new StudentInfo();
		si2.getId(23);
		si2.getName("sahana","ys");
		si2.getSalary(40000.80);
	}
}
