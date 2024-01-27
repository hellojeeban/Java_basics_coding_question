/*
 * Write a Program to Find GCD or HCF of two numbers
entered by user
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_06 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the 1st num");
    int n1 = in.nextInt();
    System.out.println("Enter the 2nd num");
    int n2 = in.nextInt();
    int small = n1<n2 ? n1:n2;
    int gdc = 0;
    for(int i = 1; i<=small; i++){
        if(n1 % i == 0 && n2 % i == 0)gdc = i;
    }
    System.out.println("GDC of "+n1+" & "+n2+" = "+gdc);
   } 
}
