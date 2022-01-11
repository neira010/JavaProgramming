package practice_12_08_2021;

import java.util.Scanner;

public class DonateBlood {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("Enter your weight:");
        int weight = input.nextInt();

        if (age>=18 && weight >= 50){
            if (weight > 50){
                System.out.println("You are eligible to donate blood");
            }else{
                System.out.println("You are not eligible");
            }
        }else{
            System.out.println("Age must be greater than 18");
        }


        // ternary

        System.out.println("__________TERNARY__________");


        String result = (age>=18)?(weight>50)?"You are eligible to donate blood" : "You are not eligible to donate blood" : "Age must be gretaer than 18";







    }
}
