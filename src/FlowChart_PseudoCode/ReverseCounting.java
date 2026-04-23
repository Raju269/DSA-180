package FlowChart_PseudoCode;

import java.util.Scanner;

public class ReverseCounting {
    public static void main(String[] args) {
        System.out.println("Print Reverse couting ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.print(i+" ");
        }
    }
}
