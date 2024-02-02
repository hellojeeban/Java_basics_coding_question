/*
 * Write a Program to Find G.C.D of two numbers entered by
user Using Recursion
 */
package Topic_5_FUNCTION_RECURSION;
import java.util.Scanner;

public class T5_Question_07 {
    public static int gdc(int n1, int n2){
        if(n2 == 0)return n1;
        return gdc(n2, n1%n2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = in.nextInt();
        int ans = n1<n2? gdc(n2, n1) : gdc(n1, n2);
        System.out.println("G.D.C of "+n1+" & "+n2+" = "+ ans);
    }
}
