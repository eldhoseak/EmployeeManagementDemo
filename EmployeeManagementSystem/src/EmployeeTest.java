import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EmployeeTest {

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter employee id");
		String id = in.nextLine();
		System.out.println("Please enter employee name");
		String name = in.nextLine();
		System.out.println("Please enter employee email");
		String email = in.nextLine();
	
		EmployeeService service = new EmployeeService();
		Employee employee= null;
		
		employee= service.createEmployee(id, name, email); // -- 1
		System.out.println("Welcome "+employee.getName());
		System.gc();
		
		
	}
	
	
	
}
