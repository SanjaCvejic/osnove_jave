package d25_08_2022;

import java.util.ArrayList;

public class MainStudentIspit {

	public static void main(String[] args) {
	
	ArrayList <Ispit> ispiti = new ArrayList <Ispit> ();
	Student Marko = new Student("1234", "Marko Markovic", "master");
	Ispit i1 = new Ispit("ekonomija", 8, "Zorana Marinkovic");
	Ispit i2 = new Ispit("racunovodstvo", 10, "Miodrag Milenkovic");
	Ispit i3 = new Ispit("sociologija", 5, "Radica Petrovic");
	Marko.dodajIspit(i1);
	Marko.dodajIspit(i2);
	Marko.dodajIspit(i3);
	Marko.print();
	}

}
