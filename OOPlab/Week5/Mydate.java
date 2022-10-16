package Week5;
import java.util.Scanner;
public class Mydate {
	private String[] mo={"January","February","March","April","May","June","July","August","September","October","November","December"};
    private int day;
    private int month;
    private int year;
    public Mydate()
    {

    }
    public Mydate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    private String[] s =new String[3];
    private int d=0;
    public Mydate(String date)
    {
        s[0]="";
        s[1]="";
        s[2]="";
        for(int i=0;i<date.length();i++)
        {
            if(date.charAt(i)==' ')d++;
            else s[d]=s[d]+date.charAt(i);
        }
        int day1,month1,year1;
        day1=0;
        month1=0;
        year1=0;
        for(int i=0;i<s[2].length();i++)
        year1=(int)year1*10+(int)(s[2].charAt(i)-'0');
        for(int i=0;i<s[1].length()-2;i++)
        day1=(int)day1*10+(int)(s[1].charAt(i)-'0');
        for(int i=0;i<12;i++)
        if(s[0].equals(mo[i]))
        {
            month1=i+1;
            break;
        }
        
        this.day=day1;
        this.month=month1;
        this.year=year1;
        //System.out.println(s[0]+s[1]+s[2]+date+day1+month1+year1);
    }
    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static Scanner sc = new Scanner(System.in);
    public void accept()
    {
        
        System.out.println("Enter a date");
        s[0]=sc.next();
        s[1]=sc.next();
        s[2]=sc.next();
        s[0]=s[0]+" "+s[1]+" "+s[2];
        Mydate mydate =new Mydate(s[0]);
        System.out.println(s[0]+" convert to "+mydate.month+ " "+mydate.day+ " "+mydate.year+"\n");
    }

}
