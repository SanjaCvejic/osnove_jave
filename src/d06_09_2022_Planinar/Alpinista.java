package d06_09_2022_Planinar;

public class Alpinista extends Planinar {

//		(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar.
//		Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost)
//		i poeni se mogu menjati.
//		Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom
//		za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu: 
//		Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 

	private int brojPoena;

	public Alpinista(String id, String punoIme, int brojPoena) {
	super(id, punoIme);
	this.brojPoena = brojPoena;
}

	public Alpinista(String id, String punoIme) {
		super(id, punoIme);
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id:" + this.id + " Ime: " + this.punoIme + " Broj poena: " + this.brojPoena);
	}

	@Override
	public int clanarinaPlaninara() {
		return 1500;
	}

	@Override
	public boolean uspesanUspon(Planina planinaUspon) {
		if (planinaUspon.getVisina() < 4000) {
			return true;
		} else {
			return false;
		}
	}
}
