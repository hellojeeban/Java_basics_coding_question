/*
 * Write a Program to Display Fibonacci Series upto nth
term (n is entered by user)
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_04 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number"); 
       int n = in.nextInt();
       int a = 0, b = 1, c = 1;
       while(n>=1){
        c = a+b;
        System.out.println(a);
        a = b;
        b = c;
        n--;
       }
    }
}
