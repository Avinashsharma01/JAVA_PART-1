package Condition;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three number:- ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if(a>b && a>c){
            System.out.println(a+ " A is Largest number");
        } else if (b>a && b>c) {
            System.out.println(b + " B is Largest number");
        }else {
            System.out.println(c + " C is Largest number");
        }
    }
}
