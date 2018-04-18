package com.cg;

public class Entry {
	public static void main(String args[]) {
		int count = 1000;
		count= count++;
		Employee[] e = new Employee [2];
		permanentEmployee[] p = new permanentEmployee[2];
		contractEmployee[] conEmp = new contractEmployee[2];
		Contractor[] c = new Contractor[2];
	/*	String names[] = {"lohitha", "sharika"};
		double salaries[]  = {2500.00, 3500.00};
		String joinDates[] = {"14-Aug-2018", "16-Jan-2018"};
		
		
		for(int i=0; i<2; i++) {
			e[i] = new Employee();
			p[i] = new permanentEmployee();
			conEmp[i] = new contractEmployee(i, i);
			
			 e[i].setPermanentEmployee(p[i]);
			 e[i].setContractEmployee(conEmp[i]);	
		}
    */  
		for(int i=0; i<2; i++) {
			e[i] = new Employee();
			p[i] = new permanentEmployee();
			conEmp[i] = new contractEmployee();
			c[i] = new Contractor();
		}		
	 e[0].setName("chamu");
	 e[1].setName("Sirisipalli");
	 
	 p[0].setSalary(25000.00);
	 p[1].setSalary(30000.00);
	 
	 
	 p[0].setJoinDate("14-Aug-2018");
	 p[1].setJoinDate("16-Jan-2018");
	 
	 c[0].setRate(450);
	
	 
	 conEmp[0].setName("Chamundeswari s");
	 conEmp[1].setName("Surya k");
	 
	
	conEmp[0].setNoOfHours(15);
	conEmp[1].setNoOfHours(20);
	
	
	
	conEmp[0].setJoinDate("15-Nov-2010");
	conEmp[1].setJoinDate("24-Jan-2006");
	
	
	 for(int i=0; i<2; i++) {
		 
		 e[i].setPermanentEmployee(p[i]);
		 e[i].setContractEmployee(conEmp[i]);
		 conEmp[i].setContractor(c[i]);
		 conEmp[i].getContractor();
		 
		 System.out.println("Permanent Employee details :");
		 System.out.println("                            ");
		 System.out.println("Employee no is              			:" +count++);
		 System.out.println("Employee name is            			:" +e[i].getName());
		 System.out.println("Employee Salary is 		        	:" +e[i].getPermanentEmployee().getSalary());
		/* System.out.println("permanent employee salary is       :" +p[i].getSalary()); */
		 System.out.println("Employee joining date is  is       	:" +e[i].getPermanentEmployee().getJoinDate());
		 
		 System.out.println("                            ");
		 System.out.println("contract Employee details  :");
		 
		 System.out.println("                            ");
		 System.out.println("Employee no is            	       		:" +count++);
		 System.out.println("Employee name is                   	:" +e[i].getContractEmployee().getName());
		 System.out.println("Employee salary  is                	:" +e[i].getContractEmployee().getSalary());
		 System.out.println("Employee date of joining is        	:" +e[i].getContractEmployee().getJoinDate());
		 System.out.println("---------------------------------------------------------------------------------------------");
		 

	 }

		    }
}


