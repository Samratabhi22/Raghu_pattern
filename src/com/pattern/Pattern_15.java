package com.pattern;

public class Pattern_15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				for(int k=1;k<=9;k++)
				if(i%2!=0) {
					if(i==1) {
						k=1;
						System.out.print(k);
						
					}
					if(i==3) {
						k=2;
						System.out.print(k);
						
					}
					if(i==5) {
						k=3;
						System.out.print(k);
					}
			}
				else {
					if(i==2) {
						k=6;
						System.out.print(k);
					}
					if(i==4) {
						k=7;
						System.out.print(k);
					}
				}
			}
			System.out.println();
		}
			}
}
