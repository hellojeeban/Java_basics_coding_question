/*
 * Write a Program that adds two matrices using Multi-
dimensional Arrays where the number of rows r and columns c is
entered by user (Value of r and c < 100)
 */
package Topic_6_ARRAY;

import java.util.Scanner;

public class T6_Question_04 {
    public static int[][] enter_value(int r, int c){
        System.out.println("Enter elements");
        Scanner  in = new Scanner(System.in);
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }
    public static int[][] add(int[][] arr1, int[][] arr2){
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr1[i].length; j++){
                arr1[i][j] +=arr2[i][j];
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        System.out.println("Enter row");
        int r = in.nextInt();
        System.out.println("Enter column");
        int c = in.nextInt();

        int[][] arr1 = enter_value(r, c);
        int[][] arr2 = enter_value(r, c);

        int[][] sum = add(arr1, arr2);

        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
