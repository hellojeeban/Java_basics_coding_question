/*
 * Write a Java program to check if a given string is a
Palindrome or not.
 */
package Topic_7_Strings;

import java.util.Scanner;

public class T7_Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.next();
        s = s.toLowerCase();
        char[] sArr = s.toCharArray();

        String rev = "";

        for(int i = sArr.length-1; i>=0; i--){
            rev += sArr[i];
        }

        if(rev.equals(s))System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
