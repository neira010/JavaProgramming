package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        for (int i=65; i<= 90; i++){
            System.out.print((char)i+" ");
        }

        System.out.println();
        System.out.println("_______________________________________________________");

        for (char i='A'; i<= 'Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("_________________________________________________________");

        for (char i='a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("____________________________________________________________");

        for (char i='z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("__________________________________________________________");
        for (char i = 1; i <= 40000; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("_____________________________________________");

    }
}
