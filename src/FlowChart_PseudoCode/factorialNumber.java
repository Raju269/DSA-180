package FlowChart_PseudoCode;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {
        System.out.println("Factorial number");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the factorial number is ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial is : "+fact);
    }
}
