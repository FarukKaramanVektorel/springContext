package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringClass implements InitializingBean, DisposableBean{
	public SpringClass() {
		System.out.println("SpringClass Constructer");
	}
	
	public void sayHello() {
		System.out.println("Hello World");
	}
	
	
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}

}
