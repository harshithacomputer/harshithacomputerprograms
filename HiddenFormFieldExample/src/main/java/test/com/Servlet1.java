package test.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");  
	        PrintWriter out = response.getWriter();  
	          
	        String n=request.getParameter("userName");  
	        out.print("Welcome "+n);  
	          
	        //creating form that have invisible textfield  
//	        out.print("<form action='servlet2'>");  
//	        out.print("<input type='hidden' name='uname' value='"+n+"'>"); 
//	        
//	        out.print("<input type='submit' value='go'>");  
//	        out.print("</form>");  
	     //   out.print("<a href='servlet2?uname="+n+"'>visit</a>"); 
	        HttpSession session=request.getSession();  
	        session.setAttribute("uname",n);  
	  
	        out.print("<a href='servlet2'>visit</a>");  
	        out.close();  
	        
	        
	       
	}
	}


