package d23_08_2022;

public class ZeleniKarton {

	private String imeIPrezimeStudenta;
	private String brIndexa;
	private String nazivPredmeta;
	private String imeIPrezimeProfesora;
	private int ocena;
	
	
	
	public ZeleniKarton(String imeIPrezimeStudenta, String brIndexa, String nazivPredmeta, String imeIPrezimeProfesora,
			int ocena) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}

	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozenIspit () {
		if (this.ocena <= 5) {
			return false;
		} else {
		return true;
	}
	}
	
	public void stampaj () {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brIndexa);
	System.out.println("Profesor: " + this.imeIPrezimeProfesora);
	}

}
