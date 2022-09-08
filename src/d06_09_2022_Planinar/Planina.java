package d06_09_2022_Planinar;

public class Planina {

//		(10 poena) Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//		ime planine 
//		naziv države u kojoj se nalazi 
//		visinu planine. 
//		a od javnih metoda: 
//		default-ni konstruktor i konstuktor koji postavlja sve parametre 
//		gettere i settere za sve atribute 

	protected String imePlanine;
	protected String nazivDrzave;
	protected int visina;

	public Planina() {

	}

	public Planina(String imePlanine, String nazivDrzave, int visina) {
		this.imePlanine = imePlanine;
		this.nazivDrzave = nazivDrzave;
		this.visina = visina;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public String getNazivDrzave() {
		return nazivDrzave;
	}

	public int getVisina() {
		return visina;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public void setNazivDrzave(String nazivDrzave) {
		this.nazivDrzave = nazivDrzave;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

}
