/*
 * Write a Program to Make a Simple Calculator to Add, Subtract,
Multiply or Divide Using Switch case
The program should takes an arithmetic operator (+, -,
*, /) and
two operands from a user and performs the operation on those
two operands depending upon the operator entered by the user.
 */
package Topic_4_SWITCH_PATTERN;

import java.util.Scanner;

public class T4_Question_01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number-1");
        int num1 = in.nextInt();
        System.out.println("Enter a number-2");
        int num2 = in.nextInt();

        System.out.println("Enter 1. for addition\r\n" + //
                "        2. for substraction\r\n" + //
                "        3. for multiplication\r\n" + //
                "        4. for division");
        int op = in.nextInt();
        int res = 0;
        switch (op) {
            case 1: 
                res = num1+num2;
                break;
            case 2: 
                res = num1-num2;
                break;
            case 3: 
                res = num1*num2;
                break;
            case 4: 
                if(num2 != 0)res =  num1/num2;
                else System.err.println("A number is not divisiable by 0");
                break;                
            default:
                System.out.println("Enter worong operator");
                break;
        }
        System.out.println("Result : "+res);
    }
}
