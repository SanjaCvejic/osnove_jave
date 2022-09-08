package d06_09_2022_Ambalaza;

public abstract class Ambalaza {

//		Kreirati abstraktnu klasu Ambalaza koja ima:
//		barkod (primer: 328232-2823)
//		naziv artikla
//		neto tezinu
//		bruto tezinu
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere
//		metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//		abstraktnu metodu koja vraca cenu artikla
//		abstraktnu metodu stampaj

	protected String barcode;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;

	public Ambalaza() {

	}

	public Ambalaza(String barcode, String nazivArtikla, double netoTezina, double brutoTezina) {
		this.barcode = barcode;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public void setNazivArtikla(String nazivArtikla) {
		this.nazivArtikla = nazivArtikla;
	}

	public void setNetoTezina(double netoTezina) {
		this.netoTezina = netoTezina;
	}

	public void setBrutoTezina(double brutoTezina) {
		this.brutoTezina = brutoTezina;
	}

	public double tezinaPakovanja() {
		return this.brutoTezina - this.netoTezina;
	}

	public abstract double cena();

	public abstract void stampa();

}
