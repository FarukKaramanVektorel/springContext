package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSingleton {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring= new ClassPathXmlApplicationContext("beans.xml");
		
		
		
		spring.close();
		

	}

}
