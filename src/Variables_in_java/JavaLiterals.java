package Variables_in_java;

public class JavaLiterals {
    public static void main(String[] args) {
        System.out.println("Java Literals ");
//        Integer Literals
//Integer literals represent whole numbers.
//
//Java supports 4 formats:
//
//1️⃣ Decimal (Base 10)
        int enrolledStudents = 250;
        System.out.println(enrolledStudents);
//        2️⃣ Binary (Base 2)

    int accessMask = 0b10101;
        System.out.println(accessMask);
//        3️⃣ Octal (Base 8)
int filePermission = 075;
//Leading 0 indicates octal.
        System.out.println(filePermission);

//4️⃣ Hexadecimal (Base 16)

int themeColor = 0xFF;
//0x indicates hexadecimal.
        System.out.println(themeColor);

//        Your contest rating
//Total problems solved
//Platform subscription status
//Your name

        int rating = 7;
        System.out.println(rating);

        float problemSolved = 22f;
        System.out.println(problemSolved);

        boolean Subscription = true;
        System.out.println(Subscription);

        String name = "Raju";
        System.out.println(name);

    }

}
