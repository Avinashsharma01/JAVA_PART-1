package General;

import java.util.Scanner;

public class float_add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        float a = input.nextFloat();
        System.out.print("Enter second number:- ");
        float b = input.nextFloat();
        float c = a +b;
        System.out.println(c);
    }
}
