package com.pattern;

import java.util.Scanner;

public class Pattern_8 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of lines");
	int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(j);
				
			}
			System.out.println();
	}
	}

}
