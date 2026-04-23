package TypeConversion;

public class BytesConversion {
    public static void main(String[] args) {
//      Declaring the bytes variables
        byte b;

//        Declaring and initializing integers and double
        int i = 234;
        double d = 34.343d;

//        display message
        System.out.println("Conversion of int to bytes ");

//        i % 256;
        b = (byte)i;

//        print commands
        System.out.println("i = " + i + " b = " + b);
        System.out.println(
            "\nConversion of double to byte.");


//        d%256;
        b = (byte)d;

        // Print commands
        System.out.println("d = " + d + " b= " + b);

    }
    }

