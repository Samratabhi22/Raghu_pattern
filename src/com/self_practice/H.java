package com.self_practice;
import java.util.Scanner;
public class H {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even Number : "+a);
		}
		else
		{
			System.out.println("Odd Number : "+a);
		}

	}

}
