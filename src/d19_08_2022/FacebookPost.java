package d19_08_2022;

public class FacebookPost {
	
	private String namePost;
	private String nameWall;
	private String text;
	private int like;
	private int share;

	public FacebookPost() {
	}

	public FacebookPost(String name1, String name2, String textMsg) {
		this.namePost = name1;
		this.nameWall = name2;
		this.text = textMsg;
	}

	public String getNamePost() {
		return namePost;
	}

	public String getNameWall() {
		return nameWall;
	}

	public String getText() {
		return text;
	}

	public int getLike() {
		return like;
	}

	public int getShare() {
		return share;
	}
	public void setNamePost(String nameP) {
		namePost = nameP;
	}

	public void setNameWall(String nameW) {
		nameWall = nameW;
	}

	public void setText( String textM) {
		text = textM;
	}

	public void setLike(int lik) {
		like = lik;
	}

	public void setShare(int shar) {
		share = shar;
	}
	
	public void like() {
		like++;
	}

	public void dislike() {
		like--;
	}

	public void share() {
		share++;
	}



	public void print() {
		System.out.println(namePost + " >>> " + nameWall);
		System.out.println(text);
		System.out.println("Likes " + like + " | " + share);
	}

	
}
