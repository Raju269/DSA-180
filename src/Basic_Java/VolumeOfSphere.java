package Basic_Java;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius is : ");
        float radius = sc.nextFloat();
        float PI = 3.14f;
        float sphere = (4/3)*(PI*radius*radius*radius);
        System.out.println("The volume of sphere is : "+sphere);
    }
}
