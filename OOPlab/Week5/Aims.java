package Week5;

public class Aims {
	public static void main(String[] args){
        Order anorder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory ("Animation");
        dvd1.setCost (19.95f);
        dvd1.setDirector ("Roger Allers");
        dvd1.setLength (87);
        // add the dvd to the order
        anorder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory ("Science Fiction");
        dvd2.setCost (25f);
        dvd2.setDirector ("George Lucas");
        dvd2.setLength(124);
        anorder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory ("Animation");
        dvd3.setCost(18.98f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        // add the dyd to the order
        anorder.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc other=anorder.getALuckyItem();
        System.out.print("Free: ");
        System.out.print(other.getTitle()+": "+other.getCost()+"\n");
        System.out.print("Total Cost is: ");
        System.out.println(anorder.totalCost());
        System.out.print("Total Cost with "+ other.getTitle() +" free is: ");
        System.out.println(anorder.totalCost()-other.getCost());
        /*Mydate a=new Mydate();
        a.accept();*/
    }

}
