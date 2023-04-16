package com.practice;

public class Employee {

	private String name;
	private int eid;
	private double salary;
	private String designation;
	
	static int genEid;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getEid()
	{
		return eid;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		if(salary > this.salary)
		{
			this.salary=salary;
		}
	}
    public String getDesignation()
		{
			return designation;
		}
	Employee()
	{
		
	}
	Employee (String name,double salary,String designation)
	{
		this.eid=++genEid;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}

	}


