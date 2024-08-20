package Condition;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year calculator ");
        System.out.print("Enter Year:-  ");
        int year= input.nextInt();

        if(year % 400==0 && year%4==0){
            System.out.println("this is the leap year");
        } else if (year%100==0) {
            System.out.println("this is not leap year");
        }else {
            System.out.println("this is not leap year (else)");
        }
    }
}
