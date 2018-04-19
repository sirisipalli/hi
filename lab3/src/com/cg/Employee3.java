package com.cg;

public class Employee3
{
	private String fname;
	private String lname;
	private Contract contract;
	private Permanent permanent;
	private double salary;
	 Date dateOfJoining;
	 
	 public double getSalary()
		{
			return salary;
		}
	 //public void setSalary(double salary)
		//{
			//this.salary = salary;
		//}
	 public String  getFname()
		{
			return fname;
		}
	 public void setFname(String  fname)
		{
			this.fname = fname;
		}
	 public String  getLname()
		{
			return lname;
		}
	 public void setLname(String  lname)
		{
			this.lname = lname;
		}
	 public Date  getDateOfoining()
		{
			return dateOfJoining;
		}
	 public void setDateOfoining(Date dateOfJoining)
		{
			this.dateOfJoining = dateOfJoining;
		}
	 public Contract  getContract()
		{
			return contract;
		}
	 public void setContract(Contract contract)
		{
			this.contract = contract;
		}
	 public Permanent  getPermanent()
		{
			return permanent;
		}
	 public void setPermanent(Permanent permanent)
		{
			this.permanent = permanent;
		}
} 

