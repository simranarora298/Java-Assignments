package spring.question2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("question2_bean.xml");
		Question ques = (Question) context.getBean("question");
		System.out.println(ques);
	}

}
