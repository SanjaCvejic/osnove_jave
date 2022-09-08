package d05_09_2022;

public class Menadzer extends Radnik {

//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		override-uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

	public Menadzer(String punoImeRadnika) {
		super(punoImeRadnika);
	}

	@Override
	public double plata() {
		double suma = 0.0;
		for (int i = 0; i < sektori.size(); i++) {
			suma += sektori.get(i).getPlataSektora();
		}
		return suma;
	}
}
