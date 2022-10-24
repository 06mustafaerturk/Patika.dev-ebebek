package ebebek;

import java.math.BigDecimal;

public class EmployeeManager {

	int suAnkiYil=2021;
	BigDecimal maasSinir = new BigDecimal(1000);
	BigDecimal vergiOran = new BigDecimal(0.03);
	BigDecimal haftaSinir = new BigDecimal(40);
	BigDecimal fazlaMesaiSaatUcreti = new BigDecimal(30);
	private Employee employee;
	
	public BigDecimal brutMaasHesapla() {
		return employee.salary.add(bonus()).add(tax());
	}
	
	public BigDecimal tax() {

		BigDecimal vergi = new BigDecimal(0);
		if (employee.salary.compareTo(maasSinir) == 1) {
			vergi = employee.salary.multiply(vergiOran);
		}

		return vergi;

	}

	public BigDecimal bonus() {
		BigDecimal bonus = new BigDecimal(0);
		if (employee.workHours.compareTo(haftaSinir) == 1) { // workHours hafta sýnýrdan büyükse 1,eþit 0, küçükse -1
			bonus = employee.workHours.subtract(haftaSinir).multiply(fazlaMesaiSaatUcreti); // substruck cýkarma demek.
		}
		return bonus;
	}

	public BigDecimal raiseSalary() {
			BigDecimal zam=new BigDecimal(0); // baþlagýc degeri 0
			if((suAnkiYil- employee.hireYear)<10) {
				zam=brutMaasHesapla().multiply(new BigDecimal(0.05));
			}else if((suAnkiYil-employee.hireYear)>9 && (suAnkiYil-employee.hireYear)<20){
				zam=brutMaasHesapla().multiply(new BigDecimal(0.10));
			}else if((suAnkiYil- employee.hireYear)>19) {
				zam=brutMaasHesapla().multiply(new BigDecimal(0.15));

			}
	
	 return zam;		
	}




	@Override
	public String toString() {
		return "EmployeeManager [suAnkiYil=" + suAnkiYil + ", maasSinir=" + maasSinir + ", vergiOran=" + vergiOran
				+ ", haftaSinir=" + haftaSinir + ", fazlaMesaiSaatUcreti=" + fazlaMesaiSaatUcreti + ", employee="
				+ employee + ", brutMaasHesapla()=" + brutMaasHesapla() + ", tax()=" + tax() + ", bonus()=" + bonus()
				+ ", raiseSalary()=" + raiseSalary() + ", getEmployee()=" + employee.toString() + "]";
	}

	
	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

}
