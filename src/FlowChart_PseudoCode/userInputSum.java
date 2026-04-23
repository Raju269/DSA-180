package FlowChart_PseudoCode;

import java.util.Scanner;

public class userInputSum {
    public static void main(String[] args) {
        System.out.println("User input sum ");
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your first number is: ");
        int number1 = sc.nextInt();
         System.out.println("Enter your second number is : ");
        int number2 = sc.nextInt();
        int sum = (number1+number2);
        System.out.println("The sum of two number is :"+sum);
    }
}
