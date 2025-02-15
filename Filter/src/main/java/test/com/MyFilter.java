package test.com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/MyFilter")
public class MyFilter extends HttpFilter implements Filter {
       
   
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();  
	    out.print("filter is invoked before");  
		chain.doFilter(request, response);

	    out.print("filter is invoked after");  
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
