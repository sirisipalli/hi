package com.kh;


public class Employee {
	private String name;
	private double salary;
	//private Date joinDate;
	//private static int count;
	
	permanentEmployee permanentEmployee;
	private contractEmployee contractEmployee;
	public Employee() {}
	public Employee(String name, double salary, String joinDate) { 
		 setName(name);
		 setPermanentEmployee(permanentEmployee);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
		
	}
	
		
	public void setPermanentEmployee(permanentEmployee p) {
		this.permanentEmployee = p;
	}
	public permanentEmployee getPermanentEmployee() {
		return permanentEmployee;
	}
	public void setContractEmployee(contractEmployee conEmp) {
		this.contractEmployee = conEmp;
	}
	public contractEmployee getContractEmployee(){
		return contractEmployee;
		
	}
	public void setSalary(double salary) {
		this.salary=salary;
	
	}
	public double getSalary() {
		return salary;
	}
	
	}
