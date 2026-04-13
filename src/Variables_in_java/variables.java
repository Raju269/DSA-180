package Variables_in_java;
//this is class
 class Car{
            String model;
            int year ;

            Car(String model, int year){
                this.model = model;
                this.year = year;

            }
            void display (){
                System.out.println(model+" "+year);
            }
        }
        interface Animal{
     void sound();
        }
        class Dog implements Animal{
     public  void  sound(){
         System.out.println("woof");
     }
        }
public class variables {

    public static void main(String[] args) {
        int studentAge = 12;
        System.out.println("datatype is "+studentAge);
        float moneysaving = 45.233f;
        System.out.println("float datatypes is : "+moneysaving);
        double bigAmoutValue = 23434.3434d;
        System.out.println("double datattype is : "+bigAmoutValue);
        char symbolsValue = 'A';
        System.out.println("char datatype is : "+symbolsValue);

        boolean isVerifed = true;
        boolean isLoggined = false;
        System.out.println(isLoggined);
        System.out.println(isVerifed);

        byte smallValue = 123;
        System.out.println(smallValue);

        char characterValue = 'B';
        System.out.println(characterValue);

        short OTPValue = 2341;
        System.out.println(OTPValue);

        int balanceAmout = 3243;
        System.out.println(balanceAmout);

        long speedOfLight = 3541234567l;
        System.out.println(speedOfLight);


        float missExpensive = 234.22f;
        System.out.println(missExpensive);

        double roundAmout = 23.23444d;
        System.out.println(roundAmout);

        String name = "Raju kumar ";
        System.out.println(name);
//        Class
       Car myCar = new Car("Toyota", 2020);
       myCar.display();

//       Objects
        Car yourcar = new Car("Honda",2022);
        System.out.println("Model" +yourcar.model);
        System.out.println("Year"+yourcar.year);

//        interface
        Animal dog = new Dog();
        dog.sound();

//        Array
        int[] number = {1,2,3,4,5};
        for(int i=0;i<number.length;i++){
            System.out.print(i+" ");
        }
    }
}
