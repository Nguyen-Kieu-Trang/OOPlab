package Week4;

public class DateUtils {
	public int compare(Mydate a,Mydate b)
	 {
	    if(a.getYear()!=b.getYear())return 0;
	    if(a.getMonth()!=b.getMonth())return 0;
	    if(a.getDay()!=b.getDay())return 0;
	    return 1;
	 }
	 public int tonho(Mydate a,Mydate b)
	 {
	     
	    if(a.getYear()<b.getYear())return 0;
	    if(a.getMonth()<b.getMonth())return 0;
	    if(a.getDay()<b.getDay())return 0;
	    return 1;
	 }
	 public void sorting(Mydate[] datec,int n)
	 {
	     for(int i=0;i<n;i++)
	     for(int j=i+1;j<n;j++)
	     if(tonho(datec[j],datec[i])==1)
	     {
	         Mydate temp=datec[i];
	         datec[i]=datec[j];
	         datec[j]=temp;
	     }
	 }      

}
