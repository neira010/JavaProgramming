package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
       /*
       letters[0] = 'A';
        letters[1] = 'B';
        */

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length ; i++) {
            letters[j]=i;
        }
        System.out.println(Arrays.toString(letters));  //[A~Z]
        System.out.println("________________________________________________________________");

        char ch = 'A';
        for (int i = 0; i < letters.length ; i++, ch++) {
            letters[i]= ch;

        }

        System.out.println(Arrays.toString(letters));
        System.out.println("_______________________________");
        int num1 = 5;
        int num2 = num1++;
        System.out.println(num1);







    }
}
