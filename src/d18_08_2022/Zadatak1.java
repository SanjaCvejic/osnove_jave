package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//			i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//		Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//		a povratnu vrednost je cena proizvoda kada se uračuna popust.
//		Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//		Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		za tezinu do 100g, postarina iznosi 200din
//		za tezinu od 101g do 500g, postarina iznosi 400din
//		za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		Proizvod_1 a = new Proizvod_1 ();
		a.name = "Jakna";
		a.price = 12589.0;
		a.weight = 1590.7;
		
		Proizvod_1 b = new Proizvod_1 ();
		b.name = "Cizme";
		b.price = 11596.5;
		b.weight = 456.3;
		
		a.print();
		b.print();
		
		a.upPrice(3589);
		System.out.println("Nova cena proizvoda " + a.name + " je " + a.price);
		
		b.upPrice(2483);
		System.out.println("Nova cena proizvoda " + b.name + " je " + b.price);
		
		System.out.println(a.discountPrice(13));
		System.out.println(b.discountPrice(48));
		
		System.out.println("Postarina za proizvod " + a.name + " iznosi : " + a.shippingFee() + "RSD.");
		System.out.println("Postarina za proizvod " + b.name + " iznosi : " + b.shippingFee() + "RSD.");
	}

}
