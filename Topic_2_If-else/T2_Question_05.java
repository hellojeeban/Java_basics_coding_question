//Write a Program to Check whether a year entered by user is Leap Year or not

import java.util.Scanner;

public class T2_Question_05 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a Year");
      int y = in.nextInt();
      
      if(y % 400 == 0 || y % 100 != 0 && y % 4 == 0){
        System.out.println("Leap Year");
      }else{
        System.out.println("Not a Leap Year");
      }
    }
}
