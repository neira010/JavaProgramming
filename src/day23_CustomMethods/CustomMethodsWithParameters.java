package day23_CustomMethods;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {

        oddOrEven(8);  //the method demands additional info to complete its task
        ageOfOPerson(1994);
        printNumbers(56, 77);
    }


    //create a function that can check if a number is odd or even
    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number +" is even number");
        }else{
            System.out.println(number +" is odd number");
        }


    }


    //create a function that can display the age of the person
    public static void ageOfOPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: "+ age);
    }

    //print all numbers between x and y
    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);
        }
    }
}
