//Write a Program to Check Whether a Number is Prime or Not
package Topic_3_LOOP;

import java.util.Scanner;

public class T3_Question_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ennter a number ");
        int n = in.nextInt();
        
        if(n<=1){
            System.out.println(n+" is not prime");
            return;
        }

        for(int i = 2; i<n/2; i++){
            if(n%i == 0){
                System.out.println(n+" is not prime");
                return;
            }
        }
        System.out.println(n+" is prime");
    }
}
