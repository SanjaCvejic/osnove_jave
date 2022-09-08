package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {

//			Kreirati abstraktnu klasu Radnik koja ima:
//			ime i prezime
//			niz sektora u kojima radi
//			abstraktnu metodu koja vraca platu radnika
//			metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

	protected String punoImeRadnika;
	protected ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public Radnik(String punoImeRadnika) {
		this.punoImeRadnika = punoImeRadnika;
	}

	public String getPunoImeRadnika() {
		return punoImeRadnika;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public void setPunoImeRadnika(String punoImeRadnika) {
		this.punoImeRadnika = punoImeRadnika;
	}

	public abstract double plata();

	public void zaposliRadnikaUSektor(Sektor sektorNovi) {
		sektori.add(sektorNovi);
	}
}
