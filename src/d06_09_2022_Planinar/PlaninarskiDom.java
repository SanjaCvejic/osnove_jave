package d06_09_2022_Planinar;

import java.util.ArrayList;

public class PlaninarskiDom {

//		(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//		naziv doma 
//		godinu kada je osnovan. 
//		�?lanove doma koji su planinari (klasa vodi ra�?una o nizu) 
//		Dok od javnih: 
//		default-ni konstuktor i konstuktor koji postavlja sve parametre 
//		gettere i settere koji su potrebni 
//		metodu u�?lani planinara, koja dodaje planinara u niz 
//		metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija) 
//		metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//		metodu koja štampa podatke o domu i o svim �?lanovima doma
//		metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

	private String nazivDoma;
	private int godinaOsnivanja;
	private ArrayList<Planinar> planinari = new ArrayList<Planinar>();

	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public ArrayList<Planinar> getPlaninari() {
		return planinari;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public void setGodinaOsnivanja(int godinaOsnivanja) {
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public void dodajPlaninara(Planinar noviPlaninar) {
		planinari.add(noviPlaninar);
	}

	public int brojUspesnihUspona(Planina planinaUspon) {
		int uspon = 0;
		for (int i = 0; i < planinari.size(); i++) {
			if (planinari.get(i).uspesanUspon(planinaUspon) == true) {
				uspon++;
			}
		}
		return uspon;
	}

	public void izbaciPlaninara(String idPlaninara) {
		for (int i = 0; i < planinari.size(); i++) {
			if (planinari.get(i).getId().equals(idPlaninara)) {
				planinari.remove(i);
			}
		}
	}

	public void stampaPlaninarskiDom() {
		System.out.println("Planinarski dom: " + this.nazivDoma + ", " + this.godinaOsnivanja);
		for (int i = 0; i < planinari.size(); i++) {
			System.out.print(" Ime planinara:" + this.planinari.get(i).getPunoIme());
			System.out.println(" Id: " + this.planinari.get(i).getId());
		}
		System.out.println("Mesecni prihod od clanarine je: " + this.mesecniPrihodOdClanarina());
	}

	public int mesecniPrihodOdClanarina() {
		int prihod = 0;
		for (int i = 0; i < planinari.size(); i++) {
			prihod += planinari.get(i).clanarinaPlaninara();
		}
		return prihod;
	}
}
