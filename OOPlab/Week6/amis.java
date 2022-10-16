package Week6;
import java.util.*;
public class amis {
	public static void showMenu() {

        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order or = new Order();
        Media me = new Media();
        while (true) {
            showMenu();
            int tmp = 0;
            tmp = sc.nextInt();
            if (tmp == 0)
                break;
            if (tmp == 1) {
                or.clear();
                continue;
            }
            if (tmp == 2) {
                System.out.print("Enter tittle: ");
                me.title = sc.next();
                System.out.print("Enter category: ");
                me.category = sc.next();
                System.out.print("Enter tittle: ");
                me.cost = sc.nextFloat();
                or.addMedia(me);
                continue;
            }
            if (tmp == 3) {
                int temp = 0;
                System.out.print("Id you want to remove: ");
                temp = sc.nextInt();
                if (temp <= 0 || temp > or.getsize()) {

                    System.out.print("Wrong ID!!! Please check Id again\n");
                } else {
                    or.removeMedia(temp - 1);
                }
                continue;
            }
            if (tmp == 4) {
                or.showItem();
                continue;
            }
            System.out.print("Please check again 0-4\n");
        }
        /*
         * Media me1 = new Media("chi1", "category", 10);
         * Media me2 = new Media("chi2", "category", 30);
         * Media me3 = new Media("chi3", "category", 40);
         * or.addMedia(me);
         * or.addMedia(me1);
         * or.addMedia(me2);
         * or.addMedia(me3);
         * System.out.print(or.tototalCost());
         */
        sc.close();
    }
	

}
