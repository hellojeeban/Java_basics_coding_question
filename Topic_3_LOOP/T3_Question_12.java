/*
 * Write a Program to Check Whether a Number N
entered by user is Palindrome or Not
 */
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_12 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number"); 
     int n = in.nextInt();
     int temp = n;
     // palindrome
     int rev = 0;
     while(temp>0){
        rev = (rev*10)+(temp%10);
        temp/=10;
     }
     if(rev == n)System.out.println(n+" is a palindrome........");
     else System.out.println(n+" is not a palindrome......");
    }
}
