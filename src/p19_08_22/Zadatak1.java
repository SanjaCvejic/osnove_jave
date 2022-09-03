package p19_08_22;

public class Zadatak1 {

	public static void main(String[] args) {
//			Za klasu Tacka, koja ima privatne atribute:
//			x - x koordinata
//			y - y koordinata
//			Javne metode:
//			metodu stampaj
//			imamo difoltni konstruktor
//			imamo konstuktor koji prima obe koordinate za kreiranje objekta
//			geter za x
//			geter za y
//			seter za x
//			seter za y
//
//			U glavnom programu kreirati dva objekta:
//			Jedan preko difoltnog konstuktora i postavite koordinate na 10 i 20
//			Drugi objekat preko konsuktora sa parametrima i postavite kooridnate na 30 i 40

		Tacka1 m = new Tacka1();
		m.setX(10);
		m.setY(20);
		m.print();

		Tacka1 n = new Tacka1(30, 40);
		n.print();

		System.out.println(m.getX() + " i " + m.getY());
		System.out.println(n.getX() + " i " + n.getY());
	}

}
