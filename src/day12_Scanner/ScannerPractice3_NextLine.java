package day12_Scanner;
import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming language:");
        String programming = input.nextLine();



        System.out.println("fullName = "+ fullName);
        System.out.println("programming ="+ programming);
        input.close();




    }
}
