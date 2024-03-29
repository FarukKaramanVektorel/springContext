package spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Muzisyen {
	@Autowired
	private Davul davul;
	private Darbuka darbuka;
	private Baglama baglama;

	public Muzisyen() {
		// TODO Auto-generated constructor stub
	}

	public Muzisyen(Davul d, Baglama baglama) {
		System.out.println("Müzisyen çalıştı");
		this.davul = d;
		this.baglama = baglama;
	}

	public void playInstrument() {
		this.davul.playInstrument();
	}

	@Autowired
	public void setDarbuka(Darbuka darbuka) {
		System.out.println("Setter works");
		this.darbuka = darbuka;
	}

	public void setD(Davul d) {
		this.davul = d;
	}

	public void setBaglama(Baglama baglama) {
		this.baglama = baglama;
	}
}
