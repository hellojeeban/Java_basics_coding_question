//Write a Program to Reverse a given Number N by user
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        //reverse
        int rev = 0;
        while (n>0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        System.out.println("Reverse = "+rev);
    }
}
