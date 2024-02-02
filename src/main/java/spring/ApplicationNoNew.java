package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationNoNew {
	public static void main(String[] args) {
		//context
		ClassPathXmlApplicationContext spring= new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld d=spring.getBean(HelloWorld.class);
		//scope yaşam alanı
		SpringClass d2= (SpringClass) spring.getBean("springClass");
		SpringClass d3= (SpringClass) spring.getBean("springClass");
		if(d2==d3) {
			System.out.println("Aynı Nesne1");
		}else {
			System.out.println("Aynı  nesne değil1");
		}
		
		
		SpringClass2 d4= (SpringClass2) spring.getBean("springClass2");
		SpringClass2 d5= (SpringClass2) spring.getBean("springClass2");
		
		if(d4==d5) {
			System.out.println("Aynı Nesne2");
		}else {
			System.out.println("Aynı  nesne değil2");
		}
		
//		d.sayHello();
//		d2.sayHello();
		spring.close();
	}

}
