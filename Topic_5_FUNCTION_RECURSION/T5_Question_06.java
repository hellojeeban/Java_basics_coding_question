/*
 * Write a Program to Calculate Factorial of a Number Using
Recursion
 */

import java.util.Scanner;

public class T5_Question_06 {
    public static int fact(int n){
        if(n == 1 || n == 0)return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Factorial of "+n+" = "+fact(n));
    }
}