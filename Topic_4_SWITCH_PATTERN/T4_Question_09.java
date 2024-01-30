/*
 * Half pyramid using numbers
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();

        int num = 1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=num; j++){
                System.out.print(j+" ");
            }
            num++;
            System.out.println();
        }
    }
}
