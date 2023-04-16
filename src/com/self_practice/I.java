package com.self_practice;
import java.util.Scanner;
public class I {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int big=a;
		if(b>big)
		   big=b;
			System.out.println("largest number is : "+big);
		
		
	}

}
