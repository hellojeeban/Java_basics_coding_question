/*
 * Solid Rectangular star
* * * * *
* * * * *
* * * * *
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
