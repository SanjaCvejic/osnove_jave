package p15_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		// Napisati metodu stampajApsolutnuVrednost,
		//koja stampa apsolutnu vrednost
		// prosledjene vrednosti.

		stampajApsolutnuVrednost(5);
	}

	public static void stampajApsolutnuVrednost(int a) {

		if (a < 0) {
			a = -a;
		}

		System.out.println("Apsolutna vrednost unetog broja je " + a + ".");
	}
	
	}

