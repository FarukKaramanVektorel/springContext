package spring;

public class Muzisyen {
	private Davul d;

	public Muzisyen(Davul d) {
		System.out.println("Müzisyen çalıştı");
		this.d = d;
	}

	public void playInstrument() {
		this.d.playInstrument();
	}
}
