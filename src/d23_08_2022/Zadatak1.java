package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

import p23_08_2022.Sastojak;

public class Zadatak1 {

	public static void main(String[] args) {

//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//					(naziv predmeta) - (ocena)
//					Student: ime i prezime, broj indeksa
//					Profesor: ime i prezime
//
//				U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite N: ");
		int n = s.nextInt();
		ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite ime i prezime studenta: ");
			String imeIPrezimeStudenta = s.next();
			System.out.println("Unesite broj indeksa: ");
			String brIndeksa = s.next();
			System.out.println("Unesite naziv predmeta: ");
			String nazivPredmeta = s.next();
			System.out.println("Unesite ime i prezime profesora: ");
			String imeIPrezimeProfesora = s.next();
			System.out.println("Unesite ocenu - od 5 do 10: ");
			int ocena = s.nextInt();
			ZeleniKarton zK = new ZeleniKarton(imeIPrezimeStudenta, brIndeksa, nazivPredmeta, imeIPrezimeProfesora, ocena);
			zeleniKartoni.add(zK);
		}

		for (int i = 0; i < zeleniKartoni.size(); i++) {
			zeleniKartoni.get(i).stampaj();
		}
		
		
	
	}
}
