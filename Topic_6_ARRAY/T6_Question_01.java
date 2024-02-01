/*
 * Write a Program that takes N elements (max. value of N is 100
and N is the float number specified by user) from user, stores data
in an array and Calculates the average of those numbers.
 */
package Topic_6_ARRAY;

import java.util.Scanner;

public class T6_Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array upto 100");
        int n = in.nextInt();
        int[] arr = new int[n];
        int avg = 0;
        for(int i =0; i<n; i++){
            arr[i] = in.nextInt();
            avg += arr[i];
        }
        System.out.println("Average = "+(avg/=n));
    }
}
