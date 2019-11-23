package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String s1=req.getParameter("name1");
		String s2=req.getParameter("name2");
		String s3=req.getParameter("mail");
		String s4=req.getParameter("pwd");
		
		
		System.out.println(s1+"  "+s2+"  "+s3+"  "+s4);
		
		
 	}

}
