package AutoBoxingUnboxing;

import java.util.ArrayList;
import java.util.List;

public class AnotherProgram2 {
    public static void main(String[] args) {
//      creating an empty Arraylist of integers type
        List<Integer> list = new ArrayList<Integer>();

//        Adding  the int primitives types value by converting them into Integers wrapper objects

        for(int i=0;i<10;i++){
            System.out.println(
                    list.add(Integer.valueOf(i))
            );
        }
    }
}
