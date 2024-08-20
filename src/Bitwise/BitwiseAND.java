package Bitwise;

import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {
        System.out.println("welcome to bitwise colculator");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fisrt Number:- ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number:- ");
        int number2 = input.nextInt();

//        int bitwiseAND= number1 & number2;
        int bitwiseOR = number1 | number2;
//        System.out.println( "BitwiseAND " + bitwiseAND);
        System.out.println( "BitwiseOR "+  bitwiseOR);
    }
}
