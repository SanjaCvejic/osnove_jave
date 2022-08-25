package d23_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
	//Naravno u glavnom kreirati objekte i testirati funkcionalnosti 
	
	Scanner s = new Scanner (System.in);
	
	Racun posiljalac = new Racun("200-159789-25", "Leskovcani", 1234567);
	Racun primalac = new Racun ("155-1478964-33", "JK", 1000);
	
	Transakcija prvaT = new Transakcija(123456, posiljalac, primalac);
	System.out.println("Pre transakcije: ");
	posiljalac.print();
	primalac.print();
	System.out.println("Unesite iznos za prenos: ");
	double prenosT = s.nextDouble();
	prvaT.izvrsiTransakciju(prenosT);
	prvaT.print();
	}

	
	
}
