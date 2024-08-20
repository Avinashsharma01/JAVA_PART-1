package General;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principle :- ");
        double principle = input.nextDouble();
        System.out.print("Enter rate:- ");
        double rate = input.nextDouble();
        System.out.print("Enter years:- ");
        double years = input.nextDouble();

        double comIn = principle* Math.pow((1+ rate/100), years);
        System.out.println(comIn);
    }
}
