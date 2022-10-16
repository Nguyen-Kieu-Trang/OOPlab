package week7;

public class Disc extends Media {
	 int length;
	    String director;

	    public int getLength() {
	        return length;
	    }

	    public String getDirector() {
	        return director;
	    }

	    Disc(String title) {
	        super(title);
	    }

	    Disc(String title, String category) {
	        super(title, category);
	    }

	    Disc(String title, String category, float cost) {
	        super(title, category, cost);
	    }

	    Disc(String title, String category, float cost, int length) {
	        super(title, category, cost);
	        this.length = length;
	    }

	    Disc(String title, String category, float cost, int length, String director) {
	        super(title, category, cost);
	        this.length = length;
	        this.director = director;
	    }

	    public Disc() {
	    }

}
