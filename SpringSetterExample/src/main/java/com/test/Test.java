package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cx= new ClassPathXmlApplicationContext("bean.xml");
		Student s=cx.getBean("stu",Student.class);
		s.disp();
		Student s1=cx.getBean("stu1",Student.class);
		s1.disp();
		

	}

}
