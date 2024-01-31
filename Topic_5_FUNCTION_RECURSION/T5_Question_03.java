/*
 * Write a Program to Convert Binary Number to Decimal
manually by creating user-defined functions.
 */
package Topic_5_FUNCTION_RECURSION;

import java.util.Scanner;

public class T5_Question_03 {
    public static int dec(int n){
        int pow = 1;
        int dec = 0;
        while(n>0){
            int t = n%10;
            dec += (pow*t);
            pow *=2;
            n/=10;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println(dec(n));
    }
}