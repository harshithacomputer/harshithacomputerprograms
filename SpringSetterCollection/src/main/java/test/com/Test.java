package test.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
//		Resource r= new ClassPathResource("Bean.xml");
//		BeanFactory b= new XmlBeanFactory(r);
		ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
		Company c1=(Company)c.getBean("cmp");
		c1.disply();

	}

}
