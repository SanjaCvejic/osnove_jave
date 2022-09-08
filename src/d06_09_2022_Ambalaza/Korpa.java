package d06_09_2022_Ambalaza;

import java.util.ArrayList;

public class Korpa {
	
//		Kreirati klasu Korpa koja ima:
//		niz ambalaza
//		metodu dodaj ambalazu
//		metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//		privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//		metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima Super karticu iz koje se cita popust.

	private ArrayList <Ambalaza> niz = new ArrayList <Ambalaza> ();

	public ArrayList<Ambalaza> getNiz() {
		return niz;
	}
	
	public void dodajAmbalazu (Ambalaza ubaciA) {
		niz.add(ubaciA);
	}
	
	public void izbaciAmbalazu (String barkod) {
		for (int i = 0; i < niz.size(); i ++) {
			if (niz.get(i).getBarcode().equals(barkod)) {
				niz.remove(i);
			}
		}
	}
	
	private double cenaSaPopustom (int popust) {
		int suma = 0;
		for (int i = 0; i < niz.size(); i ++) {
			suma += niz.get(i).cena();
			}
		return suma;
		}
	
	public double cenaKorpe (SuperKartica karticaS) {
		return cenaSaPopustom(karticaS.getPopust());
	}
}
