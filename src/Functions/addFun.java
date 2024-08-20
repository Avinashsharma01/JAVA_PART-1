package Functions;

import java.util.Scanner;

public class addFun {
    public static void main(String[] args) {
        int first= first();
        int second= second();
        System.out.println(first+second);

    }

    public static int first(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
         return(input.nextInt());
    }
    public static int second(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Second Number:- ");
        return(input.nextInt());
    }
}
