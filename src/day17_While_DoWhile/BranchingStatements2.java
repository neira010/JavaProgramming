package day17_While_DoWhile;

import jdk.swing.interop.SwingInterOpUtils;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {
            if (i == 'C'){
                continue;
            }
            System.out.println(i);  //A B D E

        }
        System.out.println("___________________________________________________________");

        //print all even numbers between 1 ~ 10
        for (int i = 1; i < 11 ; i++) {
            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("_____________________________________________________________");

        //print all odd numbers between 1 ~ 10
        for (int i = 1; i < 11; i++) {
            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }















    }
}
