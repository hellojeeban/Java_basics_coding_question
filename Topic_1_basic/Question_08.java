//Write a Program to Multiply two decimal Numbers entered by User

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st decimal number");
        double d1 = in.nextDouble();
        System.out.println("Enter 2nd decimal number");
        double d2 = in.nextDouble();
        System.out.println("Multiplication = "+(d1*d2));
    }
}
