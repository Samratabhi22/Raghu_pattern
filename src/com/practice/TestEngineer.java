package com.practice;

public class TestEngineer extends Employee {
	static int countTE;
	TestEngineer()
	{
		
	}
    TestEngineer(String name,double salary,String designation)
    {
    	super(name,salary,designation);
    	countTE++;
    }
    public void testing()
    {
    	System.out.println("Testing!!!!");
    }
}
