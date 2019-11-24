package com.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Profile {

	public static void main(String[] args) {
		System.out.println("Hi Hi");
		System.out.println("Hi friends");
	}
	public static boolean isValidMobile(String s) 
    { 
        Pattern p = Pattern.compile("(0/91)?[6-9][0-9]{9}"); 
        Matcher m = p.matcher(s); 
        return m.matches();
    } 
}
