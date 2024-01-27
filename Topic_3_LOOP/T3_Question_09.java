/*
 * Write a Program to display sum of all digits of a given
Number N by user
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = in.nextInt();

        // digit sum of a numbrer.
        int sum = 0;
        while (n>0) {
           sum += (n%10);
           n/=10; 
        }
        System.out.println("Sum = "+sum);
    }
}
