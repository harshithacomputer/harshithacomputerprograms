package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");  
	      
	    EmployeeDAO dao=(EmployeeDAO)ctx.getBean("edao");  
//	   int status=dao.saveEmployee(new Employee(102,"Balaji","Balaji@gmail.com"));  
//	    System.out.println(status);                               
//	    System.out.println("Done.");
	    
//	    int status=dao.updateEmployee(new Employee(101,"Bhanu","Bhanu@gmail.com")); 
//		  System.out.println(status); 
		     
		          
		    Employee e=new Employee(); 
		  e.setId(101); 
		    int status=dao.deleteEmployee(e); 
		   System.out.println(status);  
		      
		}  


	}

