package p15_08_2022;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int). 
		//1 - I
		//2 - II
		//3 - III
		//4 - IV
		//5 - V

		//Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
		//Ako se unese V vraca se 5.
		
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite rimski broj: ");
		String rimski = s.next();
		System.out.println("Arapski broj je: " + arapski (rimski));
	}

	public static int arapski(String broj) {
		if (broj.equals("I")) {
			return 1;
		} else if (broj.equals("II")) {
			return 2;
		} else if (broj.equals("III")) {
			return 3;
		} else if (broj.equals("IV")) {
			return 4;
		} else if (broj.equals("V")) {
			return 5;
		}
			return 0;
		
	}
}
