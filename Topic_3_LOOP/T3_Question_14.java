/*
 * Write a Program to Display Prime Numbers Between
Two Intervals (entered by user)
Example:
Enter two numbers: 0 20
Prime numbers between 0 and 20 are:
2 3 5 7 11 13 17 19
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_14 {
    public static boolean prime(int n){
        if(n<=1)return false;
        for(int i = 2; i<=(int)Math.sqrt(n);  i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting number");
        int s = in.nextInt();
        System.out.println("Enter ending number");
        int e = in.nextInt();
        System.out.println("Prime number from "+s+" to "+e+" is");
        for(int i = s; i<=e; i++){
           if(prime(i))System.out.print(i+" ");
        }
    }
}
