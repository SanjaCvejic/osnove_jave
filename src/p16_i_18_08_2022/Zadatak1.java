package p16_i_18_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
// 		Kreirati klasu Racun koja ima
//		broj racuna (npr: 840-23932-323)
//		ime i prezime vlasnika
//		stanje na racunu
//		U mainu kreirati minimum dva racuna sa pratecim podacima
//		i ostampati podatke za svaki objekat.

		Racun_1 r = new Racun_1 ();
		r.brojRacuna ="888-879-8879";
		r.imeIPrezimeVlasnika = "Sanja Cvejic";
		r.stanjeNaRacunu = 789998.55;
		
		System.out.println("Broj racuna: " + r.brojRacuna);
		System.out.println("Ime i prezime " + r.imeIPrezimeVlasnika);
		System.out.println("Stanje na racunu: " + r.stanjeNaRacunu);
		
		
		Racun_1 t = new Racun_1 ();
		t.brojRacuna = "456-9854-4549";
		t.imeIPrezimeVlasnika = "Milovan Ilic";
		t.stanjeNaRacunu = 5656559.0;
		
		System.out.println("Broj racuna: " + t.brojRacuna);
		System.out.println("Ime i prezime " + t.imeIPrezimeVlasnika);
		System.out.println("Stanje na racunu: " + t.stanjeNaRacunu);
		
//		Primer izvrsenja:
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//		Primalac: Marko Markovic, 840-23932-334, stanje: 200
//		Unesite sumu za transakciju: 500
//		Stanje nakon stransakcije
//		Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//		Primalac: Marko Markovic, 840-23932-334, stanje: 700
		
		Scanner s = new Scanner (System.in);
				
		System.out.println("Posiljilac: " + r.imeIPrezimeVlasnika + " , " + r.brojRacuna + " , stanje: " + r.stanjeNaRacunu);
		System.out.println("Primalac: " + t.imeIPrezimeVlasnika + " , " + t.brojRacuna + " , stanje: " + t.stanjeNaRacunu);
		System.out.println("Unesite iznos za transakciju: ");
		double iznos = s.nextDouble();
		System.out.println("Stanje nakon transakcije");
		r.stanjeNaRacunu = r.stanjeNaRacunu - iznos;
		t.stanjeNaRacunu = t.stanjeNaRacunu + iznos;
		System.out.println("Posiljilac: " + r.imeIPrezimeVlasnika + " , " + r.brojRacuna + " , stanje: " + r.stanjeNaRacunu);
		System.out.println("Primalac: " + t.imeIPrezimeVlasnika + " , " + t.brojRacuna + " , stanje: " + t.stanjeNaRacunu);
		s.close();
	}
}
