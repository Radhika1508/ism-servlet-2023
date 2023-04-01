package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{

	   
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   System.out.println("Request Method calling..");
		String FirstName = request.getParameter("firstName");
		String Email = request.getParameter("email");
		String Password = request.getParameter("password");
		
		System.out.println("FFirstName : "+FirstName);
        System.out.println("EEmail : "+Email);
        System.out.println("PPassword : "+Password);
        
        response.setContentType("text/html");// pdf audio video jpg html - MIME type

		PrintWriter out = response.getWriter();// IOException

		out.print("<html><body>");
	    // required
		
		