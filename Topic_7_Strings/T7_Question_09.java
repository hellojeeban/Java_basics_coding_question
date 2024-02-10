/*
 * Write a java program to capitalize the first letter of each
word of a given string. Words must be separated by only one
space
Example:
Sample Input: cpp string exercises
Sample Output: Cpp String Exercises
 */
package Topic_7_Strings;

import java.util.Scanner;

public class T7_Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.nextLine();

        char[] sArr = s.toCharArray();
        String res = "";

        for(int i = 0; i<sArr.length; i++){
            if(i == 0 || sArr[i-1] == ' '){
                if(sArr[i] >= 'a' && sArr[i]<='z') res += (char) ((int) sArr[i] - 32);
                else res += sArr[i];
            }else if(sArr[i] == ' ' && i != sArr.length-1){
                res+=" ";
            }else{
                res+=sArr[i];
            }
        }
        System.out.println(res);
    }
}
