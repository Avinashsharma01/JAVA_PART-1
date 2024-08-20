package General;

import java.util.Scanner;

public class parimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter four sides:- ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        float d = input.nextFloat();
        System.out.print("parimeter is " +  (a+b+c+d));

    }
}
