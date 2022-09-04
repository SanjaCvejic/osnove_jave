package MiniProjekat;

import java.util.ArrayList;

public class XandOGame {

//		Kreirati klasu XandOGame koja ima:
//		table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//		nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//		playerX - igrac X
//		playerO - igrac O

	private ArrayList<String> table = new ArrayList<String>();
	private Player nextPlayer;
	private Player playerX;
	private Player playerO;

//		Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “

	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			table.add(" ");
		}
	}

//		Kontuktor koji prima dva parametra, igraca x i igraca o 
//		i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca

	public XandOGame(Player playerX, Player playerO) {
		this.playerX = playerX;
		this.playerO = playerO;
		table.add(" ");
	}

//		gettere i settere za igrace

	public Player getPlayerX() {
		return playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public Player getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(Player nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

//		Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//		x | x | 0 |
//		0 | x | 0 |
//		x | 0 | x |

	public void printTablu() {
		for (int i = 0; i < table.size(); i++) {
			if ((i + 1) % 3 == 0) {
				System.out.println(this.table.get(i) + " I ");
			} else {
				System.out.print(this.table.get(i) + " I ");
			}
		}
		System.out.println();
	}
//
//		Metodu startGame, metoda postavlja sve elemente niza na
//		prazan string “ “ i zatim postavlja da je na redu igrac X.

	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, " ");
		}
		this.setNextPlayer(this.playerX);
	}

//		Metodu isGameOver, igra je gotova ako su sva polja popunjena.

	public boolean isGameOver() {

		if (this.isWinnerO() == true || this.isWinnerO() == true) {
			return true;
		}
		for (int i = 0; i < table.size(); i++) {
			if (this.table.get(i).equals(" ")) {
				return false;
			} else {
				return false;
			}
		}
		return true;
	}

//		Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o

	public boolean isFieldFree(int polje) {
		if (this.table.get(polje).equals(" ")) {
			System.out.println("Trazeno polje je slobodno");
			return true;
		} else {
			System.out.println("You enter invalid position.");
			return false;
		}
	}

//		Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto

	public void playNext() {
		if (this.nextPlayer == this.playerO) {
			this.nextPlayer = this.playerX;
		} else {
			this.nextPlayer = this.playerO;
		}
	}

//		Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//		Ako je trenutno stanje u igri i sledeci na redu je igrac x
//		x | x | 0 |
//		0 |   |   |
//		x |   |   |
//		I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//		x | x | 0 |
//		0 |   | x |
//		x |   |   |

	public void makeAMove(int polje) {
		if (this.isFieldFree(polje) == true) {
			if (this.getNextPlayer() == playerX) {
				this.table.set(polje, "x");
			} else if (this.getNextPlayer() == this.playerO) {
				this.table.set(polje, "o");
			}
		}
	}

//		Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama

	public boolean isWinnerX() {
		if (this.table.get(0).equals("x") && this.table.get(2).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(0).equals("x") && this.table.get(1).equals("x") && this.table.get(2).equals("x")) {
			return true;
		} else if (this.table.get(3).equals("x") && this.table.get(4).equals("x") && this.table.get(5).equals("x")) {
			return true;
		} else if (this.table.get(6).equals("x") && this.table.get(7).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(1).equals("x") && this.table.get(4).equals("x") && this.table.get(7).equals("x")) {
			return true;
		} else if (this.table.get(0).equals("x") && this.table.get(3).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else if (this.table.get(2).equals("x") && this.table.get(5).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else if (this.table.get(2).equals("x") && this.table.get(4).equals("x") && this.table.get(6).equals("x")) {
			return true;
		} else if (this.table.get(0).equals("x") && this.table.get(4).equals("x") && this.table.get(8).equals("x")) {
			return true;
		} else {
			return false;
		}
	}

//		Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama

	public boolean isWinnerO() {
		if (this.table.get(0).equals("o") && this.table.get(2).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(0).equals("o") && this.table.get(1).equals("o") && this.table.get(2).equals("o")) {
			return true;
		} else if (this.table.get(3).equals("o") && this.table.get(4).equals("o") && this.table.get(5).equals("o")) {
			return true;
		} else if (this.table.get(6).equals("o") && this.table.get(7).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(1).equals("o") && this.table.get(4).equals("o") && this.table.get(7).equals("o")) {
			return true;
		} else if (this.table.get(0).equals("o") && this.table.get(3).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else if (this.table.get(2).equals("o") && this.table.get(5).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else if (this.table.get(2).equals("o") && this.table.get(4).equals("o") && this.table.get(6).equals("o")) {
			return true;
		} else if (this.table.get(0).equals("o") && this.table.get(4).equals("o") && this.table.get(8).equals("o")) {
			return true;
		} else {
			return false;
		}
	}

//		Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8

	public boolean isValidMove(int polje) {
		if (polje < 9 && polje >= 0) {
			return true;
		} else {
			return false;
		}
	}

//		Metodu gameScore, metoda vraca informaciju za kraj igre.
//		Ukoliko je pobednik igrac x, metoda vraca 1
//		Ukoliko je pobednik igrac o, metoda vraca 2
//		Ukoliko nemam pobednika vracamo 0

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		} else {
			return 0;
		}
	}

	// + metoda za stampu

	public void printGameScore() {
		int skor = this.gameScore();
		if (skor == 1) {
			System.out.print("Pobednik je: ");
			this.getPlayerX().printPlayer();
		} else if (skor == 2) {
			System.out.print("Pobednik je: ");
			this.getPlayerO().printPlayer();
		} else {
			System.out.println("Nemamo u ovoj rundi pobednika.");
		}
		System.out.println("Da nastavite odmeravanje snaga pokrenite igru opet.");
	}
}
