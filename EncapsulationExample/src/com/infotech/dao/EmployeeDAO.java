package com.infotech.dao;

import java.util.ArrayList;
import java.util.List;

import com.infotech.model.Employee;

public class EmployeeDAO {
	private static List<Employee> empList = null;
	static{
		empList = new ArrayList<Employee>();
		Employee e1 = new Employee();
		e1.setEmpId("EMP001");
		e1.setFirstName("Martin");
		e1.setLastName("Bingel");
		e1.setAge(35);
		
		Employee e2 = new Employee();
		e2.setEmpId("EMP002");
		e2.setFirstName("Sean");
		e2.setLastName("Murphy");
		e2.setAge(40);
		
		empList.add(e1);
		empList.add(e2);
	}

	public Employee getEmployeeData(String empId) {
		System.out.println("Going to DB to get employee Data");
		// goes to the dummy method rather than going to DB
		Employee employee = getEmployeeById(empId);
		// Will give Compilation error, data can be set only through setters method
		//employee.age = 10;
		String fullName = getFullName(employee.getFirstName(),employee.getLastName());
		employee.setFullName(fullName);
		return employee;
	}

	// private method to concatenate first and last name
	private String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	//dummy method
	private Employee getEmployeeById(String empId) {
		for (Employee emp : empList) {
			if(emp.getEmpId().equalsIgnoreCase(empId)){
				return emp;
			}
		}
		return null;
	}
}