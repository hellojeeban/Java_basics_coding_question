/*
 * Write a Program to Remove all Characters in a String Except
Alphabets.
Example:
Enter a string: p2'r"o@gram84iz./
Output String: programiz
 */
package Topic_7_Strings;
public class T7_Question_03 {
    public static void main(String[] args) {
        String s = "p2'ro@gram84iz.";

        String ans = "";

        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c<='z' || c>='A' && c<='Z') ans+=c;
        }
        System.out.println(ans);
    }
}
