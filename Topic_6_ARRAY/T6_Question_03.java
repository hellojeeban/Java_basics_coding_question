/*
 * Write a Program that calculates the standard deviation of 10
data using arrays
 */
package Topic_6_ARRAY;

import java.util.Scanner;

public class T6_Question_03 {
    public static double deviation(int[] arr, int n){
        double sum = 0, sd = 0, mean = 0;
        for(int i = 0; i<n; i++)sum+=arr[i];
        mean = sum/n;
        for(int i = 0; i<n; i++){
            sd += Math.pow(arr[i] - mean, 2);
        }
        return Math.sqrt(sd);
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       System.out.println("Enter a number");
       int n = in.nextInt();

       int[] arr = new int[n];
       for(int i = 0; i<n; i++)arr[i] = in.nextInt();
       System.out.println(deviation(arr, n));
    }
}
