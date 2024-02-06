/*
 * Write a Program to Find the Frequency of given Character by
user in a String
 */
package Topic_7_Strings;

public class T7_Question_01 {
    public static void main(String[] args) {
        String s = "java is a easy language";
        char[] arr = s.toCharArray();
        char target = 'a';
        int c = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                c++;
            }
        }
        System.out.println("This character repeated for = "+c);
    }
}
