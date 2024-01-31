/*
 * Write a Program to check if an integer (entered by the user)
can be expressed as the sum of two prime numbers,if yes then
print all possible combinations with the use of functions.
Example
Enter a positive integer: 34
OUTPUT:
34 = 3 + 31
34 = 5 + 29
34 = 11 + 23
34 = 17 + 17
 */
package Topic_5_FUNCTION_RECURSION;

import java.util.Scanner;

public class T5_Question_02 {
    public static boolean prime(int n){
        if(n<=1)return false;
        for(int i = 2; i<=(int)Math.sqrt(n); i++){
            if(n%i == 0)return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        boolean flag = false;
        if(n >= 0){
            for(int i = 1; i<=n/2; i++){
                if(prime(i)){
                    if(prime(n-i)){
                        System.out.println(n +" = "+i+" + "+(n-i));
                        flag = true;
                    }
                }
            }
        }
        if(! flag){
            System.out.println(n+" is a sum of prime numbers");
        }
    }
}
