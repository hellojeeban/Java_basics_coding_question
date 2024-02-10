/*
 * Write a Java program to change every letter in a given string
with the letter following it in the alphabet (ie. a becomes b, p
becomes q, z becomes a).
Example:
Sample Input: Abcdef3
Sample Output: Bcdefg3
 */
package Topic_7_Strings;

import java.util.Scanner;

public class T7_Question_06 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = in.next();
        char[] sArr = s.toCharArray();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String res = ""; 
        int encoding = 1;
        for(char c : sArr){
            if(c >='a' && c<= 'z'){
                int index = c - 'a';
                index +=(encoding%26);
                res += alphabet[index%26];
            }else if(c >= 'A' && c<='Z'){
                int index = c - 'A';
                index += (encoding%26);
                res += ((alphabet[index%26]+"").toUpperCase());
            }else{
                res+=c;
            }
        }
        System.out.println("Result = "+res);
    }
}
