import java.util.ArrayList;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        char ch = 'a';

//        Autoboxing : char => Characters
        Character c = ch;

        ArrayList<Integer> list = new ArrayList<>();
//        Autoboxing : int => Integers
        list.add(23);
        System.out.println(list.get(0));

//        Unboxing
        Character character = 'a';
//        Unboxing:characters => char
        char ca = ch;

        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(24);
//        Unboxing : Integers => Int
        int num  = list.get(0);

        System.out.println(num);

    }
}
