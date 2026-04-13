package Operators;

public class Unary_operators {
    public static void main(String[] args) {
        int activeUser = 100;
        int postfix = activeUser++;
        System.out.println(postfix);
        int prefix = ++activeUser;
        System.out.println(prefix);

        int negativeUser = 22;
        int belowReview = negativeUser--;
        System.out.println(belowReview);
        int aboveReview = --negativeUser;
        System.out.println(aboveReview);

    }
}
