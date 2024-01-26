//Write a Program to Check Whether Number is Even or Odd

import java.util.Scanner;

public class T2_Question_01 {
    public static String isEvenOdd(int n){
        if(n%2 == 0)return "Even";
        return "Odd";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
         int n = in.nextInt();
        System.out.print(n+" is a "+isEvenOdd(n));
    }
}

