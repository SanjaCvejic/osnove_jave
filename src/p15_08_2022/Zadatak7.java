package p15_08_2022;

public class Zadatak7 {

	public static void main(String[] args) {
		// Napisati metodu koja vraca suprotno negativni broj od prosledjenog. Metoda
		// prima broj N i vraca ga sa negativnom vrednoscu.
		// Primer: Ako se metoda pozove za N=10, vraca -10
		// Ako se metoda pozove za N=-11, vraca 11

		int broj = negativniBroj(5);
		System.out.println(broj);
	}

	public static int negativniBroj(int broj) {
		return -broj;
	}
	
}
