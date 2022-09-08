package d06_09_2022_Planinar;

public class RekreativniPlaninar extends Planinar {

//		(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar.
//		Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon
//		postavljanja u konstuktoru: 
//		težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//		naziv okruga odakle je rekreativni planinar. 
//		maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//		da li će rekreativni planinar uspešno popeti na planinu zavisi
//		da li je njegov najveći uspon manji od visine planine,
//		s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme
//		koji nosi može da pređe 50 metara manje. 
//		rekeativci placaju clanarinu u iznosu od 1000 rsd
//		metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//		Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 

	private int tezinaOpreme;
	private String okrugPlaninara;
	private int maksimalanUspon;
	
	public RekreativniPlaninar(String id, String punoIme) {
		super(id, punoIme);
	}

	public RekreativniPlaninar(String id, String punoIme, int tezinaOpreme, String okrugPlaninara,
			int maksimalanUspon) {
		super(id, punoIme);
		this.tezinaOpreme = tezinaOpreme;
		this.okrugPlaninara = okrugPlaninara;
		this.maksimalanUspon = maksimalanUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getOkrugPlaninara() {
		return okrugPlaninara;
	}

	public int getMaksimalanUspon() {
		return maksimalanUspon;
	}

	@Override
	public void stampaj () {
		System.out.println("Rekreativac, id:" + this.id + " Ime: " + this.punoIme +" Okrug: " + this.okrugPlaninara);
	}
	
	@Override
	public int clanarinaPlaninara () {
		return 1000;
	}
	
	@Override
	public boolean uspesanUspon (Planina planinaUspon) {
		int uspon = this.maksimalanUspon - this.tezinaOpreme*50;
		if (uspon > planinaUspon.getVisina()) {
			return true;
		}else {
			return false;
		}
		
	}
}
