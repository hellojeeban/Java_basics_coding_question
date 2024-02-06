/*
 * Write a Program that takes a matrix of order r*c from the user
and computes the transpose of the matrix.
 */
package Topic_6_ARRAY;

import java.util.Scanner;

public class T6_Questionn_05 {
    public static int[][] arrInit(int r, int c){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public static int[][] transpose(int r, int c, int[][] a){
        int[][] arr = new int[c][r];
        for(int i = 0; i<c; i++){
            for(int j = 0; j<r; j++){
                arr[i][j] = a[j][i];
            }
        }
        return arr;
    }

    public static void show(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter row");
       int r = in.nextInt();
       System.out.println("Enter column");
       int c = in.nextInt();
       int[][] arr = arrInit(r, c);
       show(arr);
       System.out.println("---------------------");
      arr = transpose(r, c, arr);
      show(arr);
    }
}
