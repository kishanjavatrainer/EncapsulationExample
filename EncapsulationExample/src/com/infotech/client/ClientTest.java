package com.infotech.client;

import com.infotech.dao.EmployeeDAO;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {

		EmployeeDAO employeeDAO = new EmployeeDAO();
		//employeeDAO.getEmployeeById("EMP001"); // will give compilation error
		Employee employee = employeeDAO.getEmployeeData("EMP001");
		System.out.println(employee.getEmpId()+"\t"+employee.getFullName()+"\t"+employee.getAge());
	}
}
