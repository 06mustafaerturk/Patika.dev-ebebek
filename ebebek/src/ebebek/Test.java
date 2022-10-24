package ebebek;

import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {

		
		Employee employee= new Employee("mustafa",new BigDecimal(2000),new BigDecimal(40),2000,new BigDecimal(0));
		EmployeeManager employeeManager= new EmployeeManager();
		EmployeeManager employeeManager2= new EmployeeManager();
		employeeManager.setEmployee(employee);
		employeeManager.raiseSalary();
		System.out.println(employeeManager.toString());
		System.out.println(employeeManager2.toString());
	}

}
