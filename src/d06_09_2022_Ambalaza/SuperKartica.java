package d06_09_2022_Ambalaza;

public class SuperKartica {
	
//		Kreirati klasu SuperKartica koja ima:
//		broj kartice
//		ime i prezime vlasnika
//		popust (200, 500, … )
//		konstuktore (default-ni i sa parametrima)
//		gettere i settere 
//		metodu stampaj koja stampa karticu u formatu:
//		(broj kartice), (ime i prezime)
	
	private String brojKartice;
	private String punoIme;
	private int popust;
	
	public SuperKartica () {
		
	}
	
	public SuperKartica(String brojKartice, String punoIme, int popust) {
		this.brojKartice = brojKartice;
		this.punoIme = punoIme;
		this.popust = popust;
	}
	
	public String getBrojKartice() {
		return brojKartice;
	}
	public String getPunoIme() {
		return punoIme;
	}
	
	public int getPopust() {
		return popust;
	}
	
	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void stampa () {
		System.out.println(this.brojKartice + ", " + this.punoIme + ", popust - "+ this.popust);
	}
	


}
