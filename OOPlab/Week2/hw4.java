package Week2;
import java.util.Scanner;
public class hw4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the month of year: ");
		int month = input.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("The number of days of month " + month + " in "+ year + " is: 31 days");
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("The number of days of month " + month + " in "+ year + " is: 30 days");
		} else if (month == 2){
			if (year % 4 == 0) {
				System.out.println("The number of days of month " + month + " in "+ year + " is: 29 days");
			} else {
				System.out.println("The number of days of month " + month + " in "+ year + " is: 28 days");
			}
		}
		
	}

}
