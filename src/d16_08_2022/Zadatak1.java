package d16_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
// 		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//		i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone.
//		Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo,
		// a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: ako proizvod ima 1200 grama i pozovemo metodu sa
		// parametrom kg, metoda vraca 1.200
//		Primer: ako proizvod ima 12000 grama i pozovemo metodu sa
		// parametrom t, metoda vraca 0.012
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode

		Scanner s = new Scanner(System.in);

		Proizvod_1 Jedan = new Proizvod_1();
		Jedan.naziv = "Zlato";
		Jedan.cena = 1589;
		Jedan.tezinaG = 14798;

		Jedan.stampaj();
		System.out.println("Unesite kg ili t: ");
		String jedinica = s.next();
		System.out.println("Konvertovana tezina je: " + Jedan.konvertuj(jedinica) + jedinica);

		Proizvod_1 Dva = new Proizvod_1();
		Dva.naziv = "Srebro";
		Dva.cena = 579;
		Dva.tezinaG = 105050;
		
		Dva.stampaj();
		System.out.println("Unesite kg ili t: ");
		jedinica = s.next();
		System.out.println("Konvertovana tezina je: " + Dva.konvertuj(jedinica) + jedinica);
		

	}

}
