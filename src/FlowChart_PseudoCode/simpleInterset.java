package FlowChart_PseudoCode;

import java.util.Scanner;

public class simpleInterset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcualted the simple interested ");
        System.out.println("Enter the value of Principal ");
        float prin = sc.nextFloat();
        System.out.println("Enter the value of Interest ");
        float Inter = sc.nextFloat();
        System.out.println("Enter the value of Rate ");
        float Rate = sc.nextFloat();
        float simpleInterested = (prin*Inter*Rate)/100;
        System.out.println("Simple Interested is"+simpleInterested);
    }
}
