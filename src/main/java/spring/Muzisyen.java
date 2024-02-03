package spring;

public class Muzisyen {
	private Davul d;
	private Darbuka darbuka;
	private Baglama baglama;

	public Muzisyen(Davul d,Baglama baglama) {
		System.out.println("Müzisyen çalıştı");
		this.d = d;
		this.baglama=baglama;
	}

	public void playInstrument() {
		this.d.playInstrument();
	}
	public void setDarbuka(Darbuka darbuka) {
		System.out.println("Setter works");
		this.darbuka = darbuka;
	}
}
