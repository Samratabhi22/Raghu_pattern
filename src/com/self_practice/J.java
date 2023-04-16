package com.self_practice;
import java.util.Scanner;
public class J {
            
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a= sc.nextInt();
		if(a%3==0 || a%5==0)
		{
			System.out.println("Number is divisible by 3 or 5 : "+a);
		}
		else 
		{
			System.out.println("Number is not divisible by 3 or 5 : "+a);
		}
	}

}
