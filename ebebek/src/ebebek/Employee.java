package ebebek;

import java.math.BigDecimal;

public class Employee {

		String name;
		BigDecimal salary;
		BigDecimal workHours;
		int hireYear;
		BigDecimal zam;
		
		public Employee(String name, BigDecimal salary, BigDecimal workHours, int hireYear, BigDecimal zam) {
			super();
			this.name = name;
			this.salary = salary;
			this.workHours = workHours;
			this.hireYear = hireYear;
			this.zam = zam;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", workHours=" + workHours + ", hireYear="
					+ hireYear + ", zam=" + zam + "]";
		}
		
		

		
}
