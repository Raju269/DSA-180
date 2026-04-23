package FlowChart_PseudoCode;

import java.util.Scanner;

public class halfOfNumber {
    public static void main(String[] args) {
        System.out.println("Half of number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number is : ");
        int num1 = sc.nextInt();
        int half = num1/2;
        System.out.println("The half of number is : "+half);
    }
}
