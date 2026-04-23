package Basic_Java;

import java.util.Scanner;

public class SwapNumberOneLineMethod {
    public static void main(String[] args) {
        System.out.println("Swap two number code");
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of num1 is :");
        int num1 = src.nextInt();
        System.out.println("Enter the value of num2 is :");
        int num2 = src.nextInt();
        System.out.println("The value of num1 is : "+num1);
        System.out.println("The value of num2 is : "+num2);
//        logic part
        num2 = num1+num2 - (num1=num2);
        System.out.println("The value of num1 is : "+num1);
        System.out.println("The value of num2 is : "+num2);
    }
}
