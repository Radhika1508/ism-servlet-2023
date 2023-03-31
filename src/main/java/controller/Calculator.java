package controller;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {

	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String option = req.getParameter("option");
		if (option.equals("ADD")) {
			System.out.println("Addition : " + (num1 + num2));
		} else if (option.equals("SUB")) {
			System.out.println("Substractiomn : " + (num1 - num2));
		} else if (option.equals("MUL")) {
			System.out.println("Multiplication : " + (num1 * num2));
		} else {
			System.out.println("Divisiom : " + (num1 / num2));
		}
	}
}
