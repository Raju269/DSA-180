package TypeConversion;

public class ExplictConversion {
    public static void main(String[] args) {

//        Double datatypes
        double weigt = 20.44;

//        Explict type casting by forcefully getting
//        data from long datatype to integers type
        long l = (long) weigt;


//        Explict int converted
        int i = (int)l;


        // Print statements
        System.out.println("Double value " + weigt);

        // While printing we will see that
        // fractional part lost
        System.out.println("Long value " + l);

        // While printing we will see that
        // fractional part lost
        System.out.println("Int value " + i);
    }
}
