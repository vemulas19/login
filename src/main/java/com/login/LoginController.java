package com.login;

public class LoginController {

	public static void main(String[] args) {
		System.out.println("Helo login implemented here!!");
		int sub = substraction(4635, 2343);
		System.out.println("Sub result  is : " + sub);
	}
	public static int substraction(int number1, int number2) {
		int c = number1-number2;
		System.out.println("Done calculation!!");
		return c;
	}
	
}
