package Pattern_Printing_1;

import java.util.Scanner;

public class AlphabetSquarePrinting {
    public static int alphabetPrinting(int n){
        for(char i='a';i<='a'+n;i++){
            for(char j='a';j<='a'+n;j++){
                System.out.print((char) j+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public static void main(String[] args) {
      Scanner src = new Scanner(System.in);
        System.out.println("Enter the value  of n is : ");
        int n = src.nextInt();
        alphabetPrinting(n);
    }
}
