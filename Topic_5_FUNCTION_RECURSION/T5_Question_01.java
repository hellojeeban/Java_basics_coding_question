/*
 * Write a Program to Display Prime Numbers Between Two
Intervals (entered by the user) Using Functions
 */
package Topic_5_FUNCTION_RECURSION;

import java.util.Scanner;

public class T5_Question_01 {
    public static boolean prime(int n){
        if(n <= 1)return false;
        for(int i = 2; i<= (int)Math.sqrt(n); i++){
            if(n % i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting range a number");
        int n1 = in.nextInt();
        System.out.println("Enter the ending range a number");
        int n2 = in.nextInt();

        for(int i = n1; i<=n2; i++){
            if(prime(i))System.out.print(i +" ");
        }
    }
}
