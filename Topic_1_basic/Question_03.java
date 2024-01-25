//Write a Program to Add Two Integer Numbers Entered by User

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 1st Num");
        int n1 = in.nextInt();
        System.out.println("Enter the 2nd Number");
        int n2 = in.nextInt();
        int sum = n1+n2;
        System.out.println("Sum = "+ sum);
    }
}
