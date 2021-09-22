package spring.question1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
	
		ApplicationContext context = new ClassPathXmlApplicationContext("question1_bean.xml");
		Customer customer=(Customer) context.getBean("customer");
		System.out.println(customer);
		
	}

}
