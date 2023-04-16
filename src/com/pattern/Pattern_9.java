package com.pattern;

import java.util.Scanner;

public class Pattern_9 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of lines");
	int n=sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print((char)(j+96));
				
			}
			System.out.println();
	}
	}
}