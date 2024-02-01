/*
 * Write a Program that takes n element from user and displays
the largest element of an array
 */
package Topic_6_ARRAY;

import java.util.Scanner;

public class T6_Question_02{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = in.nextInt();

      int[] arr = new int[n];

      for(int i = 0; i<n; i++){
        arr[i] = in.nextInt();
      }

      int largest = 0;
      for(int i = 0; i<n; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
      }
      System.out.println("Largest = "+largest);
    }
}