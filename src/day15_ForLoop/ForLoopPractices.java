package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++){  //i-15 16 17 18 19...45
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("Hello World!");

        System.out.println("___________________________________________________________");

        //100 99 98 97 96.. 50
        for (int i = 100; i >= 50; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");


        System.out.println("____________________________________________________________");

        for (int i = 1; i <=55; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("___________________________________________________________");

        for (int i=2; i<=54; i+=2){
            System.out.print(i +" ");
        }











    }
}
