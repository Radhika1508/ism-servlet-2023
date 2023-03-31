package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUp extends HttpServlet{

	   @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		   System.out.println("Request Method calling..");
		String FirstName = req.getParameter("firstName");
		String Email = req.getParameter("email");
		String Password = req.getParameter("password");
		
		System.out.println("FFirstName : "+FirstName);
        System.out.println("EEmail : "+Email);
        System.out.println("PPassword : "+Password);
		
		
	}
	   
}
