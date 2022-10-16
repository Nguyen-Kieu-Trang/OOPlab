import java.util.Scanner;
public class  Ptr2an{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("a1*x + b1*y = c1");
        System.out.println("a2*x + b2*y = c2");
        System.out.print("Input a1: ");
        double a1 = input.nextDouble();
        System.out.print("Input a2: ");
        double a2 = input.nextDouble();
        System.out.print("Input b1: ");
        double b1 = input.nextDouble();
        System.out.print("Input b2: ");
        double b2 = input.nextDouble();
        System.out.print("Input c1: ");
        double c1 = input.nextDouble();
        System.out.print("Input c2: ");
        double c2 = input.nextDouble();
        double D = a1 * b2 - a2 * b1;
        double Dx = c1 * b2 - c2 * b1;
        double Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx + Dy == 0)
                System.out.println("He phuong trinh co vo so nghiem");
            else
                System.out.println("He phuong trinh vo nghiem");
        }
        else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.println("He phuong trinh co nghiem (x, y) = (" + x + ", " + y + ")");
        }

    }
}