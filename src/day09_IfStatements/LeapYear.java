package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear){
            System.out.println("Year "+year+" is a leap year");
        }

        if (!leapYear){
            System.out.println("Year "+year+"is not a leap year");
        }

        System.out.println("__________________________________________________________");

        if (leapYear){
            System.out.println("Year "+year+" is a leap year");
        }else{
            System.out.println("Year "+year+" is not a leap year");
        }
    }
}
