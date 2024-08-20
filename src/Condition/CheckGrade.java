package Condition;

import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage:- ");
        int percent= input.nextInt();
        if(percent >=90){
            System.out.println("Grade A");
        } else if (percent>=75) {
            System.out.println("Grade B");
        }else if (percent >=60){
            System.out.println("Grade C");
        } else if (percent >30) {
            System.out.println("Grade D");
        }else {
            System.out.println("Grade E");
        }

    }
}
