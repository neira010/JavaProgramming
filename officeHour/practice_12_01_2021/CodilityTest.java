package practice_12_01_2021;

public class CodilityTest {
    public static void main(String[] args) {


        /*
        Write a function:
                       that, given a positive integer N  However, any number divisible by 2, 3 or 5 shouldbe replaced by the word

                         Codility -- 2
                         MyInterface     -- 3
                         Coders   -- 5

                    - If a number is divisible by more than one of the numbers:2,3 or 5, it should be replaced by a
                      concatenation of the respective words Codility, MyInterface and Coders in this given order.

                        EXPECTED

                           numbers divisible by both 2 and 3 should be replacée by CodilityTest

                                INPUT : 6    OUTPUT :  CodilityTest

                           numbers divisible by allthree numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
                                INPUT : 15    OUTPUT :  CodilityTestCoders
         */
        String str= "abc";
        str = "def";
        System.out.println(str);

        int number = 45;
        String result = "";

        if (number % 2 == 0){
            result += "Codility";
        }

        if (number % 3 == 0){
            result += "Test";
        }

        if (number % 5 == 0){
            result += "Coders";
        }

        System.out.println("result ="+result);







    }
}
