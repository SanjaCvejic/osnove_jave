package p15_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		// Napisati metodu koja proverava da li je trougao pravougli.
		// Metoda prima stranice trougla i hipotenuzu trougla.
		// Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
		// Trougao je pravougli ukoliko je a*a+b*b=c*c

		Scanner s = new Scanner(System.in);
		System.out.println("Unesite stranice trougla: ");
		boolean pravougli = provera(s.nextInt(), s.nextInt(), s.nextInt());
		if (pravougli == false) {
			System.out.print("Trougao nije pravougli.");
		} else {
			System.out.print("Trougao je pravougli.");
		}
		s.close();
	}

	public static boolean provera(int a, int b, int c) {
		if (a * a + b * b == c * c) {
			return true;
		} else {
			return false;
		}
	}
}
