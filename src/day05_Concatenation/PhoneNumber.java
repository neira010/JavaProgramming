package day05_Concatenation;

public class PhoneNumber {


    public static void main(String[] args) {
        int countryCode = 1;
        int areaCode = 512;
        int localNumber = 7664839;

        String fullPhoneNumber = ("+" + countryCode + areaCode + "-" + localNumber);
        System.out.println(" + " + countryCode  + "(" + areaCode + ")" + "-" +  localNumber ) ;


        /*
        1. create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

                 +1(703)-4512625

         */

    }
}
