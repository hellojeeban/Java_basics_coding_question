/*
 * Write a Program to Calculate Power of a Number
without using inbuilt pow() function by taking two
inputs from users as Base and exponent respectively
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the  exponent");
        int exponent = in.nextInt();
        System.out.println("Enter the  base");
        int base = in.nextInt();
        double res = 1.0;
        while(exponent > 0){
            res *=base;
            exponent--;
        }
        System.out.println("Power of "+ base+" = "+ res);
    }
}
