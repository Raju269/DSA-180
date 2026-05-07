package Pattern_Printing_1;

import java.util.Scanner;

public class BasicPrinting {
    public static  int squarePrinting(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return  0;
    }
    public static void main(String[] args) {
        System.out.println("starting with pattern printing question ok \n ");
//        square pattern printing \]
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        for(int i=1;i<=n; i++){
            for(int j=1;j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("this function call square printing ");
        squarePrinting(n);

    }
}
