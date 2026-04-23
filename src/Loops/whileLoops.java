package Loops;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        System.out.println("While loops ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n is : ");
        int n = sc.nextInt();
//        int i = 0;
//        while(i<=n){
//            System.out.println("Hello Raju bhai ");
//            i++;
//        }
//
//        int i = 0;
//        while(i<=n){
//            if(i%2==1){
//                System.out.println("This is odd number"+i);
//
//            }
//            i++;
//        }
//        table print
        int i = 0;
        while(i<=n){
            System.out.print(i*n+" ");
            i++;
        }

    }
}
