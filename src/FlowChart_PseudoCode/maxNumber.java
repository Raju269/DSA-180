package FlowChart_PseudoCode;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        System.out.println("Max number");
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n1 is : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the value of n2 is : ");
        int n2 = sc.nextInt();
        if(n1<n2){
            System.out.println("n2 is max ");
        }
        else{
            System.out.println("n1 is max ");
        }

    }
}
