package p15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva
		// prosledjena broja.
		// Brojevi su ulazni parametri funkcije.
		// U gravnom programu pozvati nekoliko puta funkciju sa razlicitim prosledjenim
		// vrednostima.

		rezultat(5, 8);

	}

	public static void rezultat(int a, int b) {

		int zbir = a + b;
		int razlika = a - b;
		int proizvod = a * b;
		int kolicnik = a / b;

		System.out.println("Zbir dva uneta broja je: " + zbir + ", razlika je: " + razlika + ".");
		System.out.println("Proizvod dva uneta broja je: " + proizvod + ", kolicnik je: " + kolicnik + ".");

	}

}
