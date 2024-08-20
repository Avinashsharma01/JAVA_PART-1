package General;

import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = input.nextInt();
        System.out.print("Enter Second number:- ");
        int b = input.nextInt();

        int add= a+b;
        int sub= a-b;
        int mul= a*b;
        int div = a-b;
        int mod= a%b;

        System.out.println("Addition "+add);
        System.out.println("Subtraction "+sub);
        System.out.println("Multiplication "+mul);
        System.out.println("Division "+ div);
        System.out.println("Modulas "+mod);


    }
}
