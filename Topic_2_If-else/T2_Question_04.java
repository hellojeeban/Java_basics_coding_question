/*
 * Write a Program which accepts coefficients of a
quadratic equation from the user and displays the roots
(both real and complex roots depending upon the
discriminant).
 */
import java.util.Scanner;

public class T2_Question_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of coefficients of quadratic equation (ax^2+bx+c=0)");
        System.out.println("Enter the value of a");
        int a = in.nextInt();
        System.out.println("Enter the value of b");
        int b = in.nextInt();
        System.out.println("Enter the value of c");
        int c = in.nextInt();

        int quadratic_value = (b*b) - (4*a*c);

        if(quadratic_value > 0){
            double res1 = (-b + (int)Math.sqrt(quadratic_value))/(2*a);
            double res2 = (-b - (int)Math.sqrt(quadratic_value))/(2*a);
            System.out.println("Results are  = "+ res1 +"  "+res2);
        }else if(quadratic_value == 0){
            double res = (-b/(2*a));
            System.out.println("Result are  = "+ res);
        }else{
            double res = (-b/(2*a));
            double imaginary_part = (Math.sqrt(Math.abs(quadratic_value)));
            System.out.println("Result are  = "+ res+imaginary_part+"i");
        }
    }
}
