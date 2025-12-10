package Student;
import java.util.Scanner;
public class StudentDetail {
    
	int Id = 12;
    String FirstName = "Amulya" ;
    String LastName ="L";
    double Salary =23676;

    public void getId() {
        System.out.println("Id : " + Id);
    }

    public void getFullName() {
        String Fullname = FirstName + " " + LastName;
        System.out.println("Name : " + Fullname);
    }

    public void getSalary() {
        System.out.println("Salary : " + Salary);
    }

    public static void main(String[] args) {
  
        
    	StudentDetail n = new StudentDetail();
        
         
        n.getId();
        n.getFullName();
        n.getSalary();
    }
}
