package d06_09_2022_Ambalaza;

public class MainAmbalaza {

	public static void main(String[] args) {
	
//		U glavnom programu kreirati jednu Korpu i u nju dodati
//		nekoliko Ambalaza razlicitih tipova i istestirati sve metode i
//		ispisati ukupnu cenu sa popustom.
		
		SuperKartica karticaS = new SuperKartica("12345", "Markovic Marko", 300);
		StaklenaAmbalaza sa = new StaklenaAmbalaza("100-200-005-800", "sok", 1.4, 1.55, 30, true, 100);
		StaklenaAmbalaza sa1 = new StaklenaAmbalaza("100-200-444-808", "kissela voda", 0.3, 0.48, 10, false, 110);
		Tetrapak t = new Tetrapak("100-002-777-400-666", "Vocni sok", 1.4, 1.55, true, 100);
		Tetrapak t1 = new Tetrapak("100-002-050-400-666", "mleko", 1.7, 1.79, false, 300);
		sa.stampa();
		sa1.stampa();
		t.stampa();
		t1.stampa();
		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(sa1);
		korpa.dodajAmbalazu(sa);
		korpa.dodajAmbalazu(t);
		korpa.dodajAmbalazu(t1);
		korpa.izbaciAmbalazu("100-002-050-400-666");
		System.out.println("Ukupna cena proizvoda u korpi: " + korpa.cenaKorpe(karticaS) );
		}
		
	}

