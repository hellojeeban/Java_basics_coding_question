/*
 * Write a C++ program to count all the words in a given
string.Words must be separated by only one space
Example:
Sample Input: Siddharth Singh
Sample Output: number of words -> 2
 */
package Topic_7_Strings;

import java.util.Scanner;

public class T7_Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.nextLine();
        in.nextLine();

        in = new Scanner(s);
        in.useDelimiter(" ");
        int c = 0;
        while (in.hasNext()) {
            c++;
            in.next();
        }
        System.out.println("number of words -> "+c);
    }
}
