package Week2;
import java.util.Scanner;
public class hw5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = input.nextInt();
        }
        int tong = 0;
        for (int i = 0; i < n; i++) {
        	tong += arr[i];
        }
        System.out.println("Tong cac gia tri cua day la: " + tong);
        float tb = tong/n;
        System.out.println("Trung bình cộng cac gia tri cua day la: " + (float) tb);

	}

}
