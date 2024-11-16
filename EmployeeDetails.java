package oops;

public class EmployeeDetails implements Admin, Experience {

	Employee empDetails(int empId, String empName) {
		System.out.println("Employee Details with Id and Name");
		return empDetails(empId, empName);
	}

	Employee empDetails(int empId, String empName, String empDesigination, double empSalary, double empExperience) {
		System.out.println("Employee Details with Id, Name, Desigination, Salary And Experienc");
		if (empDesigination == "ADMIN") {
			empSalary = additionalSalary(empSalary);
			System.out.println("in " + empSalary);
		}
		if (empExperience >= 5) {
			empDesigination = changeDesigination(empDesigination);
			System.out.println("in " + empDesigination);
		}
		Employee emp = new Employee(empId, empName, empDesigination, empSalary, empExperience);
		System.out.println("out" + empSalary);
		System.out.println("out" + empDesigination);

		return emp;
	}
	
	String empDetails(String message) {
		System.out.println("Message from Employee Details " + message);
		return message;
	}
	@Override
	public double additionalSalary(double a) {
		System.out.println("Admin Interface");
		return a += 100000;
	}

	@Override
	public String changeDesigination(String desigination) {
		System.out.println("Experience Interface");
		return "SR_"+desigination;
	}

	
}
