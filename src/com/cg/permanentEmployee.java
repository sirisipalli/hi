package com.cg;
class permanentEmployee extends Employee {
	private String name;
	String joinDate;
	private double salary;
	public permanentEmployee() {}
	public permanentEmployee(String name, double salary, String joinDate)
	   {
		
		super(name, salary, joinDate);
	   	setName("name");
		setJoinDate("joinDate");
		
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
		// TODO Auto-generated method stub
		
	}
	public double getSalary() {
		return salary;
	}
	
	public void setJoinDate(String joinDate) {
		this.joinDate=joinDate;
	}
	public String getJoinDate() {
		return joinDate;
	}
		
	
}
