package Week6;
import java.util.*;
public class Order {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media me) {
        itemsOrdered.add(me);
    }

    public void removeMedia(Media me) {
        itemsOrdered.remove(me);
    }

    public void removeMedia(int me) {
        itemsOrdered.remove(me);
    }

    public void showItem() {
        showList(itemsOrdered);
    }

    public float tototalCost() {
        float to = 0;
        ListIterator<Media> iterator = itemsOrdered.listIterator();
        while (iterator.hasNext()) {
            to += iterator.next().getCost();
        }
        return to;
    }

    public void clear() {
        itemsOrdered.clear();
    }

    public int getsize() {
        return itemsOrdered.size();
    }

    public static void showList(ArrayList<Media> list) {
        // Show list through for-each
        for (Media obj : list) {
            System.out.print(obj.title + ", " + obj.category + ", " + obj.cost + "\n");
        }
    }

}
