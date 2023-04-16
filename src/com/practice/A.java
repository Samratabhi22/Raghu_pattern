package com.practice;

public class A {
static int i=10;
public static void test()
{
	System.out.println("From Static test()");
	int i=20;
	System.out.println(i);
	System.out.println(A.i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("From main()");
		A obj1=new A();
		System.out.println(obj1.i);
		obj1.test();

	}

}
