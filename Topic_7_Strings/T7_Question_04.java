/*
 * Write a Program to Find the Length of a String entered by
user
 */
package Topic_7_Strings;

import java.util.Scanner;

public class T7_Question_04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.next();

        in = new Scanner(s);
        in.useDelimiter("");

        int c = 0;
        while(in.hasNext()){
            in.next();
            c++;
        }
        System.out.println(c);
    }
}