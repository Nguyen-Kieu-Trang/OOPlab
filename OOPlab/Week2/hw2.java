package Week2;
import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your name?");
		String strName = keyboard.nextLine();
		System.out.println("How old are you?");
		int iAge = keyboard.nextInt();
		System.out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();
		System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "+ "Your height is "+ dHeight + ".");
 
	}

}
