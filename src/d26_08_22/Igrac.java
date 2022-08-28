package d26_08_22;

public class Igrac extends Osoba {
	
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int broj;
	private String pozicijaIgraca;
	private boolean kapiten;
	
	public Igrac(int broj, String pozicijaIgraca, boolean kapiten) {
		super();
		this.broj = broj;
		this.pozicijaIgraca = pozicijaIgraca;
		this.kapiten = kapiten;
	}
	
	public int getBroj() {
		return broj;
	}
	public void setBroj(int broj) {
		this.broj = broj;
	}
	public String getPozicijaIgraca() {
		return pozicijaIgraca;
	}
	public void setPozicijaIgraca(String pozicijaIgraca) {
		this.pozicijaIgraca = pozicijaIgraca;
	}
	public boolean getKapiten() {
		return kapiten;
	}
	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void stampajIgraca () {
		stampaj();
		System.out.println("Broj igraca: " + this.broj);
		System.out.print("Kapiten: ");
		if (this.kapiten == true) {
		System.out.println("da.");
	} else if (this.kapiten == false) {
		System.out.println("ne.");
	}
	
	}
}
