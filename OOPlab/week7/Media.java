package week7;

public abstract class Media {
	String title;
    String category;
    float cost;

    Media() {
    }

    public String getTitle() {
        return title;
    }

    /*
     * public void setTitle(String title) {
     * this.title = title;
     * }
     */

    public String getCategory() {
        return category;
    }

    /*
     * public void setCategory(String category) {
     * this.category = category;
     * }
     */

    public float getCost() {
        return cost;
    }

    /*
     * public void setCost(float cost) {
     * this.cost = cost;
     * }
     */

    Media(String title) {
        this.title = title;
    }

    Media(String title, String category) {
        this(title);
        this.category = category;
    }

    Media(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }

}
