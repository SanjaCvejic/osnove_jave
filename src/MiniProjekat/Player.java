package MiniProjekat;

public class Player {

//		Kreirati klasu Player koja ima:
//		ime i prezime

	private String ime;
	private String prezime;

//		konstuktore

	public Player(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	public Player() {

	}

//		gettere i settere

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

//		metodu print, koja stampa ime i prezime igraca

	public void printPlayer() {
		System.out.println(this.ime + " " + this.prezime);
	}

}
