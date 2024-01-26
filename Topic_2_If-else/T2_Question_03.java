// Write a Program to Find Largest Number Among Three Numbers entered by users

import java.util.Scanner;

public class T2_Question_03 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter 1st Number :");
      int num1 = in.nextInt();
      System.out.println("Enter 2nd Number :"); 
      int num2 = in.nextInt();
      System.out.println("Enter 3rd Number :");
      int num3 = in.nextInt();

      // checking the highest among three
      if(num1 >= num2){
        if(num1 >= num3){
            System.out.println(num1+" is greater.");
        }else{
            System.out.println(num3+" is greater.");
        }
      }else if(num1 <= num2){
        if(num2 >= num3){
            System.out.println(num2+" is greater.");
        }else{
            System.out.println(num3+" is greater.");
        }
      }
    }
}
