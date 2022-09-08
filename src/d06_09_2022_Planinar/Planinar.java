package d06_09_2022_Planinar;

public abstract class Planinar {
	
//		(15 poena) Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 
//		jedinstveni celobrojni identifikacioni broj
//		ime i prezime 
//		Dok od javnih metoda: 
//		konstruktor koji postavlja sve atribute klase. 
//		gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//		apstraktnu metodu štampaj
//		apstraktnu metodu koja vraca clanarinu planinara
//		apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina. 
		
		protected String id;
		protected String punoIme;
		
		public Planinar(String id, String punoIme) {
			this.id = id;
			this.punoIme = punoIme;
		}
				
		public String getId() {
			return id;
		}

		public String getPunoIme() {
			return punoIme;
		}

		public abstract void stampaj ();
		
		public abstract int clanarinaPlaninara ();
		
		public abstract boolean uspesanUspon (Planina planinaUspon);
		
}
