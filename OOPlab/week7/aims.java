package week7;
import java.util.*;
public class aims {
	public static void showMenu() {

        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add Digital Video Disc");
        System.out.println("3. Delete Digital Video Disc by id");
        System.out.println("4. Play the lastest Digital Video Disc");
        System.out.println("5. Add Compact Disc");
        System.out.println("6. Play all Compact Disc");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5-6");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order<DigitalVideoDisc> or = new Order<DigitalVideoDisc>();
        CompactDisc bo = new CompactDisc();
        Track tr = new Track();
        DigitalVideoDisc di = new DigitalVideoDisc();
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
                di.title = sc.next();
                System.out.print("Enter category: ");
                di.category = sc.next();
                System.out.print("Enter cost: ");
                di.cost = sc.nextFloat();
                System.out.print("Enter length: ");
                di.length = sc.nextInt();
                System.out.print("Enter director: ");
                di.director = sc.next();
                or.addMedia(di);
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
                int n = or.getsize();
                DigitalVideoDisc da = or.getn(n);
                da.play();
                continue;
            }
            if (tmp == 5) {
                System.out.print("How many tracks do you want?");
                int n = sc.nextInt();
                for (int i = 0; i < n; i++) {

                    System.out.print("Enter tittle: ");
                    tr.title = sc.next();
                    System.out.print("Enter length: ");
                    tr.length = sc.nextInt();
                    bo.addTrack(tr);
                    tr.play();
                }
                bo.play();
                continue;
            }
            if (tmp == 6) {
                bo.play();
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
