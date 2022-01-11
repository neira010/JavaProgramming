package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println( num1 < 0 ); //false
        System.out.println( num2 < 0 ); //true


        int a = 5;
        ++a; // pre increment : increases the value by 1 right away
        System.out.println(a); //6

        --a;  //pre decrement : decrease value by 1
        System.out.println(a);


        int b = 100;
        System.out.println(++b);  //pre increment: increase value by 1


        int c = 100;
        System.out.println(c++);  // post increment: first passes the current value,then increases value by 1
        System.out.println(c); //101


int x = 200;
        System.out.println(--x);  // pre decrement: first passes the current value then decrease the value by 1
        System.out.println( x );  //199
        System.out.println("----------------------------------------");

        int z = 45;
        System.out.println(++z);  //46,  z=46
        System.out.println(--z);

    }
}
