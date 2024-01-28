//Write a Program to Display all Factors of a Number entered by User
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = in.nextInt();
        System.out.println("All Factors of a "+ n);
        for(int i = 1; i<=n; i++){
            if(n%i == 0)System.err.print(i+" ");
        }
    }
}
