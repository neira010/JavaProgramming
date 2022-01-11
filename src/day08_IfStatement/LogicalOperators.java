package day08_IfStatement;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 17;
        String citizen = "USA";

        boolean isEligible = age >= 18  &&  citizen == "USA";
        System.out.println(name + " is eligible to vote: " + isEligible);

        String name2 = "Josh";
        int creditScore = 620;
        int age2 = 3;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21;
        System.out.println(name2+ " is eligible for loan : " + isEligible);

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        //                    21 >=18  &&  ('F'  == 'M'  //   'F'  == 'F'
        System.out.println(name3+ " is eligible to register :" + isEligible3);



        String student = "Breanna";
        double gpa = 2.5;
        int familyIncome = 400000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        boolean result2 = true;
        System.out.println("result2 = " + result2);






    }
}
