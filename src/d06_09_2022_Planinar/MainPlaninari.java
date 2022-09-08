package d06_09_2022_Planinar;

public class MainPlaninari {

	public static void main(String[] args) {
		// U glavnom programu kreirati jedan planinarski dom
		//i u njemu uÄ?laniti nekoliko rekreativnih planinara i
		//nekoliko alpinista (minimum po 3), i istestirati svaku od metoda. 
		
		PlaninarskiDom dom = new PlaninarskiDom("Planinarske duse", 1989);
		Planina Rtanj = new Planina("Rtanj", "Srbija", 1565);
		RekreativniPlaninar p1 = new RekreativniPlaninar("12345005", "Marko Markovic", 15, "Toplicki", 2000);
		RekreativniPlaninar p2 = new RekreativniPlaninar("12775005", "Mirko Mirkovic", 15, "Rasinski", 1500);
		RekreativniPlaninar p3 = new RekreativniPlaninar("13375005", "Marija Marinkovic", 20, "Nisavski", 2500);
		Alpinista a1 = new Alpinista("1", "Marija Petrovic", 39);
		Alpinista a2 = new Alpinista("8", "Janko Cvetkovic", 50);
		Alpinista a3 = new Alpinista("13", "Milica Zivkovic", 25);
		dom.dodajPlaninara(a3);
		dom.dodajPlaninara(a2);
		dom.dodajPlaninara(a1);
		dom.dodajPlaninara(p3);
		dom.dodajPlaninara(p2);
		dom.dodajPlaninara(p1);
		dom.stampaPlaninarskiDom();
		dom.izbaciPlaninara("8");
		dom.stampaPlaninarskiDom();
		dom.mesecniPrihodOdClanarina();
		System.out.println("Na Rtanj se uspesno penje: " + dom.brojUspesnihUspona(Rtanj) + " clanova Planinarskog doma");

		if (a2.uspesanUspon(Rtanj)) {
			System.out.println(a2.getPunoIme() + " se penje na Rtanj");
		}
		if (p3.uspesanUspon(Rtanj)) {
			System.out.println(p3.getPunoIme() + " se penje na Rtanj");
		}
		
	}

}
