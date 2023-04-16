package com.self_practice;

public class Driver4 {

	public static void main(String[] args) {
		J5 obj1 = new J5();
		obj1.test1();
		obj1.test2();
		J2 obj2 = obj1;
		obj2.test1();
		obj2.test2();
		J1 obj3 = obj1;
		obj3.test1();
		//obj3.test2();
		J6 obj4=new J6();
		obj4.test1();
		obj4.test2();
		obj4.test3();
		J4 obj5=obj4;
		obj5.test1();
		obj5.test2();
		obj5.test3();
		J2 obj7 = obj4;
		obj7.test1();
		obj7.test2();
		J1 obj8 =obj4;
		obj8.test1();
		//obj8.test2();
		//obj8.test3();

	}

}
