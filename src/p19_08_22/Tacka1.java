package p19_08_22;

public class Tacka1 {
	
	private int x;
	private int y;
	
	public Tacka1 (int x, int y) {
	this.x = x;
	this.y = y;
	}
	
	public Tacka1 () {
	
	}
	
	public void print () {
		System.out.println("X je: " + x + ", a Y je: " + y);
	}

	public void setX (int x) {
		this.x = x;
	}
	public void setY (int y) {
		this.y = y;
	}
	
	public int getX () {
		return x;
	}
	public int getY () {
		return y;
	}

}
