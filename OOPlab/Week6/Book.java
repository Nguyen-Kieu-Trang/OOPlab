package Week6;
import java.util.*;
public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

    public void addAuthor(String authorName) {
        (this.authors).add(authorName);
    }

    public void showAuthor() {
        System.out.print(this.authors);
    }

    public void removeAuthor(String authorName) {
        (this.authors).remove(authorName);
    }

    Book(String title) {
        super(title);
    }

    Book(String title, String category) {
        super(title, category);
    }

    Book(String title, String category, List<String> authors) {
        super(title, category);
        this.authors = authors;
    }

}
