//Write a Program to Swap Two Numbers
public class Question_06 {
    public static void main(String[] args) {
        // using third variable
        System.out.println("using third variable");
        int a = 90;
        int b = 45;
        System.out.println(a +"  "+ b);
        int c = a;
        a = b;
        b = c;
        System.out.println(a +"  "+ b);

        // without third variable
        System.out.println("without third variable");
        int a1 = 90;
        int b1 = 45;
        System.out.println(a1 +"  "+ b1);
        a1+=b1;
        b1 = a1-b1;
        a1 -=b1;
        System.out.println(a1 +"  "+ b1);
    }
}
