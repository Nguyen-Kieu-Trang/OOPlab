package week7;
import java.util.*;
public class Order {
	private ArrayList<T> itemsOrdered = new ArrayList<T>();

    public void addMedia(T me) {
        itemsOrdered.add(me);
    }

    public void removeMedia(T me) {
        itemsOrdered.remove(me);
    }

    public void removeMedia(int me) {
        itemsOrdered.remove(me);
    }

    /*
     * public float tototalCost() {
     * float to = 0;
     * ListIterator<T> iterator = itemsOrdered.listIterator();
     * while (iterator.hasNext()) {
     * to += iterator.next().getCost();
     * }
     * return to;
     * }
     */
    public T getn(int n) {
        return itemsOrdered.get(n - 1);
    }

    public void clear() {
        itemsOrdered.clear();
    }

    public int getsize() {
        return itemsOrdered.size();
    }

}
