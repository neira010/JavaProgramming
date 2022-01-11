package day2_12_11_2021;

import java.util.Scanner;

public class RotateLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one word");
        String word = scanner.next();

        //String word = "Hello";
        String temp = word.substring(2)+word.substring(0,2);
        System.out.println("temp = " + temp);

        String temp2 = "";

        for (int i = 2; i < word.length() ; i++) {
            temp2+=word.charAt(i);
        }


        for (int i = 0; i < 2; i++) {
            temp2+=word.charAt(i);

        }


        System.out.println("temp2 = " + temp2);
        scanner.close();
    }
}
