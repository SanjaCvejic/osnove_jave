package p19_08_22;

public class Radnik2 {
	
	private String jmbg;
	private String imeIPrezime;
	private int brojDece;
	private int stepenStrucneSpreme;
	private int godineRadnogStaza;

	public Radnik2(String jmbg, String imeIPrez, int brojD, int stepenSS, int godineRStaza) {
		this.jmbg = jmbg;
		this.imeIPrezime = imeIPrez;
		this.brojDece = brojD;
		this.stepenStrucneSpreme = stepenSS;
		this.godineRadnogStaza = godineRStaza;

	}

	public Radnik2(String jmbg) {
		this.jmbg = jmbg;
	}

	public void setImeIPrezime(String imeIP) {
		imeIPrezime = imeIP;
	}

	public void setBrojDece(int brojD) {
		brojDece = brojD;
	}

	public void setStepenStrucneSpreme(int stepenSS) {
		stepenStrucneSpreme = stepenSS;
	}

	public void setGodineRadnogStaza(int godineRS) {
		godineRadnogStaza = godineRS;
	}

	public String getJmbg() {
		return jmbg;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public int getBrojDece() {
		return brojDece;
	}

	public int getStepenStrucneSpreme() {
		return stepenStrucneSpreme;
	}

	public int getGodineRadnogStaza() {
		return godineRadnogStaza;
	}

	public double minuliRad() {
		if (godineRadnogStaza > 10 && godineRadnogStaza < 20) {
			return 0.075;
		} else if (godineRadnogStaza > 20) {
			return 0.1;
		} else {
			return 0.05;
		}

	}

	public double koeficijentSlozenosti() {

		if (stepenStrucneSpreme == 2) {
			return 1.65;
		} else if (stepenStrucneSpreme == 3) {
			return 2.00;
		} else if (stepenStrucneSpreme == 4) {
			return 2.27;
		} else if (stepenStrucneSpreme == 5) {
			return 2.88;
		} else if (stepenStrucneSpreme == 6) {
			return 3.09;
		} else if (stepenStrucneSpreme == 7) {
			return 3.40;
		} else if (stepenStrucneSpreme == 8) {
			return 4.12;
		} else {
			return 1.03;
		}
	}

	public double plata() {
		return 25000 + (koeficijentSlozenosti() + minuliRad()) * 10000;
	}

	public boolean kreditnaSposobnost() {

		if (plata () > 50000.00) {
			return true;
		} else {
			return false;
		}
	}

}
