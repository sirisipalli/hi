package com.cg;

public class ClassV {


	public static void main(String[] args) {
		Employee3 e = new Employee3[2];
		//Permanent p = new Permanent();
		Contract c = new Contract[2];
		Contractor cr = new Contractor[2]; 

		String[] ename = {"c","kk"};
		double[] esalary = {100.00,1002.00};
		int[] workingHours = {8};
		int[] ratePerHour = {350}; 
		
		for(int i=0;i<2;i++)
		{
		e[i] = new Employee3();
		c[i] = new Contract();
		cr[i] = new Contractor();

		e[i].setFname(ename[i]);
		e[i].setSalary(esalary[i]);
		e[i].setContract(c[i]);
		c[i].setWorkingHours(workingHours[i]);
		c[i].setContractor(cr[i]);
		//cr[i].setContractorName();
		cr[i].setRatePerHour(ratePerHour[i]);
		

		//ratePerHour = 8 * workingHours;
		//e.setContract().setWorkingHours()*e.setContract().setContractor().setRatePerHour()/100
		System.out.println("Name      			 :"+e.getFname());
		System.out.println("Last Name      				 :"+e.getLname());
		System.out.println("salary of employee 			 :"+e.getSalary());
		//System.out.println("salary of employee 			 :"+(e.setContract().setWorkingHours())*(e.setContract().setContractor().setRatePerHour()));
	}
}
