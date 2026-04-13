package Basic_Java;

import java.util.Scanner;

public class SquareofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        float n = sc.nextFloat();
        float square = n*n;
        System.out.println("square of number is : "+square);
    }
}
