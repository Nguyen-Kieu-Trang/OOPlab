import java.util.Scanner;
public class Ptrbac2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first coefficient: ");
        double a = input.nextDouble();
        System.out.print("Input the second coefficient: ");
        double b = input.nextDouble();
        System.out.print("Input the third coefficient: ");
        double c = input.nextDouble();
        double denta = b * b - 4 * a * c;
        double sqrtdenta = Math.sqrt(denta);
        if (a == 0) {
            System.out.println("The solution of the equation is: x = -c / b = "+ (-c/b));
        }else {
            if (denta < 0) {
                System.out.println("The equation do not have solution");
            }else if (denta > 0) {
                System.out.println("The first solution is: x1 = (-b + ssqrtdenta)/(2*a) = "+ ((-b + sqrtdenta)/(2*a)));
                System.out.println("The second solution is: x2 = (-b + ssqrtdenta)/(2*a) = "+ ((-b - sqrtdenta)/(2*a)));
            } else {
                System.out.println("The solution is: x = -b/(2*a) = "+ (-b/(2*a)));
            }
        }
    }
}