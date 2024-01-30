/*
 * Pascal Triangle
 * <pre>
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1</pre>
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_10 {
    public static int[][] pascal(int n){
        int[][] arr = new int[n][];

        for(int i= 0; i<arr.length; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j<arr[i].length; j++){
                if(j == 0 || j==(arr[i].length -1)){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        return arr;
    }
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = in.nextInt();
    int space = n-1;
    int[][] arr = pascal(n);

    for(int i = 0; i<arr.length; i++){
        for(int j = 0; j<space; j++){
            System.out.print(" ");
        }
        for(int j = 0; j<arr[i].length; j++){
            System.out.print(arr[i][j]+" ");
        }
        space--; 
        System.out.println();
    }
   } 
}
