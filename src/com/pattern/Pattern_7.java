package com.pattern;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of lines");
	int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				
				if(j%2!=0) {
					System.out.print(1);
				}
				if(j%2==0) {
					System.out.print(0);
				}
			}
			System.out.println();
	}
	}

}
