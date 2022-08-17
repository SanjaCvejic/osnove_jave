package d16_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Kreirati klasu SmartAirConditioning koja ima:
		// atribut za marku klime (npr: Samsung, Galanz, Gree, …)
		// atribut za izabranu temperaturu
		// atribut za mod (hladi/greje) - string
		// metodu za stampu (proizvoljno)
		// metodu koja vraca informaciju da li je napolju veca
		// temperatura od one na koju je klima postavljena.
		// Metoda kao parametar prima temperaturu koja je napolju.

		// U glavnom programu kreirati minimum 2 objekta klase
		// SmartAirConditioning i za svaki od njih pozvati metode

		SmartAirConditioning_2 a = new SmartAirConditioning_2();
		Scanner s = new Scanner(System.in);
		a.marka = "Gree";
		a.temp = 31;
		a.mod = "greje";

		SmartAirConditioning_2 b = new SmartAirConditioning_2();
		b.marka = "Samsung";
		b.temp = 20;
		b.mod = "hladi";

		a.stampa();

		System.out.println("Unesite spoljasnju temp: ");
		int spoljasnja = s.nextInt();

		boolean razlika = a.razlikaUTempVeca(spoljasnja);
		if (razlika == true) {
			System.out.println("Spoljasnja temperatura je veca od izabrane.");
		} else {
			System.out.println("Spoljasnja temperatura nije veca od izabrane.");
		}

		b.stampa();

		System.out.println("Unesite spoljasnju temp: ");
		spoljasnja = s.nextInt();
		razlika = b.razlikaUTempVeca(spoljasnja);
		if (razlika == true) {
			System.out.println("Spoljasnja temperatura je veca od izabrane.");
		} else {
			System.out.println("Spoljasnja temperatura nije veca od izabrane.");
		}
	}
}
