package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Phyton Phyton";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;

        }
        System.out.println(frequency);

        System.out.println("_________________________________________________");

        String sentence = "cat cat cat cat dog dog dog dog cat cat";
        int countCat = 0;

        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }


        System.out.println(countCat);









    }
}
