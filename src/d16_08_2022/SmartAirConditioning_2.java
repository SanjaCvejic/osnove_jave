package d16_08_2022;

public class SmartAirConditioning_2 {

	public String marka;
	public int temp;
	public String mod;
	
	public void stampa () {
		System.out.println("Klima marke " + this.marka + ", podesena temp. je: " + this.temp + ", izabran mod: " + this.mod);
	}
	
	public boolean razlikaUTempVeca (int spoljTemp) {
		if (this.temp < spoljTemp) {
			return true;
		} else { 
			return false;
		}
	}
}

