package InputOutput;

import java.util.Scanner;

public class UserInputValue {
    public static void main(String[] args) {
        System.out.println("User input value ");
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your name is : ");
//        String Name = sc.nextLine();
//        System.out.println(Name);
//        System.out.print()
//        System.out.println()
//        System.out.printf()
//        Scanner class (for input)
         System.out.println("Step 1: Learn");
        System.out.println("Step 2: Practice");

        System.out.print("Phase A ");
        System.out.print("Phase B");
        System.out.println();

        String studentName = "Aman";
        int solvedProblems = 150;

        System.out.printf("Student: %s, Problems Solved: %d", studentName, solvedProblems);
        System.out.println();
         System.out.print("Enter accuracy percentage: ");
        float accuracy = sc.nextFloat();

        System.out.print("Enter platform name: ");
        String platform = sc.next();

        System.out.println("Accuracy: " + accuracy);
        System.out.println("Platform: " + platform);

        sc.close();
    }
}
