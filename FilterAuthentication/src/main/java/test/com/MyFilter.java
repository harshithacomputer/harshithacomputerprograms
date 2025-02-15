package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;


@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
    
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 PrintWriter out=response.getWriter();  
         
		    String password=request.getParameter("password");  
		    if(password.equals("admin")){  
		chain.doFilter(request, response);
		    }  
		    else{  
		   out.print("username or password error!");  
		    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
		    rd.include(request, response);  
		    }  
		          
		}  
	

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
