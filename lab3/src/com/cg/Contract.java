package com.cg;

public class Contract {

	private int workingHours;
	private static int count;
	private double Salary;
	private Contractor contractor; 
	//private double contractSalary;
	public double getSalary()
	{
		//this.salary = salary;
		//Salary= workingHours * contractor.rate;
		return Salary;
	}
	
	public int getWorkingHours()
	{
		return workingHours;
	}
	
	
	public Contractor contractor()
	{
		return contractor;
	}
	public int getCount()
	{
		return count;
	} 
	//public void setCount(int count)
	//{
	//	this.count = count;
	//}
	
	public void setWorkingHours(int workingHours)
	{
		this.workingHours = workingHours;
	}
	public void setContractor(Contractor contractor)
	{
		this.contractor=contractor;
	}
	
}

