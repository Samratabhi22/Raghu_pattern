package com.practice;

public class Driver1 {

	public static void main(String[] args) 
	{
		Developer e1=new Developer("Abhi",50000.0,"Developer");
		TestEngineer e2=new TestEngineer("Anjali",60000.0,"TestEngineer");
		Hr e3 = new Hr("Raghu",40000.0,"Hr");
		Hr e4 = new Hr("Uttam",30000.0,"Hr");
		
		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);
		displayDetails(e4);
		
		System.out.println("count of Employees:"+Employee.genEid);
		System.out.println("count of Developers:"+Developer.countDev);
		System.out.println("count of TestEngineers:"+TestEngineer.countTE);
		System.out.println("count of Hr:"+Hr.countHr);

	}
   public static void displayDetails(Employee e)
   {
	   System.out.println("Name :"+e.getName());
	   System.out.println("Eid :"+e.getEid());
	   System.out.println("Salary :"+e.getSalary());
	   System.out.println("Designation :"+e.getDesignation());
	   
   
   if(e instanceof Developer)
   {
	   ((Developer)e).coding();
   }
	   else if(e instanceof TestEngineer)
	   {
		   ((TestEngineer)e).testing();
	   }
	   else if (e instanceof Hr)
	   {
		   ((Hr)e).hiring();
	   }
	   System.out.println("====================================================");
   }
}
