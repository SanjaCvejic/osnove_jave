package p16_i_18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
//		Kreirati klasu SlackMessage koja ima:
//		tekst poruke
//		ime i prezime osobe koja je stavila poruku
//		datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//		U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//		[ime i prezime osobe] - [kad je poslata]
//		[Tekst poruke]

		SlackMessage_2 a = new SlackMessage_2();
		a.posiljalac = "Milan Jovanovic";
		a.text = "Razbio si!";
		a.vreme = "15.08.2022. 19:53";

		SlackMessage_2 b = new SlackMessage_2();
		b.posiljalac = "Vlada Minic";
		b.text = "Puckica!";
		b.vreme = "05.09.2022. 17:23";

//		System.out.println(a.posiljalac + " - " + a.vreme);
//		System.out.println(a.text);
//
//		System.out.println(b.posiljalac + " - " + b.vreme);
//		System.out.println(b.text);

//		Dopunite klasu SlackMessage metodom za stampu koja stampa
//		podatke u formatu koji je naveden iznad i u mainu pozovite
//		metode nad objektima koje ste kreirali.

		a.stampaj();
		b.stampaj();

	}

}
