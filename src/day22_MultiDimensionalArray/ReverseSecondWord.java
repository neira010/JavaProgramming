package day22_MultiDimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {


        String sentence = "I love Java";

        String[] words = sentence.split(" ");

        String reverse = "";

        for (int i = words[2].length()-1; i >= 0; i--) {
            reverse += words[2].charAt(i);
        }

        System.out.println(reverse);
        words[2] = reverse;

        System.out.println(Arrays.toString(words));

        String result = "";
        for (String word : words) {
            System.out.println(word + " ");
        }


        System.out.println(result);



    }
}
