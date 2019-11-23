package com.login;

public class Security {
	public static void main(String[] args) {
		System.out.println("hai ");
		int number1 = 10;
		int number2=20;
		Security security = new Security();
		int total = security.sum(number1, number2);
		System.out.println("The sum is : " + total);
		
	}
	
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Summation calculation done!!");
		return c;
	}
}
