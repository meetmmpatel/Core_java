package day.four.OOP;

public class Employee {
	
	String empName;
	int empSalary;
	String address;
	
	public Employee() {
		this("Steve Smith");
		
	}
	
	public Employee(String name) {
		this(name,12000);
		
	}
	public Employee (String name, int sal) {

       this(name,sal,"120 Main st");
	
	}
	
	public Employee (String name, int sal, String Address) {
		this.empName = name;
		this.empSalary = sal;
		this.address = Address;
	}
	
	void disp() {
		System.out.println( "Name of Employee" + empName);
		System.out.println("Employee Salary" + empSalary);
		System.out.println("Employee Address:" + address);
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.disp();
		
		Employee emp2 = new Employee("Mike Smith");
		System.out.println(emp2);
		
		
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", address=" + address + "]";
	}
	
	
	

}
