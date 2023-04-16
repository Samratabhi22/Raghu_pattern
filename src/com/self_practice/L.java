package com.self_practice;
import java.util.Scanner;
public class L {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c) 
		{
			System.out.println("Largest number : "+a);
		}
		else if(b>c)
		{
			System.out.println("Largest number : "+b);
		}
		else 
		{
			System.out.println("Largest number : "+c);
		}
	}

}
