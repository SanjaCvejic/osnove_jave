package d06_09_2022_Ambalaza;

public class Tetrapak extends Ambalaza {
	
//		Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//		atribut koji kaze da li se moze reciklirati
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu tako da ispunjava uslova:
//		ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//		ako nije u cenu ulazi samo osnovna cena
//		metoda stampaj stampa sve podatke iz klase tetrapak

	private boolean mozeDaSeReciklira;
	private double osnovnaCena;
	
	public Tetrapak() {
		super();
	}

	public Tetrapak(String barcode, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeDaSeReciklira, double osnovnaCena) {
		super(barcode, nazivArtikla, netoTezina, brutoTezina);
		this.mozeDaSeReciklira = mozeDaSeReciklira;
		this.osnovnaCena = osnovnaCena;
	}

	public Tetrapak(boolean mozeDaSeReciklira, double osnovnaCena) {
		super();
		this.mozeDaSeReciklira = mozeDaSeReciklira;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isMozeDaSeReciklira() {
		return mozeDaSeReciklira;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setMozeDaSeReciklira(boolean mozeDaSeReciklira) {
		this.mozeDaSeReciklira = mozeDaSeReciklira;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public double cena() {
		if (this.mozeDaSeReciklira) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		}else {
			return this.osnovnaCena;
		}
	}
	

	public void stampa() {
		System.out.println("Artikl - "+ this.getNazivArtikla());
		System.out.println("Barcode " + this.getBarcode());
		System.out.println("Neto tezina - " + this.getNetoTezina());
		System.out.println("Bruto tezina - " + this.getBrutoTezina());
		System.out.println("Moze da se reciklira - " + this.isMozeDaSeReciklira());
		System.out.println("Osnovna cena - " + this.getOsnovnaCena());
		System.out.println("Cena artikla je - " + this.cena());
	}

}
