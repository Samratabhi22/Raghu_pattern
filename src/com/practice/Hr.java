package com.practice;

public class Hr extends Employee{
      static int countHr;
      Hr()
      {
    	  
      }
      Hr(String name, double salary,String designation)
      {
    	  super(name,salary,designation);
    	  countHr++;
      }
      public void hiring()
      {
    	  System.out.println("Hiring!!!!");
      }
}
