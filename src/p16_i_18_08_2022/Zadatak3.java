package p16_i_18_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//		Kreirati klasu Auto koja ima:
//		ime i prezime vozaca
//		marku automobila
//		broj vrata
//		potrosnju na 100km (npr: 10)
//		trenutnu brzinu kojom se auto krece
//		metodu za stampu koja stampa podatke u formatu:
//		[Vozac]
//		[Marka] - [br vrata]-ro vrata
//		Sa potrosnjom od [potrosnja] l na 100km
//		[Trenutna brzina auta] km/h je trenutna brzina.

		Auto_3 auto = new Auto_3();
		auto.vozac = "Sanja Cvejic";
		auto.marka = "Audi";
		auto.brojVrata = 5;
		auto.potrosnja = 9.5;
		auto.brzina = 155.0;

		auto.stampa();

//		(Dopuna 1)
//		U okviru klase Auto, implementirati jos 2 metode:
//		metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//		Kao parametar metode se prima ogranicenje (kao broj) 
//		a metoda vraca true ili false ako je trenutna brzina veca od
//		ogranicenja.
//		metoda koja vraca visinu novcane kazne za prekoracenje,
//		za svaku jedinicu prekoracenja placa se 1000din.
//		Metoda od parametara prima ogranicenje brzine
//		U glavnom programu pozvati ove metode i
//		odstmpajte neke poruke na osnovu informacija
//		koje dobijete od njih.

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite dozvoljenu brzinu: ");
		double ogranicenje = s.nextDouble();
		if (auto.prekoracenje(ogranicenje) == true) {
			System.out.println("Desilo se prekoracenje");
			System.out.println("Kazna je " + auto.kazna(ogranicenje));
		} else {
			System.out.println("Prekoracenje se nije desilo");
		}

//		(Dopuna 2)
//		Dopuniti klasu Auto tako da ima:
//		atribut godinu proizvodnje
//		atribut mesec do kad je registrovan auto (int)
//		atribut kubikaza auta (npr: 1600 - 5000)
//		metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//		metodu koja vraca da li je istekla registracije. 
//		Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//		metodu koja racuna i vraca cenu registracije za auto. 
//		Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//		za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

		auto.godProizvodnje = 2017;
		auto.registracija = 7;
		auto.kubikaza = 2300;

		boolean oldtimer = auto.oldtimer();
		if (oldtimer == true) {
			System.out.println("Auto je oldtimer.");
		} else {
			System.out.println("Auto nije oldtimer.");
		}

		System.out.println("Unesite trenutni mesec - broj: ");
		int mesec = s.nextInt();
		boolean istekla = auto.isteklaReg(mesec);
		if (istekla == false) {
			System.out.println("Registracija nije istekla.");
		} else {
			System.out.println("Registracija je istekla.");
		}

		int iznos = auto.iznosRegistracije();
		System.out.println("Iznos registracije je: " + iznos);

//		(Dopuna 3)
//		Dopuniti klasu Auto tako da ima:
//		atribut broj registracije
//		da li je ukljucena klima u autu
//		metodu dodajGas, koja povecava trenutnu brzinu za 10.
//		metodu koci, koja smanjuje brzinu za 10. Brzina ne moze da ode ispod nule.
//		metodu koja racuna i vraca trenutnu potrosnju auta. Metoda racuna po formuli:
//		faktor klime - ako je ukljucena klima faktor je 1.2, ako nije ukljucena onda je 1.0
//		(trenutna brzina / 100.0 * potrosnja na 100km) * faktor klime

		auto.registracijaBroj = "ni-123-ni";
		auto.klima = true;

		auto.dodajGas();
		auto.stampa();
		auto.koci();
		auto.stampa();
		double potrosnja = auto.racunPotrosnje();
		System.out.println("Trenutna potrosnja auta iznosi: " + potrosnja);

//		Dopuniti klasu Auto tako da ima:
//		atribut za maksimalnu brzinu na auto (npr: 240)
//		Promenite metodu dodajGas tako da povecanje brzine ne bude preko maksimalne brzine auta
//		metodu stampajTablu koja stampa brzinomer sa table. Brzinomer uvek ima 100 jedinica za prikaz brzine.
//		Ako je npr maksimalna brzina 240 i auto je u trenutnoj brzini 100, metoda stampa 
//			               |||||||||||||||||||||||||||||||||||||||||..................................................................... 100/240km/h
//		(objasnjenje: ovde imamo 41 crticu koja oznacava brzinu 100km/h i imamo 59 tackica koje oznacavaju ostatak do maksimalne brzine)
//		Broj crtica se racuna po formuli: (trenutna brzina * 100) / maksimalna brzina.

		auto.maxBrzina = 240;

//		(Dopuna 5)
//		Dopuniti klasu Auto tako da ima:
//		kapacitet rezervoara
//		trenutnu kolicinu goriva u rezervoaru (u litrima)
//		metodu natoci gorivo, metoda prima kao parametar litrazu goriva koja se toci
//		a vraca novcanu vrednost goriva. Litar goriva je 170din. Vodite racuna da
//		trenutna kolicina goriva ne predje kapacitet rezervoara, takodje ukoliko se unese
//		kolicina koja prelazi kapacitet, tu kolicinu koja prelazi ne racunate u cenu.


		System.out.println("Stampa table: ");
		auto.stampajTablu();
		auto.kapacitetGoriva = 170;
		auto.trenutnaKolicinaGoriva = 60;
		System.out.println("Navedite kolicinu goriva koju zelite da natocite: ");
		double litraza = s.nextDouble();
		double racun = auto.natociGorivo(litraza);
		System.out.println("Vas racun u RSD iznosi: " + racun);
		s.close();
	}

}
