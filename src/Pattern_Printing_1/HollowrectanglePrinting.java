package Pattern_Printing_1;

import java.util.Scanner;

public class HollowrectanglePrinting {
    public  static  int hollowRectanglePrinting(int n , int m ){
        for(int i=0;i<=n; i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0 || i==n || j==m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return  0;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        System.out.println("Enter the value  of m is : ");
        int m = src.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || j==m-1 || i==n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Function calling Hollow rectangle printing ");

        hollowRectanglePrinting(n,m);
    }
}
