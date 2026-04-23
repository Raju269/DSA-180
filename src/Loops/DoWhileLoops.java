package Loops;

public class DoWhileLoops {
    public static void main(String[] args) {

        int revisionRound = 1;

        do {
            System.out.println("Revision Round: " + revisionRound);
            revisionRound++;
        } while (revisionRound <= 3);
//
        int number = 10 ;
        do{
            System.out.println("count number "+number);
            number++;
        }while (number<15);
    }
}
