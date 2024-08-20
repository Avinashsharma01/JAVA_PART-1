package Functions;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int N= number();
        int i=1;
        while (i <=10){
            System.out.println(N +" X "+ i  + " = "+ i*N );
            i++;
        }
    }

    public static int number(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Number:- ");
        return(input.nextInt());
    }
}
