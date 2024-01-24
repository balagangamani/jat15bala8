
package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// Create an instance of Employee
		Employee employee = new Employee("John Doe", 12345, 75000.00);

		// Set the employee's name, ID, and salary
		employee.setName("John Doe");
		employee.setId(12345);
		employee.setSalary(75000.00);

		// Print the employee's name and salary
		employee.printName();
		employee.printSalary();
	}
}
