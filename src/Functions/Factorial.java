package Functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Fact();
    }
    public static void Fact(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any number:- ");
        int number = input.nextInt();

        int fact = 1;
        int i=1;
        while (i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("factorial of "+ number+ " is "+ fact);
    }
}
