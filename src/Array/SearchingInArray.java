package Array;

import java.util.Scanner;

public class SearchingInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter that number you want to seaarch:-  ");
        int number= input.nextInt();
        int[] arr= {1,2,3,4,5,6,7,8,9,10};
        boolean isFound= isfound(arr, number);
        if (isFound){
            System.out.println("your number is found.");
        }else {
            System.out.println("your number is not found.");
        }
    }

    public static boolean isfound(int[] array, int num){
        for(int i=0; i<array.length; i++){
            if (num == array[i]){
                return true ;
            }
        }
        return false;
    }
}
