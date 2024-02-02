package spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class SpringClass2 implements InitializingBean, DisposableBean{
	
	public SpringClass2() {
		System.out.println("SpringClass2 Constructer");
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
