package d18_08_2022;

public class FacebookPost_2 {
	
	public String NamePost;
	public String NameWall;
	public String text;
	public int NumbersOfLikes;
	public int NumbersOfShares;

	public void like() {
		this.NumbersOfLikes++;
	}

	public void dislike() {
		this.NumbersOfLikes --;
		if (this.NumbersOfLikes < 0) {
			this.NumbersOfLikes = 0;
		}
	}

	public void sharePlus() {
		this.NumbersOfShares++;
	}

	public void print() {
		System.out.println(this.NamePost + " >>> " + this.NameWall);
		System.out.println(this.text);
		System.out.println("Likes " + this.NumbersOfLikes + " | Shares " + this.NumbersOfShares);
	}

}
