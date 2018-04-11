package com.cg;

public class ClassC 
{
	    public static void main(String[] args)
		{

	    	 Date doj  = new Date(11,12,2013); 
	    	 Employee emp = new Employee("Chamu","D",15000,"A3", doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	     	
	         doj  = new Date(9,6,2013);
	    	 emp = new Employee("Manisha","Cheernam",45000,"A5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(8,5,2011);
	    	 emp = new Employee("Teja","S",90000,"A5",doj);	    
	         emp.displayentry();	
	         doj.displayDate();
	         
	         doj  = new Date(7,6,2014);
	    	 emp =  new Employee("Bindu","Yandamuri",21000,"A2",doj);
	    	 emp.displayentry();
	    	 doj.displayDate();
	    	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new Employee("Jyothi","R",55000,"B3",doj);
	 		 emp.displayentry();	
	 		 doj.displayDate();
	 		 
	    emp.displaycount();
	   }
	}

