package Functions;

import java.util.Scanner;

public class sumOfInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number:- ");
        int number = input.nextInt();

        int totalSum = SumOfInt(number);
        System.out.println(totalSum);

    }


    public static int SumOfInt(int num){
        int i=1, sum=0;
        while (i<= num){
            sum=sum+i;
            i++;
        }
        return sum;
    }
}
