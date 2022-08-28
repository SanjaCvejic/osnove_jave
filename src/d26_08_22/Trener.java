package d26_08_22;

public class Trener extends Osoba{ 

/*		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
		godine iskustva
		tip trenera (kondicioni, za igru, pomocni, personalni)
		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru. */

	private int godineIskustva;
	private String tipTrenera;
	
	
	public Trener(int godineIskustva, String tipTrenera) {
		super();
		this.godineIskustva = godineIskustva;
		this.tipTrenera = tipTrenera;
	}



	public void stampajTrener () {
		stampaj();
		System.out.println("Godine iskustva trenera: " + this.godineIskustva);
		System.out.println("Tip trenera: " + this.tipTrenera);
	}
}
