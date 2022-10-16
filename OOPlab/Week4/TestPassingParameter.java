package Week4;

public class TestPassingParameter {
	 private static void changeTittle(DigitalVideoDisc dvd, String title) {
	        String oldTittle=dvd.getTitle();
	        dvd.setTitle(title);
	        dvd=new DigitalVideoDisc(oldTittle);
	    }

	    /*private static void swap(DigitalVideoDisc a, DigitalVideoDisc b) {
	        DigitalVideoDisc tmp=a;
	        a=b;
	        b=tmp;
	    }*/
	    private static DigitalVideoDisc swap(DigitalVideoDisc b,DigitalVideoDisc a) {
	        return b;
	    }
	    public static void main(String[] args) {
	        DigitalVideoDisc jungleDVD =new DigitalVideoDisc("Jungle");
	        DigitalVideoDisc cinderellaDVD =new DigitalVideoDisc("Cinderella");
	        jungleDVD =swap(cinderellaDVD,cinderellaDVD=jungleDVD);
	       // swap(cinderellaDVD,jungleDVD);
	        
	        System.out.println("Jungle DVD Tittle: "+jungleDVD.getTitle());
	        System.out.println("Cinderella DVD Tittle: "+cinderellaDVD.getTitle());
	        changeTittle(jungleDVD,cinderellaDVD.getTitle());
	        System.out.println("Jungle DVD Tittle: "+jungleDVD.getTitle());
	    }

	   


}
