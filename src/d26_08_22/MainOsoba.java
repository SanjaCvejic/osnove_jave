package d26_08_22;

import java.util.ArrayList;
import java.util.Scanner;

public class MainOsoba {

	public static void main(String[] args) {
		// U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		
		Igrac m = new Igrac(1, "napadac", true);
		m.setImeIPrezime("Stefan Stefanovic");
		m.setGodinaRodjenja(1995);
		m.setJmbg("1236479");
		Igrac n = new Igrac(4, "odbrana", false);
		n.setImeIPrezime("Nikola Nikolic");
		n.setJmbg("456985");
		n.setGodinaRodjenja(2000);
		Trener o = new Trener(4, "kondicioni");
		o.setGodinaRodjenja(1987);
		o.setImeIPrezime("Mario Markovic");
		o.setJmbg("123456");
		Trener p = new Trener(3, "za igru");
		p.setGodinaRodjenja(1991);
		p.setImeIPrezime("Milos Nikolic");
		p.setJmbg("789456");

		m.stampajIgraca();
		n.stampajIgraca();
		o.stampajTrener();
		p.stampajTrener();
		
	}

}
