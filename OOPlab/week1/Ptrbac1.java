import java.util.Scanner;
public class Ptrbac1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first coefficient: ");
        double a = input.nextDouble();
        System.out.print("Input the second coefficient: ");
        double b = input.nextDouble();
        double x;
        if(a == 0){
            System.out.println("The equation don't have solution");

        } else {
            System.out.println("The solution of the equation is: x = -b/a = " + (-b/a));
        }


    }
}

