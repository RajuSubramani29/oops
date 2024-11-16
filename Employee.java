package oops;

public class Employee {

	private int id;
	private String employeeName;
	private String desigination;
	private double salary;
	private double experince;

	Employee() {

	}

	Employee(int empId, String empName) {
		//System.out.println("Constructor with Employee \n Id : " + empId + "\n Name : " + empName);
		this.id = empId;
		this.employeeName = empName;
		System.out.println("Constructor with Employee \n Id : " + this.id + "\n Name : " + this.employeeName);

	}

	Employee(int empId, String empName, String empDesigination, double empSalary, double empExperience) {
		/*
		 * System.out.println("Constructor with Employee \n Id : " + empId +
		 * "\n Name : " + empName + "\n Desigination : " + empDesigination +
		 * "\n Salary : " + empSalary);
		 */
		this.id = empId;
		this.employeeName = empName;
		this.desigination = empDesigination;
		this.salary = empSalary;
		this.experince = empExperience;
		/*
		 * System.out.println("Constructor with Employee \n Id : " + this.id +
		 * "\n Name : " + this.employeeName + "\n Desigination : " + this.desigination +
		 * "\n Salary : " + this.salary);
		 */
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesigination() {
		return desigination;
	}

	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExperince() {
		return experince;
	}

	public void setExperince(double experince) {
		this.experince = experince;
	}

}
