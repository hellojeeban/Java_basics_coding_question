/*
 * Inverted Full pyramid
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();

        int star = 2*n - 1;
        int space = 1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}
