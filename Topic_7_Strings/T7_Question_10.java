/*
 *Write a C++ program to find the largest word in a given
String.
Example:
Sample Input: C++ is a general-purpose programming language.
Sample Output: programming
 */
package Topic_7_Strings;

public class T7_Question_10 {
    public static void main(String[] args) {
        String s = "C++ is a general-purpose programming language".toLowerCase();
        String[] sArr = s.split(" ");
        int len = 0; String res = "";
        boolean flag = false;
        for(String str : sArr){
            if(len < str.length()){
                for(int i = 0; i<str.length(); i++){
                    if(str.charAt(i) >= 'a' && str.charAt(i) <='z'){
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    len = str.length();
                    res = str;
                }
                
            }
        }
        System.out.println(res+" length = "+len);
    }
}
