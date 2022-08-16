package d15_08_2022;

import java.util.Scanner;

public class Zadatak7_v {

	public static void main(String[] args) {
		// Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
		//U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		Scanner s = new Scanner (System.in);

		System.out.println("Unesite tri broja, nakon svakog ENTER");

		int najmanji = najmanjiBroj(s.nextInt(), s.nextInt(), s.nextInt());
		System.out.println("Najmanji broj od unetih je: " + najmanji);
	}

	public static int najmanjiBroj(int a, int b, int c) {
		if (a < b && a < c) {
			return a;
		} else if (b < a && b < c) {
			return b;
		} else if (c < a && c < b) {
			return c;
		}
			return 0;
	}
}
