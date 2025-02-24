package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("Application.xml");
		Institute in= (Institute)ctx.getBean("Ins");
		in.details();

	}

}
