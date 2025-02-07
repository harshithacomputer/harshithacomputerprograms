package test.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String firstName =request.getParameter("fname");
		String lastName =request.getParameter("lname");
		String password =request.getParameter("pwd");
		if(firstName.equals("core") && lastName.equals("java")&& password.equals("1234"))
		{
			out.println("Register Successfully......");
		}
		else
		{
			out.println("Register failed due to bad credentials....");
		}
		
	}}
