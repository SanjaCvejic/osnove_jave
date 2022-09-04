package MiniProjekat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite ime igraca X: ");
		System.out.println("Unesite prezime igraca X: ");
		Player x = new Player(s.next(), s.next());
		System.out.println("Unesite ime igraca O: ");
		System.out.println("Unesite prezime igraca O: ");
		Player o = new Player(s.next(), s.next());
		XandOGame igra = new XandOGame();
		igra.setPlayerX(x);
		igra.setPlayerO(o);

		igra.startGame();
		igra.printTablu();
		while (igra.isGameOver() == false && igra.isWinnerO() == false && igra.isWinnerX() == false) {

			System.out.println("Na redu je igrac: ");
			igra.getNextPlayer().printPlayer();
			System.out.println("Unesite polje na koje zelite da unesete vas znak: ");
			int polje = s.nextInt();

			if (igra.isValidMove(polje) == false) {
				System.out.println("Izabrano polje nije validno. Unesite validno polje: ");
				System.out.println();
				polje = s.nextInt();
			}

			if (igra.isFieldFree(polje) == false) {
				System.out.println("Izabrano polje nije validno. Unesite validno polje: ");
				System.out.println();
				polje = s.nextInt();
			}

			if (igra.isGameOver() == false && igra.isValidMove(polje) == true) {
				igra.makeAMove(polje);
				igra.playNext();
				igra.printTablu();
			}

			if (igra.isWinnerO() == true || igra.isWinnerX() == true) {
				System.out.println("Kraj igre.");
			}

		}

		igra.printGameScore();
		s.close();
	}
}
