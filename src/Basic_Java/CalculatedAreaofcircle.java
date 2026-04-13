package Basic_Java;

import java.util.Scanner;

public class CalculatedAreaofcircle {
    public static void main(String[] args) {
        System.out.println("Calculate the area of circle ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius is ");
        float radius = sc.nextFloat();
        float PI = 3.14f;
        float area = (PI*radius*radius);
        System.out.println("Area of circle is : "+area);

    }

}
