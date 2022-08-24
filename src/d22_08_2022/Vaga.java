package d22_08_2022;

public class Vaga {
private String mernaJedinica;
private Proizvod proizvod;

public Vaga () {
	
}

public String getMernaJedinica() {
	return mernaJedinica;
}

public void setMernaJedinica(String mernaJedinica) {
	this.mernaJedinica = mernaJedinica;
}

public Proizvod getProizvod() {
	return proizvod;
}

public void setProizvod(Proizvod proizvod) {
	this.proizvod = proizvod;
}

public double sracunajCenu (double tezina) {
	if (mernaJedinica.equals("lb")) {
		return tezina * proizvod.getCenaLb();
	} else {
		return tezina * proizvod.getCenaKg();
	}
}
	public void printRacun (double tezina) {
		proizvod.printProizvod();
		if (mernaJedinica.equals("lb")) {
	System.out.print("(" + proizvod.getCenaLb() + ") (");
	} else {
		System.out.print("(" + proizvod.getCenaKg() + ") (");
	}
		System.out.println(this.mernaJedinica + ") x (" + tezina + ")");
		System.out.println("Ukupno: " + this.sracunajCenu(tezina));
	}
		
//	Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu 
//(tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//			(sifra) - (naziv)
//			 (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//			 Ukupno: (ukupna cena) 	  
}
