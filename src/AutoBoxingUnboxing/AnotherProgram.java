package AutoBoxingUnboxing;

import java.util.ArrayList;

public class AnotherProgram {
    public static void main(String[] args) {
//      creating an empty arraylist of integers type
        ArrayList<Integer> al = new ArrayList<>();

//        Adding the int primitives types value using add() methods Autoboxing
        al.add(10);
        al.add(20);
        al.add(230);

//        Printing the ArrayList element
        System.out.println("Arraylist : "+al);

    }
}
