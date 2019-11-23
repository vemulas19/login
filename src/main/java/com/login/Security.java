package com.login;

public class Security {
	public static void main(String[] args) {
		System.out.println("hai ");
		int a = 10;
		int b=20;
		Security s = new Security();
		int total = s.sum(a, b);
		System.out.println("The sum is : " + total);
		
	}
	
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Summation calculation done!!");
		return c;
	}
}
