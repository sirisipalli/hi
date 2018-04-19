package com.cg;

public class Permanent {

	 public double Salary;
	 public String name;
	private static String joiningDate;
	public Permanent(double Salary,String name,String joiningDate)
{
this.Salary=Salary;
}
	public String getJoiningDate()
{
return joiningDate;

}
public void setJoiningDate(String joiningDate)
		{
			this.joiningDate = joiningDate;
		}

	 public double getSalary()
		{
			return Salary;
		}
	 public void setSalary(double Salary)
		{
			this.Salary = Salary;
		}
	
}