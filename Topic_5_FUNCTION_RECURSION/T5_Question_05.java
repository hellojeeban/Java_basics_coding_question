/*
 * Write a Program to Find Sum of N Natural Numbers
(entered by users) using Recursion
 */
package Topic_5_FUNCTION_RECURSION;

import java.util.Scanner;

public class T5_Question_05 {
    public static int sum(int n){
        if(n == 1)return 1;
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        System.out.println("Sum of 0 to "+n+" is = "+sum(n));
    }
}
