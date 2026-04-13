package Operators;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 is : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2 is : ");
        int num2 = sc.nextInt();

        System.out.println(num1&num2);
        System.out.println(num1|num2);
        System.out.println(num1^num2);
        System.out.println(~num2);
        System.out.println(num1<<1);
        System.out.println(num1>>1);
    }

}
