package d05_09_2022;

public class Magacioner extends Radnik {

//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		suma plata svih sektor / broj sektora * 0.5
//		override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	public Magacioner(String punoImeRadnika) {
		super(punoImeRadnika);
	}

	private double prosecnaPlata() {
		double suma = 0.0;
		int brojSektora = 0;
		for (int i = 0; i < sektori.size(); i++) {
			suma += sektori.get(i).getPlataSektora();
			System.out.println(sektori.get(i).getPlataSektora());
			brojSektora++;
		}
		return suma / brojSektora * 0.5;
	}

	@Override
	public double plata() {
		return prosecnaPlata() * sektori.size();
	}

}
