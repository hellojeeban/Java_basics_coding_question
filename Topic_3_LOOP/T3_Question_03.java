/*
 * 3) Write a Program to Generate Multiplication Table of a
number (entered by the user) using a for loop.
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        // by for loop
        for(int i = 1; i<= 10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        System.out.println("-----------------------------");
        //by While loop
        int i = 1;
        while(i<=10){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
    }
}
