package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		String n=request.getParameter("userName");
		out.println("Welcome :"+n);
		Cookie ck=new Cookie("uname",n);//create cookie object
		response.addCookie(ck);//adding cookie in the response
		out.println("<form action='servlet2'method='post'>");
		out.println("<input type='submit' value='login'>");
		out.println("</form");
		out.close();
		
	}
	

}
