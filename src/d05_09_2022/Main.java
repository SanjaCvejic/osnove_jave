package d05_09_2022;

public class Main {

	public static void main(String[] args) {

//	U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog
		
		Sektor magacin = new Sektor("magacin", 40000);
		Sektor proizvodnja = new Sektor("proizvodnja", 45000);
		Sektor bojacnica = new Sektor("bojacnica", 42000);
		Sektor konfekcija = new Sektor("konfekcija", 49000);
		Sektor programacija = new Sektor("programacija", 70000);
		Sektor kontrola = new Sektor("kontrola", 50000);
		Sektor nabavka = new Sektor("nabavka", 65000);
		Sektor racunovodstvo = new Sektor("racunovodstvo", 60000);
		Magacioner petar = new Magacioner("Petar Nikolic");
		petar.zaposliRadnikaUSektor(magacin);
		petar.zaposliRadnikaUSektor(konfekcija);
		petar.zaposliRadnikaUSektor(bojacnica);
		petar.zaposliRadnikaUSektor(proizvodnja);
		Menadzer milos = new Menadzer("Milos Milosevic");
		milos.zaposliRadnikaUSektor(racunovodstvo);
		milos.zaposliRadnikaUSektor(programacija);
		milos.zaposliRadnikaUSektor(kontrola);
		milos.zaposliRadnikaUSektor(nabavka);
		System.out.println("Magacioner " + petar.getPunoImeRadnika()+ " ima platu " + petar.plata() + " RSD.");
		System.out.println("Menadzer " + milos.getPunoImeRadnika()+ " ima platu " + milos.plata()+ " RSD.");
		
	}
}
