/*
 * Write a Program to Find LCM of two numbers entered
by user
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd Number");
        int n2 = in.nextInt();

        int small = n1<n2 ?  n1:n2;
        int gdc = 1;
        for(int i = 1; i<=small; i++){
            if(n1%i == 0 && n2%i == 0)gdc = i;
        }
        
        System.out.println("LMC of "+n1+" & "+n2+" = "+ ((n1*n2)/gdc));
    }
}
