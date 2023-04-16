package com.practice;

public class Developer extends Employee{
	static int countDev;
	Developer()
	{
		
	}
	Developer(String name , double salary,String designation)
	{
		super(name,salary,designation);
		countDev++;
	}
public void coding()
{
	System.out.println("coding!!!!!");
}
}
