/*
 *Write a Program to Calculate Power of a Number
using inbuilt pow() function by taking two
inputs from users as Base and exponent respectively 
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_11 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter a base number ");
        double b = in.nextDouble();
        System.out.println("Enter a exponent number ");
        double e = in.nextDouble();
        System.out.println("Power of "+b+" = "+(Math.pow(b, e)));
    }
}
