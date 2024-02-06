/*
 * Write a Program to Find the Number of Vowels, Consonants,
Digits and White Spaces in a String
 */
package Topic_7_Strings;

public class T7_Question_02 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy";

        char[] arr = s.toCharArray();
        int vowelcount = 0, consonantsCount = 0, spaces = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                vowelcount++;
            }else if(arr[i] != ' '){
                consonantsCount++;
            }else{
                spaces++;
            }
        }
        System.out.println("No of vowels = "+vowelcount+", no of consonants = "+consonantsCount+", no of spaces = "+spaces);
    }
}
