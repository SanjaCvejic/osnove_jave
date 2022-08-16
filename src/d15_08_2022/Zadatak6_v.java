package d15_08_2022;

import java.util.Scanner;

public class Zadatak6_v {

	public static void main(String[] args) {
		// Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.

		//Primer izvrsenja: 
		//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
		//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
		// Napomena: Resiti bez koriscenja petlji. 
		
		Scanner s = new Scanner (System.in);
		System.out.println("Unesite brojeve M i N: ");

		celiBrojevi (s.nextInt(), s.nextInt());

	}
	
		public static void celiBrojevi (int a, int b) {
			int x = 0;
			if (a < b) {
				x = b - a - 1;
			} else if (a > b) {
				x = a - b - 1;
			}
			System.out.println("Izmedju brojeva M i N se nalazi ukupno: " + x + " celih brojeva.");
		}
}

