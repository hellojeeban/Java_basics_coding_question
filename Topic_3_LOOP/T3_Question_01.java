/*
 * Write a Program to Calculate Sum of first N Natural
Numbers (here value of N is Entered by user)
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = in.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        // using For loop
        for(int i = 1; i<=n; i++){
            sum2+=i;
        }
        System.out.println("By using for loop = "+sum2);
        // using While loop
        while(n>0){
            sum1+=n;
            n--;
        }
        System.out.println("By using while loop = "+sum1);
    }
}
