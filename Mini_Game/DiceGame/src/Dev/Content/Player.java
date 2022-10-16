package Dev.Content;
public class Player {
	protected String name;
	protected int score;
	
	
	public Player(String name) {
		super();
		this.name = name;
		score = 0;
	}
	
	public int getDice() {
		return (int)(Math.random()*4) + 1;
	}

	public String express() {
		return "0";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}