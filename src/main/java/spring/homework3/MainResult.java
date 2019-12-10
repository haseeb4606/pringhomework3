package spring.homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainResult {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("spring3.xml");
		//Phone ph = (Phone) apc.getBean("ph");
		
		Person prs = (Person) apc.getBean("prson");
		
		prs.myInfo();
		

		
		
	}

}
