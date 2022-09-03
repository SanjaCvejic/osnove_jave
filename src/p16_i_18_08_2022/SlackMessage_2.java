package p16_i_18_08_2022;

public class SlackMessage_2 {
	
	public String text;
	public String posiljalac;
	public String vreme;

	public void stampaj () {
		System.out.println(this.posiljalac + " - " + this.vreme);
		System.out.println(this.text);
	}
}


