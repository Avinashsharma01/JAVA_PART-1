package General;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        int a = input.nextInt();
        System.out.print("Enter Second number:- ");
        int b = input.nextInt();
        int c = a+b;
        System.out.print(c);
    }
}
