package General;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base :- ");
        double base = input.nextDouble();
        System.out.print("Enter height:- ");
        double height = input.nextDouble();

        double area=  0.5 * base*height;
        System.out.print(area);
    }
}
