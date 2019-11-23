package com.login;

public class Student {
public static void main(String[] args) {
	System.out.println("student details");
	int mul = mulitiplication();
	System.out.println("Multiplication is : " + mul);
}

	public static int mulitiplication() {
		
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println("Done with calcuation");
		return c;
	}
}
