package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
	
	@Bean
	public  Darbuka darbuka() {
		return new Darbuka();
	}
	@Bean
	public Davul davul() {
		return new Davul();
	}
	//@Bean(initMethod = "init", destroyMethod = "destroy")
	@Bean
	@Scope(value="prototype")
	@Lazy
	public Muzisyen muzisyen() {
		Muzisyen m=new Muzisyen();
		m.setDarbuka(darbuka());
		m.setD(davul());
		return m;
	}

}
