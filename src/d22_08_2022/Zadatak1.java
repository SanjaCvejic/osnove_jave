package d22_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

		
		Autor jedanA = new Autor ("Andzej", "Sapkovski");
		Autor dvaA = new Autor ("Gijom", "Muso");
		Autor triA = new Autor ("Las", "Kepler");
		Knjiga knjigaA = new Knjiga("1234567891011", "Poslednja zelja", 1993, jedanA);
		Knjiga knjigaB = new Knjiga("4495659559", "Stan u Parizu", 2017, dvaA);
		Knjiga knjigaC = new Knjiga("78965412365", "Kosmar", 2012, triA);
		knjigaA.printK();
		knjigaB.printK();
		knjigaC.printK();

	}

}
