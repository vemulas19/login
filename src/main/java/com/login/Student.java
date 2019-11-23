package com.login;

public class Student {
public static void main(String[] args) {
	System.out.println("student details");
	int mul = mulitiplication(10, 20);
	int mul2 = mulitiplication(10, 200);
	System.out.println("Multiplication is : " + mul);
}

	public static int mulitiplication(int a, int b) {
		
		int c=a*b;
		System.out.println("Done with calcuation");
		return c;
	}
}
