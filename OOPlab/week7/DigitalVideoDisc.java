package week7;

public class DigitalVideoDisc extend Disc implements Playable {
	public DigitalVideoDisc(String title) {
        super(title);
    }

    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }

    public DigitalVideoDisc(String title, String category, Float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }

    public DigitalVideoDisc() {
    }

    public boolean search(String title) {
        if (super.title.equals(title))
            return true;
        return false;
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + super.getTitle());
        System.out.println("DVD length: " + super.getLength());

    }

}
