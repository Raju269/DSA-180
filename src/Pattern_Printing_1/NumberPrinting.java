package Pattern_Printing_1;

import java.util.Scanner;

public class NumberPrinting {
    public static int numberPrinting(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return  0;
    }

    public static  int numberPrintingwithdifferntnumber(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
//        System.out.println("Enter the value of m is : ");
//        int m = src.nextInt();
//        function calling
        numberPrinting(n);
        System.out.println("different function calling and different value ");
        numberPrintingwithdifferntnumber(n);
    }
}
