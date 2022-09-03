package p19_08_22;

public class Zadatak2 {

	public static void main(String[] args) {
//			Kreirati klasu Radnik koja ima:
//			jmbg radnika
//			ime i prezime
//			broj dece (1,2,3,... ili 0 ako nema dece)
//			stepen strucne spreme (od 1 do 8)
//			godine radnog staza
//			konstuktor koji postavlja samo jmbg
//			konstuktor koji postavlja sve atribute
//			getere i setere
//			metodu koja racuna i vraca minuli rad(Ima ispod kako se racuna)
//			metodu koja vraca koeficijent slozenosti (Ima ispod kako se racuna)
//			metodu koja racuna platu radnika, plata se racuna po formuli:
//			25000 + (koeficijent slozenosti + minuli rad) * 10000
//			metodu koja vraca da li je zaposleni kreditno sposoban. (Kreditno je sposoban ako je plata veca od 50 000)

//			Minuli rad - zarada zaposlenog uvećava se za svaku započetu godinu radnog staža:
//			- do 10 godina 0.05
//			- od 10-20 godina 0.075
//			- preko 20 godina 0.1

//			Koeficijent slozenosti
//			- (I stepen) Nekvalifikan radnik, koeficijent: 1,03;
//			- (II stepen) Osnovno obrazovanje, koeficijent: 1,65;
//			- (III stepen) Srednje obrazovanje u trajanju od dvije do tri god., koeficijent: 2,00;
//			- (IV stepen) Kvalifikacija srednjeg opšteg i stručnog obrazovanja, koeficijent: 2,27;
//			- (V stepen) Kvalifikacija višeg stručnog obrazovanja, koeficijent: 2,88;
//			- (VI stepen) Visoko obrazovanje, koeficijent: 3,09;
//			- (VII stepen) Fakultetsko, odnosno visoko obrazovanje - Bechelor, koeficijent: 3,40;
//			- (VIII stepen) Doktorat nauka, koeficijent: 4,12.

		Radnik2 r = new Radnik2("1257897899", "Marina Zdravkovic", 4, 7, 5);
		Radnik2 p = new Radnik2("123456789", "Marko Markovic", 99, 4, 0);
		System.out.print("Radnik: " + r.getImeIPrezime());
		boolean kreditnaSposob = r.kreditnaSposobnost();
		if (kreditnaSposob == true) {
			System.out.println(" je kreditno sposoban/na.");
		} else {
			System.out.println(" nije kreditno sposoban/na.");
		}
		double plata = r.plata();
		System.out.println("Iznos plate je: " + plata);
		
		System.out.print("Radnik: " + p.getImeIPrezime());
		boolean kreditnaSposobn = p.kreditnaSposobnost();
		if (kreditnaSposobn == true) {
			System.out.println(" je kreditno sposoban/na.");
		} else {
			System.out.println(" nije kreditno sposoban/na.");
		}
		double plataP = p.plata();
		System.out.println("Iznos plate je: " + plataP);

	}

}
