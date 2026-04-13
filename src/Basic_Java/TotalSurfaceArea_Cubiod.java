package Basic_Java;

import java.util.Scanner;

public class TotalSurfaceArea_Cubiod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Length is : ");
        float length = sc.nextFloat();
        System.out.println("Enter the value of breadth is : ");
        float breadth = sc.nextFloat();
        System.out.println("Enter the value of height is : ");
        float height = sc.nextFloat();

        float TSA = 2*(length*breadth + length*height + breadth*height);
        System.out.println("Total surface area of cubiod is "+TSA);
    }
}
