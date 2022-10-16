package Week2;
import java.util.Scanner;
public class hw3 {
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n -1; j++ ) {
				if (j == n - i) {
					for (int k = 1; k <= 2 * i +1; k++) {
						
						System.out.print("*");
					}
				}else {
					System.out.print(" ");
				}
				
				
			}
			System.out.print("\n");
		}

	}

}
