package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MuzisyenApp {

	public static void main(String[] args) {
ClassPathXmlApplicationContext spring= new ClassPathXmlApplicationContext("beans.xml");
		
		ConstructorArgs c=(ConstructorArgs) spring.getBean(ConstructorArgs.class);
		Muzisyen m=spring.getBean(Muzisyen.class);
		
		spring.close();

	}

}
