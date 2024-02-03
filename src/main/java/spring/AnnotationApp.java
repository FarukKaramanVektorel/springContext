package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext spring=new AnnotationConfigApplicationContext();
		spring.register(Beans.class);
		spring.refresh();
		Muzisyen m=spring.getBean(Muzisyen.class);
		m.playInstrument();
		spring.close();
	}

}
