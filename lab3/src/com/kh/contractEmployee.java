package com.kh;

class contractEmployee extends Contractor {
	public contractEmployee(String name, int rate) {
		super(name, rate);
		
		// TODO Auto-generated constructor stub
	}
	
	public contractEmployee() {
		// TODO Auto-generated constructor stub
	}

	private static int noOfHours;
	
	private Contractor contractor;
	private int salary;
	private String joinDate;
	
	 
	/*public contractEmployee()
		{
		super();
		count=count+1;
		}
	*/

	
	
	public static int getNoOfHours() {
		return noOfHours;
	}

	public static void setNoOfHours(int noOfHours) {
		contractEmployee.noOfHours = noOfHours;
	}

	
	
	public int getSalary() {
		   salary = getNoOfHours() * Contractor.rate;
		   return salary;     
			// TODO Auto-generated method stub
			}




	public void setContractor(Contractor c){
		this.contractor=c;
	}
	public Contractor getContractor(){
		return contractor;
	}

	public String getJoinDate() {
		
		return joinDate;
	}
	public void setJoinDate(String joinDate){
		this.joinDate=joinDate;
	}







}
