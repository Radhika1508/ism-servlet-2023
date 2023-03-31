package controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String option = request.getParameter("option");
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html><body>");
		
		
		if (option.equals("ADD")) {
			System.out.println("Addition : " + (num1 + num2));
			
			pw.print(num1+" + "+num2 + " = "+ (num1 + num2));
		} else if (option.equals("SUB")) {
			System.out.println("Substractiomn : " + (num1 - num2));
			pw.print(num1+" - "+num2 + " = "+ (num1 -num2));
		} else if (option.equals("MUL")) {
			System.out.println("Multiplication : " + (num1 * num2));
			pw.print(num1+" * "+num2 + " = "+ (num1 * num2));
		} else {
			System.out.println("Divisiom : " + (num1 / num2));
			pw.print(num1+" / "+num2 + " = "+ (num1 / num2));			
			
			
			pw.print("Enter No 1 :" + num1+"<br>");
			pw.print("Enter No 1 :" + num1+"<br>");
			pw.print("</html></body>");
			
		}
	}
}
