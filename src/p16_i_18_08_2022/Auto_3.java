package p16_i_18_08_2022;

public class Auto_3 {

	public String vozac;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public double brzina;
	public int godProizvodnje;
	public int registracija;
	public int kubikaza;
	public String registracijaBroj;
	public boolean klima;
	public int maxBrzina;
	public double kapacitetGoriva;
	public double trenutnaKolicinaGoriva;

	public void stampa() {
		System.out.println(this.vozac);
		System.out.println(this.marka + " - " + this.brojVrata + "-ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnja + " l na 100 km");
		System.out.println(this.brzina + " km/h je trenutna brzina");

	}

	public boolean prekoracenje(double ogranicenje) {
		if (this.brzina > ogranicenje) {
			return true;
		}
		return false;
	}

	public double kazna(double ogranicenje) {
		if (this.brzina > ogranicenje) {
			return (this.brzina - ogranicenje) * 1000;
		} else {
			return 0;
		}
	}

	public boolean oldtimer() {
		if (this.godProizvodnje < 1950) {
			return true;
		}
		return false;
	}

	public boolean isteklaReg(int trenutniMesec) {
		if (this.registracija > trenutniMesec) {
			return false;
		} else {
			return true;
		}
	}

	public int iznosRegistracije() {
		if (this.kubikaza <= 2000) {
			return this.kubikaza * 100;
		} else {
			return this.kubikaza * 130;
		}
	}

	public void dodajGas() {
		this.brzina = this.brzina + 10;
		if (this.brzina <= maxBrzina) {
			this.brzina = 240;
		}
	}

	public void koci() {
		this.brzina = this.brzina - 10;
		if (this.brzina == 0) {
			this.brzina = 0;
		}
	}

	public double racunPotrosnje() {
		if (this.klima == true) {
			return (this.brzina / 100 * this.potrosnja) * 1.2;
		}
		return this.brzina / 100 * this.potrosnja;
	}

	public void stampajTablu() {
		double procenat = this.brzina / this.maxBrzina * 100;
		for (int i = 0; i < 100; i++) {
			if (i < procenat) {
				System.out.print("|");
			} else {
				System.out.print(".");
			}
		}
		System.out.println();
	}

	public double natociGorivo(double gorivoL) {
		double praznoURezervoaru = this.kapacitetGoriva - this.trenutnaKolicinaGoriva;

		if (praznoURezervoaru >= gorivoL) {
			return gorivoL * 170;
		} else {
			return praznoURezervoaru * 170;
		}
	}

}
	

