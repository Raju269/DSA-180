package if_else;

public class ifStatement {
    public static void main(String[] args) {
        System.out.println("If Statement ");
//        if statement
//        if-else statement
//        if-else-if ladder
//        Nested if-else Ternary operator
//        Switch statement

        int age = 18;
        if(age<=18){
            System.out.println("You can vote");
        }
        int dailyPractice = 12 ;
        if(dailyPractice>=10){
            System.out.println("Good consistency ");
        }
        else{
            System.out.println("Your are not consistency ");
        }

//        if-else-if Ladder

        int a = 10 ;
        int b = 20;
        int c = 30;
        if(a>b){
            System.out.println("A is is greater than b ");
        }
        else{
            if(b>c){
                System.out.println("B is greater than c");
            }
            else{
                System.out.println("C is greater than A and B ");
            }
        }
//        Nested if-else

        boolean isSubsciptionMember = true;
        int isCompleteTarget = 200;
        if(isSubsciptionMember){
            if(isCompleteTarget>=400){
                System.out.println("Unlock Advanced sheet ");
            }
            else{
                System.out.println("Practice more Problem question ");
            }

        }
        else{
            System.out.println("Purchase the Membership ");
        }

//        Ternary Operator question
            int steadkDay = 15;
            String status = (steadkDay>=30) ? "you are good":"Your not good try to be consistency";
        System.out.println(status);


//        Switch case
                    int dayNumber =3;
        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
        }

    }
}
