/*
 * Write a Program to Find Factorial of a given number N
(N is entered by user)
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int fact = 1;
        int factFor = 1;
        // for loop
        for(int i = 1; i<=n; i++){
            factFor *= i;
        }
        System.out.println("By for loop = "+factFor);
        // while loop
        while(n>1){
            fact *= n;
            n--;
        }
        System.out.println("By while loop = "+fact);
    }
}
