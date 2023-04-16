package com.self_practice;
import java.util.Scanner;
public class K {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a =sc.nextInt();
		if(a>9 && a<=20)
		{
			System.out.println("In range");
		}
		else {
			System.out.println("Not in range");
		}

	}

}
