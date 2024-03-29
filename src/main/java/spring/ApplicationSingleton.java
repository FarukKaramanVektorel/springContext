package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationSingleton {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext spring= new ClassPathXmlApplicationContext("beans.xml");
		
		ConstructorArgs c=(ConstructorArgs) spring.getBean(ConstructorArgs.class);
		c.sayHello();
		
		spring.close();
		

	}

}
