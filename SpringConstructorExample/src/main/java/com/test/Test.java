package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext cx=new ClassPathXmlApplicationContext("Context.xml");
	Employee e=(Employee)cx.getBean("emp");
	e.hello();

	}

}
