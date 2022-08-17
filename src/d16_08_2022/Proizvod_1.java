package d16_08_2022;

public class Proizvod_1 {
	public String naziv;
	public double cena;
	public double tezinaG;
	
	public void stampaj ( ) {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}} , {{" + this.tezinaG + "}}");
	}
	
	public double konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			return this.tezinaG / 1000;
		} else {
			return this.tezinaG /1000000;
		}
	}
}
