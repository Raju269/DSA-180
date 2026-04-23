package Loops;

import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        System.out.println("Print 1 to 5 number ");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n is : ");
//        int number  = sc.nextInt();
//        for(int i=0;i<=number;i++){
//            System.out.println(i+" ");
//        }
//        Print the even number
          System.out.println("Enter the value of n is : ");
        int number2  = sc.nextInt();
        for(int i=0;i<=number2;i++){
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
//      Print the message 3 times
        for(int i=0;i<=number2;i++){
            System.out.println("Keep practice with CodeHelp One");
        }

    }
}
