package Dev.Item;
import java.util.ArrayList;

public class Dice {
	private ArrayList<Integer> faces = new ArrayList<>();
	private int priority;
	
	public Dice(int priority) {
		for (int i = 1; i <= 6; i++)
			for (int j = 0; j < 4; j++)
				faces.add(i);
		faces.add(priority);
		this.priority = priority;
	}
	
	public int getPoint() {
		return faces.get((int)(Math.random() * faces.size()));
	}

	public int getPriority() {
		return priority;
	}
	
}
