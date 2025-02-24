package test.com;

import java.util.List;

import java.util.List;

public class Company {
	private String companyName;
	private List<String> employees;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<String> getEmployees() {
		return employees;
	}
	public void setEmployees(List<String> employees) {
		this.employees = employees;
	}
	public void disply()
	{
		System.out.println("Company :"+companyName);
		System.out.println("Employees List :"+companyName);
		
		for(String employee :employees) {
			System.out.println("-- "+employee);
		}
	}

}
