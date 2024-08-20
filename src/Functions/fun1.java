package Functions;

public class fun1 {
    public static void main(String[] args) {
        System.out.println("we are trying to print here the Star using loop in the function");
        printStar();
        int i=0;

    }

    public static void printStar(){
        int row=0;
        while (row < 5){
            System.out.print("*");

            int colomn= 0;
            while (colomn <row){
                System.out.print(" *");
                colomn++;
            }
            System.out.println();
            row++;
        }
    }
}
