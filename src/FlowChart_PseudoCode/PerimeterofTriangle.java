package FlowChart_PseudoCode;

import java.util.Scanner;

public class PerimeterofTriangle {
    public static void main(String[] args) {
        System.out.println("Calculate the Perimeter of triangle");
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
         System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();
         System.out.println("Enter the value of q is : ");
        int q = sc.nextInt();

        int Perimeter = (n+m+q);
        System.out.println("The perimeter of trianlge "+Perimeter);

    }
}
