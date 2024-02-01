/*
 * Write a Program that calculates the power of a number
using recursion where base and exponent is entered by the
user.
 */

import java.util.Scanner;

public class T5_Question_08 {
    public static double power(int b, int e){
        if(e == 1)return b;
        if(e == 0)return 1;
        return b*power(b, e-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base");
        int b = in.nextInt();
        System.out.println("Enter exponent");
        int e = in.nextInt();
        System.out.println(b+" Power of "+ e +" = "+power(b, e));
    }
}
