package d06_09_2022_Ambalaza;

public class StaklenaAmbalaza extends Ambalaza {

//		Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//		kaucija za flasu
//		atribut koji kaze da li se za flasu placa kaucija
//		osnovna cena
//		gettere i setter za atribute
//		konstuktori koji su vam potrebni
//		racuna cenu
//		ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//		ako se ne placa, (osnovna cena) * 1.2
//		metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double kaucijaZaFlasu;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza(double kaucijaZaFlasu, boolean placaSeKaucija, double osnovnaCena) {
		super();
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public StaklenaAmbalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina,
			double kaucijaZaFlasu, boolean placaSeKaucija, double osnovnaCena) {
		super(barcode, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	public double cena() {
		if (this.placaSeKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}

	public void stampa() {
		System.out.println("Artikl - " + this.getNazivArtikla());
		System.out.println("Barcode " + this.getBarcode());
		System.out.println("Neto tezina - " + this.getNetoTezina());
		System.out.println("Bruto tezina - " + this.getBrutoTezina());
		System.out.println("Placa se kaucija - " + this.isPlacaSeKaucija());
		System.out.println("Cena kaucije - " + this.getKaucijaZaFlasu());
		System.out.println("Osnovna cena - " + this.getOsnovnaCena());
		System.out.println("Cena artikla je - " + this.cena());
	}
}
