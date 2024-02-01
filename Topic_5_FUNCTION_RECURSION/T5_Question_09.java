/*
 * Write a Program to check prime number entered by
user Using Recursion
 */

import java.util.Scanner;

public class T5_Question_09 {
    public static boolean isPrime(int n, int i){
        if(n<=1)return false;
        if(n % i == 0)return false;
        if(i * i > n)return true;
        
        return isPrime(n, i+1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ennter a number");
        int n = in.nextInt();
        if(isPrime(n, 2)){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
