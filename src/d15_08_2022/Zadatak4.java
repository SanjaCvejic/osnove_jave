package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
			// Napisati metodu koja stampa podatke o korisniku u formatu:
			//JMBG: [jmbg]
			//Ime: [ime]
			//Prezime: [prezime]
			//God. rodjenja: [god]
			//Aktivan: [true/false]
			//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
			//Metoda nista ne vraca.

		data ("2007989777777", "Sanja", "Cvejic", 1989, true);

	}
	public static void data (String jmbg, String name, String lastName, int yearOfBirth, boolean active) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + name);
		System.out.println("Prezime: " + lastName);
		System.out.println("God. rodjenja: " + yearOfBirth);
		System.out.println("Aktivan: " + active);
		
	}
}
