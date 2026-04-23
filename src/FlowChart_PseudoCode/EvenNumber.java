package FlowChart_PseudoCode;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Print event number ");
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

          if(i%2==0){
              System.out.print(i+" ");
          }
        }
    }
}
