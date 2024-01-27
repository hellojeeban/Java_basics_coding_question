/*
 * Write a Program to Display Fibonacci Series upto
certain number n (n is entered by user)
Example: n=100
Output:
Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = in.nextInt();
        int a = 0, b = 1, c;
        while(n!=0){
            if(n<a)break;
            c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
