package oops;

import java.util.Arrays;
import java.util.List;

public class EmployeeData extends Employee {

	public static List<Employee> getAllEmployee() {
		Employee e1 = new Employee(101, "NasiRifa", "CEO", 125000, 10);
		Employee e2 = new Employee(102, "Raju", "DEVELOPER", 85000, 5.2);
		Employee e3 = new Employee(103, "Jakkir", "ADMIN", 50000, 10);
		Employee e4 = new Employee(104, "Hari", "SEO", 105000, 7);
		Employee e5 = new Employee(105, "Mohan", "TESTER", 75000, 6);
		Employee e6 = new Employee(106, "Ganesh", "DEVELOPER", 85000, 5);
		Employee e7 = new Employee(107, "Chandru", "UI", 45000, 3);
		Employee e8 = new Employee(108, "Ram", "DEVELOPER", 55000, 3.5);
		Employee e9 = new Employee(109, "Jagadesh", "UI", 30000, 2);
		return Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9);
		

	}

}
