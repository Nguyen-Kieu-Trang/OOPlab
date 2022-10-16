package Week4;

public class Order {
	 public static final int MAX_NUMBERS_ORDERED=10;
	    public static final int MAX_LIMITTED_ORDERS=5;
	    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	    private int qtyOrdered=0;
	    private Mydate dateOrdered[] = new Mydate[MAX_LIMITTED_ORDERS];
	    private int nbOrders=0;
	    public int addDigitalVideoDisc(DigitalVideoDisc disc)
	    {
	        itemOrdered[qtyOrdered]=disc;
	        qtyOrdered++;
	        if(qtyOrdered>=MAX_NUMBERS_ORDERED)return 0;
	        else return 1;
	    }
	    public void order()
	    {
	        System.out.println("*************Order*****************\n");
	        System.out.println("Date: ");
	        dateOrdered[nbOrders++]=new Mydate(17,7,2002);
	        dateOrdered[nbOrders-1].outputDay();
	        System.out.println("Ordered Items:\n");
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
	        dvd1.setCategory ("Animation");
	        dvd1.setCost (19.95f);
	        dvd1.setDirector ("Roger Allers");
	        dvd1.setLength (87);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
	        dvd2.setCategory ("Science Fiction");
	        dvd2.setCost (25f);
	        dvd2.setDirector ("George Lucas");
	        dvd2.setLength(124);
	        addDigitalVideoDisc(dvd1);
	        addDigitalVideoDisc(dvd2);
	        
	        System.out.println("1.DVD-"+dvd1.getTitle()+"-"+dvd1.getCategory()+"-"+dvd1.getDirector()+"-"+dvd1.getLength()+"-"+dvd1.getCost()+"\n");
	        System.out.println("2.DVD-"+dvd2.getTitle()+"-"+dvd2.getCategory()+"-"+dvd2.getDirector()+"-"+dvd2.getLength()+"-"+dvd2.getCost()+"\n");
	        System.out.println("Total cost:"+totalCost()+"\n");
	    }
	    public int addDigitalVideoDisc(DigitalVideoDisc[] disc,int n)
	    {
	        for(int i=0;i<n;i++)
	        {  
	          itemOrdered[qtyOrdered]=disc[i];
	            qtyOrdered++;
	            if(qtyOrdered>=MAX_NUMBERS_ORDERED)return 0;
	        } 
	        return 1;
	    }
	    
	    public int addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2)
	    {
	        int ok=1;
	        if(qtyOrdered>=MAX_NUMBERS_ORDERED-1)
	        {
	            System.out.print(disc1.getCategory()+" ");
	            System.out.print(disc1.getCost()+" ");
	            System.out.print(disc1.getDirector()+" ");
	            System.out.print(disc1.getLength()+" ");
	            System.out.print(disc1.getTitle()+" ");
	            System.out.print(disc1.getClass()+" \n");
	            ok=0;
	        }
	        else
	        {
	            itemOrdered[qtyOrdered]=disc1;
	            qtyOrdered++;
	        }
	        if(qtyOrdered>=MAX_NUMBERS_ORDERED-1)
	        {
	            
	            System.out.print(disc2.getCategory()+" ");
	            System.out.print(disc2.getCost()+" ");
	            System.out.print(disc2.getDirector()+" ");
	            System.out.print(disc2.getLength()+" ");
	            System.out.print(disc2.getTitle()+" ");
	            System.out.print(disc2.getClass()+" \n");
	            ok =0;
	        }
	        else
	        {
	            itemOrdered[qtyOrdered]=disc2;
	            qtyOrdered++;
	        }
	        return ok;
	    }
	    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
	    {
	        int i=0;
	        while(i<qtyOrdered)
	        {
	            if(itemOrdered[i]==disc)
	            {
	                for(int j=i;j<qtyOrdered-1;j++)
	                itemOrdered[j]=itemOrdered[j+1];
	                qtyOrdered--;
	            }
	            else i++;
	        }
	    }
	    public float totalCost(){
	        float total=0;
	        for(int i=0;i<qtyOrdered;i++)
	        total+=itemOrdered[i].getCost();
	        return total;
	    }

}
