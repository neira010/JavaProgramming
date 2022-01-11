package day13_StringClass;
import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phone = input.nextLong();

        System.out.println("Enter your zip code:");
        int code = input.nextInt();

        input.nextLine();

        System.out.println("Enter your School name:");
        String name = input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();


        System.out.println("Enter your State name:");
        String state = input.next();

        System.out.println("Enter your building number:");
        int building = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        input.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender:"+gender);
        System.out.println("Phone number:"+phone);
        System.out.println("Address: \nt"+building+" "+streetName+"\n\t"+city+", "+state+ " "+ code);
        System.out.println("School name: "+name);
    }
}
