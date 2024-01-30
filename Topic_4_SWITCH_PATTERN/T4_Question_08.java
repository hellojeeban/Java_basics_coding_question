/*
 * Hollow Full Pyramid Star
     *
   *   *
 *       *
* * * * * *
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        int space = n-1;
        int star = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=star; j++){
                if(j == 1 || j == star || i == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            star+=2;
            space--;
        }
    }
}
