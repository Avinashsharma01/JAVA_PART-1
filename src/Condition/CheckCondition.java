package Condition;

import java.util.Objects;
import java.util.Scanner;

public class CheckCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Country:- ");
        String country = input.nextLine();
        System.out.print("Enter Your Gender  m/f :- ");
        String gender = input.nextLine();

        if(gender.equals("m") || gender.equals("M")){
            System.out.println("Your are a Man");
            System.out.print("Enter Your Name:- ");
            String name = input.nextLine();
            System.out.print("Enter Your age:- ");
            int age = input.nextInt();

            if (age < 18){
                System.out.println("You have not any kind of authority to do that");
            }else {
                
            }

        } else if (gender.equals("f") || gender.equals("F")) {
            System.out.println("you are a woman");
            System.out.print("Enter Your Name:- ");
            String name = input.nextLine();
            System.out.print("Enter Your age:- ");
            int age = input.nextInt();
        }


    }
}
