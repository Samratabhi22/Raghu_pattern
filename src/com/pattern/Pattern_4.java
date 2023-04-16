package com.pattern;

import java.util.Scanner;

public class Pattern_4 {
	public static void main(String [] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of lines");
	int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				if(i%2!=0) {
					System.out.print(1);
				}
				if(i%2==0) {
					System.out.print(0);
				}
			}
			System.out.println();
	}
}
}