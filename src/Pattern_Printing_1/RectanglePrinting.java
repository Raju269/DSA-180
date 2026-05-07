package Pattern_Printing_1;

import java.util.Scanner;
public class RectanglePrinting {
    public static  int rectanglePrinting(int n, int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value  of n is : ");
        int n = src.nextInt();
        System.out.println("Enter the value of m is ");;
        int m = src.nextInt();
//        Rectangle printing
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("function printing ");
        rectanglePrinting(5,7);


    }
}
