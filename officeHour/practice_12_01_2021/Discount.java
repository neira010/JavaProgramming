package practice_12_01_2021;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quantity");
        int quantity=input.nextInt();
        double unitPrice=100;
        double totalCost= quantity*unitPrice;
        double discountRate=0.1;
        double totalDiscount;

        if (totalCost>=1000){
            totalDiscount=discountRate*totalCost;
            System.out.println("You will get a discount of "+totalDiscount+" and your total will be "+(totalCost-totalDiscount));
        }else{
            System.out.println("No discount applied");
        }










    }
}
