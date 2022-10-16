package Week5;
import java.lang.Math;
public class Order {
	public static final int MAX_NUMBERS_ORDERED=10;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;
    public int addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        itemOrdered[qtyOrdered]=disc;
        qtyOrdered++;
        if(qtyOrdered>=MAX_NUMBERS_ORDERED)return 0;
        else return 1;
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
    public DigitalVideoDisc getALuckyItem()
    {
        int rand = (int)(Math.random()*(qtyOrdered));
        return itemOrdered[rand];
    }

}
