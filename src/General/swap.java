package General;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = input.nextInt();
        System.out.print("Enter Second number:- ");
        int b = input.nextInt();

        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
    }
}
