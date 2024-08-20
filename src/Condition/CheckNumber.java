package Condition;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number:- ");
        int number= input.nextInt();
        if (number== 0){
            System.out.println("Number is Zero");
        } else if (number > 0) {
            System.out.println("Number is Positive");
        }else {
            System.out.println("Number is Nagative");
        }
    }
}
