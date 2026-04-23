package PatternPrinting;

import java.util.Scanner;

public class HalfPryarmidPrinting {
    public static void main(String[] args) {
        System.out.println("HalfPramidPrinting ");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter your row value ");
        int row = src.nextInt();
//        System.out.println("Enter your Column Value ");
//        int col = src.nextInt();
//        Logic part
        for(int i=0;i<row;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
