package d18_08_2022;

public class SmartAirConditioning_3 {
	
	public String brand;
	public int consumeCold;
	public int consumeHeat;
	public int temp;
	public boolean modeCold;
	
	public void print () {
		String mode = null;
		if (modeCold = true) {
			mode = "hladi";
		} else {
			mode = "greje";
		}
		System.out.println(this.brand + " - " + mode + " - " + this.temp);
	}
	
	public int consumeKW () {
		if (modeCold == true) {
			return 30 * 15 * consumeCold;
		} else {
			return 30 * 15 * consumeHeat;
		}
	}
	
	public int bill () {
		if (consumeKW() <= 350) {
			return consumeKW() * 6;
		} else {
			return (350*6) + (consumeKW() - 350) * 9;
		}
	}

}
