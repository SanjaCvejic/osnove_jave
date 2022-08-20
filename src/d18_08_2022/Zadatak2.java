package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
//		Kreirati klasu FacebookPost koja ima:
//		Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post
//		(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude
//		manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.

		FacebookPost_2 post1 = new FacebookPost_2 ();
		post1.NamePost = "Mihajlo Obradovic";
		post1.NameWall = "Marija Marjanovic";
		post1.text = "<youtube link>";
		post1.NumbersOfLikes = 5;
		post1.NumbersOfShares = 1;
		
		post1.like();
		post1.dislike();
		post1.sharePlus();
		post1.print();
		
		FacebookPost_2 post2 = new FacebookPost_2 ();
		post2.NamePost = "Marija Marjanovic";
		post2.NameWall = "Hej, potpisi peticiju, na linku su detalji: link.";
		post2.text = "Veliko hvala za prijateljstvo.";
		post2.NumbersOfLikes = 1;
		post2.NumbersOfShares = 11;
		
		post2.like();
		post2.dislike();
		post2.sharePlus();
		post2.print();
		
	}

}
