// Write a Program to Print Integer Number Entered by User

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) throws Exception{
       // By using Scanner class
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a Number");
       int n = in.nextInt();
       System.out.println("You enter"+n);

       // By using BufferReader
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a number");
       int num = Integer.parseInt(br.readLine());
       System.out.println("You enter"+num);
    }
}
