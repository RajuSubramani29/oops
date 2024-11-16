package oops;

import java.util.List;

public class Test extends EmployeeDetails {

	public static void main(String[] args) {
		System.out.println("Employee Details");
		EmployeeDetails ed = new EmployeeDetails();
		ed.empDetails(101, "Raju", "ADMIN", 200000, 8);
		Test t = new Test();
		t.empDetails("Hello");
		System.out.println("------------------------------------------------------------------");

		System.out.println("Retrive all the Employee Lists");
		List<Employee> employees = EmployeeData.getAllEmployee();
		employees.forEach(employee ->
		System.out.println(employee.getEmployeeName()+" "+employee.getDesigination()));	
		System.out.println("------------------------------------------------------------------");

		System.out.println("Retrive all the Employee Lists");
		List<Employee> emps = EmployeeData.getAllEmployee();
		for(Employee emp: emps)
		System.out.println(emp.getEmployeeName()+" "+emp.getDesigination());	
	}

}
