package PatternPrinting;

import java.util.Scanner;

public class squarePrinting {
    public static void main(String[] args) {
        System.out.println("Square Printing ");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your row value ");
        int row = src.nextInt();
        System.out.println("Enter your Column Value ");
        int col = src.nextInt();
//        Logic of Printing Pattern
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
//        for loops
        System.out.println("while loops ");
//        While Loops
        int i=0;
//        int j =0;
        while(i<row){
            int j = 0;
            while (j<col){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }


    }
}
