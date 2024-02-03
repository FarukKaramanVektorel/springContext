package spring;

public class ConstructorArgs {
	
private String name;
private String surname;
private String adress;
	
	
	public ConstructorArgs(String name, String surname) {
		this.name=name;
		this.surname=surname;
		System.out.println("ConstructorArgs "+name+" "+surname);
	}
	public void setAdress(String address) {
		System.out.println("setter works");
		this.adress = adress;
	}
	public void sayHello() {
		System.out.println("Hello "+adress);
	}
	public void destroy() {
		System.out.println("Destroy");
	}
	
	public void init() {
		System.out.println("init");
	}
	

}
