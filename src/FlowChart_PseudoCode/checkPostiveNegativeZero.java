package FlowChart_PseudoCode;

import java.util.Scanner;

public class checkPostiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Check the number is Positive , Negative and zero");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number is : ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("This is +ve number "+num);
        } else if (num < 0) {
            System.out.println("This is -ve number "+num);
        }
        else{
            System.out.println("This is zero ");
        }
    }
}
