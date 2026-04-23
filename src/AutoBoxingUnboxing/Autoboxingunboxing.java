package AutoBoxingUnboxing;

public class Autoboxingunboxing {
    public static void main(String[] args) {
//        Create an Integers Objects with custom value say it be 10
        Integer i = new Integer(10);
//        unboxing the objects

        int num = i;
//        Print statement
        System.out.println("Value of i is : "+i);
        System.out.println("Value of num is : "+num);

//        Autoboxing to the characters
        Character character = 'a';

//        Auto-Unboxing of characters
        char cha = character;

//        print statement
        System.out.println("value of character is : "+character);
        System.out.println("value of cha is : "+cha);
    }
}
