/*
 * Write a Program to check whether a number entered
by the user is an Armstrong number or not.
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int temp = n, c = 0;
        while (temp>0) {
            c++;
            temp/=10;
        }
        temp = n;
        int sum = 0;
        while(temp>0){
            int d = temp%10;
            sum += (int)Math.pow(d, c);
            temp/=10;
        }

        if(sum == n)System.out.println(n +" is a Armstrong number..");
        else System.out.println(n +" is not a Armstrong number..");
    }
}
