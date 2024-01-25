/*
 * Write a program where the user is asked to enter two
integers (divisor and dividend) and the quotient and the
remainder of their division is computed.(Both divisor and
dividend should be integers.)
 */

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter divisor(in Integer)"); 
       int divisor = in.nextInt();
       System.out.println("Enter dividend(in Integer)"); 
       int dividend = in.nextInt();

       if(divisor == 0){
        System.out.println("Not divisible by zero");
       }else{
        int remainder = dividend%divisor;
        int division = dividend/divisor;
        System.out.println("Remainder = "+remainder);
        System.out.println("Division = "+division);
       }
    }
}
