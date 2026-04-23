package FlowChart_PseudoCode;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        System.out.println("Calculated Area of Rectangle ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length is : ");
        float length = sc.nextFloat();
        System.out.println("Enter the value of breadth is : ");
        float breadth = sc.nextFloat();
        float area = (length*breadth);
        System.out.println("the area of rectangle is : "+area);
    }
}
