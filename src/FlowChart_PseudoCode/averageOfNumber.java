package FlowChart_PseudoCode;

import java.util.Scanner;

public class averageOfNumber {
    public static void main(String[] args) {
        System.out.println("The average of 3 number ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number ");
        int num2 = sc.nextInt();
        System.out.println("Enter your third number ");
        int num3 = sc.nextInt();
        int average = (num1+num2+num3)/3;
        System.out.println("The average of 3 number is :"+average);

    }
}
