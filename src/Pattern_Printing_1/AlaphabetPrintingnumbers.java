package Pattern_Printing_1;

import java.util.Scanner;

public class AlaphabetPrintingnumbers {
    public static int numberprintingpattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public static  int differentnumberpriting(int n){
            for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;

    }
    public  static  int alaphabetPrinting(int n){
        for(char i ='A';i<='A'+n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return 0;
    }

    public static int alaphabetseriesPrinting(int n){
        for(int i = 1;i<=n;i++){
            for(char j='A';j<='A'+n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int smallalaphabet(int n){
        for(char i='a'; i<='a'+n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public static  int differentsmallalhabets(int n){
        for(int i=0;i<=n;i++){
            for(char j='a';j<='a'+n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int righttriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(i)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int numbertriangle(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public static  int Alaphabettriangleprint(int n){
        for(int i=1;i<n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;
    }
//    public static int Alphanumerictriangle(int n){
//        for(int i=0;i<n;i++){
//            for(int )
//        }
//    }

    public static int aBcprint(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0) System.out.print((char)+(i+97)+" ");
                else System.out.print((char)+(i+65)+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public  static int reversepatternquestion(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int alaphabeticevenoddquestion(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if(!(i%2==0)) System.out.print(j+" ");
                else System.out.print((char) (j+64) +" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int reversenumberprint123(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return 0;
    }
    public static int reversealaphaticprinting(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print((char)+(j+97)+" ");
            }
            System.out.println();
        }
        return  0;
    }
    public static int hollowrectangleprinting(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||j==0 ||i==n-1 || j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        return 0;
    }
    public static int crossprint(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j || i+j==i || i==n-1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = src.nextInt();
        numberprintingpattern(n);
        System.out.println("---------------------------------------");
        differentnumberpriting(n);
        System.out.println("----------------------------------------");
        alaphabetPrinting(n);
        System.out.println("----------------------------------------");
        alaphabetseriesPrinting(n);
        System.out.println("----------------------------------------");
        smallalaphabet(n);
        System.out.println("---------------------------------------");
        differentsmallalhabets(n);
        System.out.println("---------------------------------------");
        System.out.println("Triangle pattern ");
        righttriangle(n);
        System.out.println("-----------------------------------------");
        numbertriangle(n);
        System.out.println("-----------------------------------------");
        Alaphabettriangleprint(n);
        System.out.println("-----------------------------------------");
        aBcprint(n);
        System.out.println("-------------------------------------------");
        reversepatternquestion(n);
        System.out.println("--------------------------------------------");
        alaphabeticevenoddquestion(n);
        System.out.println("-----------------------------------------------");
        reversenumberprint123(n);
        System.out.println("-----------------------------------------------");
        reversealaphaticprinting(n);
        System.out.println("-----------------------------------------------");
        hollowrectangleprinting(n);
        System.out.println("-----------------------------------------------");
        crossprint(n);
    }
}
