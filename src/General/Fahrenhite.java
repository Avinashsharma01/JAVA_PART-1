package General;

import java.util.Scanner;

public class Fahrenhite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit :-");
        float F= input.nextFloat();

        float C= (F -32) * 5/9;
        System.out.println("this is the Degree Celcious :- " + C);
    }
}
