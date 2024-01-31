/*
 * Write a Program to Convert Decimal to Binary number
manually by creating user-defined functions.
 */
package Topic_5_FUNCTION_RECURSION;

import java.util.Scanner;

public class T5_Question_04 {
    public static int bin(int n){
        int bin = 0;
        int pow = 1;

        while(n>0){
            int t = n%2;
            bin = pow * t + bin;
            pow*=10;
            n/=2;
        }
        return bin;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println(bin(n));
    }
}
